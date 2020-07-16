package com.qtummatrix.controller;

import com.qtummatrix.service.F_customerGet;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * F_customerController
 */

@Controller
@RequestMapping("/customer")
public class F_customerController {

    @Resource
    private F_customerGet f_8001customerget;

    @RequestMapping("getById")
    @ResponseBody
    public Map<String,Object> getClientListByToken(Integer id){
        Map map = new HashMap();
        map = f_8001customerget.getF_customerDetailById(id);
        return  map;
    }


}
