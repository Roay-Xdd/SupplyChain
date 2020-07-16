package com.qtummatrix.controller;


import com.qtummatrix.bean.F_customerDetail;
import com.qtummatrix.server.F_customerDetailservice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("customer")
public class F_customerDetailController {
    @Resource
    private F_customerDetailservice cdc;

    /**
     * 根据店铺id查询客户详情
     * @param id
     * @return
     */
    //    解决跨域请求
//    @CrossOrigin(allowCredentials = "true",allowedHeaders = "*",
//    methods = {RequestMethod.DELETE,RequestMethod.GET,
//            RequestMethod.POST,RequestMethod.PUT,RequestMethod.HEAD},origins="*")
    @GetMapping("/getById")
    public Map<String,Object> getF_customerDetailById(@RequestParam("id")  Integer id){
        System.out.println("输出id"+id);
        Map map = new HashMap();
        List<F_customerDetail> f_customerDetail = cdc.getF_customerDetailById(id);
        map.put("list",f_customerDetail);
        System.out.println(map);
        return map;
    }
}
