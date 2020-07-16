package com.qtummatrix.controller;

import com.qtummatrix.service.PWL_ClientListServer80;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName PWL_ClientListController
 * @Description TODO
 * @Author 潘文龙
 * @Date 2020/7/10 10:25
 * @Version 1.0
 */

@Controller
@RequestMapping("api/PWL_ClientList")
public class PWL_ClientListController {

    @Resource
    private PWL_ClientListServer80 pwl_clientListServer80;
/**
 * @方法描述: 根据员工手机号获取仓库编号获取所有与之建立合作的店铺信息
 * @Author panwenlong
 * @Date 10:33 2020/7/15
**/
    @RequestMapping("getClientListByToken")
    @ResponseBody
    public Map<String,Object> getClientListByToken(String token){
        Map map = new HashMap();
        map = pwl_clientListServer80.getClientListByToken(token);
        return  map;
    }
/**
 * @方法描述: 根据仓库编号与店铺名称查询
 * @Author panwenlong
 * @Date 10:33 2020/7/15
**/
    @RequestMapping("getClientListBy")
    @ResponseBody
    public Map<String,Object> getClientListBy(String warehouseCode, String businessName){
        Map map = new HashMap();
        map = pwl_clientListServer80.getClientListBy(warehouseCode, businessName);
        return  map;
    }

    /**
     * @方法描述: 根据仓库编号查询没有与之建立合作关系的店铺
     * @Author panwenlong
     * @Date 10:33 2020/7/15
    **/
    @ResponseBody
    @RequestMapping("getClientListByWarehouseCode")
    public Map getClientListByWarehouseCode (String warehouseCode){
        Map map = new HashMap();
        map = pwl_clientListServer80.getClientListByWarehouseCode(warehouseCode);
        return  map;
    }

    /**
     * @方法描述: 建立新合作关系
     * @Author panwenlong
     * @Date 10:34 2020/7/15
    **/
    @ResponseBody
    @RequestMapping("addCooperation")
    public Map addCooperation(Integer id,String warehouseCode){
        Map map = new HashMap();
        map = pwl_clientListServer80.addCooperation(id, warehouseCode);
        return  map;
    }

}
