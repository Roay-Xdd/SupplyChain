package com.qtummatrix.controller;

import com.qtummatrix.service.PWL_ClientListServer80;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
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
@RequestMapping("api/user")
public class PWL_ClientListController {

    @Resource
    private PWL_ClientListServer80 pwl_clientListServer80;

    @RequestMapping("getClientListByToken")
    @ResponseBody
    public Map<String,Object> getClientListByToken(String token){
        Map map = new HashMap();
        map = pwl_clientListServer80.getClientListByToken(token);
        return  map;
    }

    @RequestMapping("getClientListBy")
    @ResponseBody
    public Map<String,Object> getClientListBy(String warehouseCode, String businessName){
        Map map = new HashMap();
        map = pwl_clientListServer80.getClientListBy(warehouseCode, businessName);
        return  map;
    }

}
