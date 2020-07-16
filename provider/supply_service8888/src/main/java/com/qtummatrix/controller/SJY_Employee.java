package com.qtummatrix.controller;

import com.qtummatrix.service.PWL_ClientListServer80;
import com.qtummatrix.util.SupplyResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 功能描述：
 *
 * @Author: Shi JiuYue
 * @Date: 2020/7/16 14:50
 */
@Controller
@RequestMapping("api/employee")
public class SJY_Employee {

    @Resource
    private PWL_ClientListServer80 pwl_clientListServer80;

    /*
     * 方法描述: 员工登录
     * @Author: Shi JiuYue
     * @Date 14:52 2020/7/16
     **/
    @RequestMapping("/EmployeeLogin")
    @ResponseBody
    public SupplyResult EmployeeLogin(String username, String password
                                      ){
        SupplyResult supplyResult = pwl_clientListServer80.EmployeeLogin(username, password);
        return supplyResult;
    }



}
