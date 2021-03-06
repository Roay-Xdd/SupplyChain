package com.qtummatrix.controller;

import com.qtummatrix.bean.PWL_ClientList;

import com.qtummatrix.server.PWL_ClientListServer;


import com.qtummatrix.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName ClientListController
 * @Description TODO
 * @Author 潘文龙
 * @Date 2020/7/7 14:07
 * @Version 1.0
 */
@Controller
@RequestMapping("api/clientList")
public class PWL_ClientListController {

    @Resource
    private PWL_ClientListServer clientListServer;

    @Resource
    private RedisUtil redisUtil;

    /**
     * @方法描述: 根据员工手机号获取仓库编号获取所有与之建立合作的店铺信息
     * @Author panwenlong
     * @Date 15:01 2020/7/7
    **/
    @GetMapping("getClientListByTel")
    @ResponseBody
    public Map<String,Object> getClientListByToken(@RequestParam("token") String token){
        Map map = new HashMap();
//      通过token获取电话号
//        SysEmployee sysEmployee = (SysEmployee) redisUtil.get(token);
//        String tel = sysEmployee.getTel();
        String tel = "13698880518";
        List<PWL_ClientList> clientLists = clientListServer.getClientListByTel(tel);
        String warehouseCode = null;
        for (PWL_ClientList clientList : clientLists) {
            warehouseCode = clientList.getWarehouseCode();
        }
        map.put("warehouseCode",warehouseCode);
        map.put("list",clientLists);
        return map;
    }

    /**
     * @方法描述: 根据仓库编号与店铺名称查询（模糊查询）
     * @Author panwenlong
     * @Date 15:02 2020/7/7
    **/
    @RequestMapping("getClientList")
    @ResponseBody
    public Map<String,Object> getClientList(@RequestParam("warehouseCode") String warehouseCode,
                                            @RequestParam("businessName") String businessName){
        Map map = new HashMap();
        List<PWL_ClientList> clientLists = clientListServer.getClientList(warehouseCode, businessName);
        map.put("list",clientLists);
        return map;
    }

    /**
     * @方法描述: 根据仓库编号查询没有与之建立合作关系的店铺
     * @Author panwenlong
     * @Date 10:30 2020/7/15
    **/
    @ResponseBody
    @RequestMapping("getClientListByWarehouseCode")
    public Map getClientListByWarehouseCode (@RequestParam("warehouseCode") String warehouseCode){
        Map map = new HashMap();
        List<PWL_ClientList> clientLists = clientListServer.getClientListByWarehouseCode(warehouseCode);
        map.put("store",clientLists);
        return map;
    }

    /**
     * @方法描述: 建立新合作关系
     * @Author panwenlong
     * @Date 10:30 2020/7/15
    **/
    @ResponseBody
    @RequestMapping("addCooperation")
    public Map addCooperation(@RequestParam("id") Integer id,
                              @RequestParam("warehouseCode") String warehouseCode){
        Map map = new HashMap();
        Integer result = clientListServer.addCooperation(id, warehouseCode);
        if (result == 1){
            map.put("message","添加成功");
        }else {
            map.put("message","添加失败");
        }
        return map;
    }


}
