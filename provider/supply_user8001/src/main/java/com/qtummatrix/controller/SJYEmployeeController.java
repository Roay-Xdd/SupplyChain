package com.qtummatrix.controller;

import com.qtummatrix.SjyBean.SupplyResult;
import com.qtummatrix.server.SJY_Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 功能描述：员工Controller层   对应entity：SysEmployee
 *
 * @Author: Shi JiuYue
 * @Date: 2020/7/7 17:16
 */
@Controller
@RequestMapping("/employee")
public class SJYEmployeeController {


    @Autowired
    private SJY_Employee sjyEmployee;


    /**
     * 方法描述: 员工登录 获取token
     * @Author: Shi JiuYue
     * @Date 17:20 2020/7/7
     **/
    //    解决跨域请求
//    @CrossOrigin(allowCredentials = "true",allowedHeaders = "*",
//        methods = {RequestMethod.DELETE, RequestMethod.GET,
//                RequestMethod.POST,RequestMethod.PUT,RequestMethod.HEAD},origins="*")
    @PostMapping("/EmployeeLogin")
    @ResponseBody
    public SupplyResult EmployeeLogin(@RequestParam("username")String username,
                                                          @RequestParam("password")String password){

        SupplyResult supplyResult = sjyEmployee.selectEmployee(username, password);

        return supplyResult;
    }


    /**
     * 方法描述: 根据tel修改员工密码
     * @Author: Shi JiuYue
     * @Date 17:50 2020/7/7
     **/
    public SupplyResult EmployeeUpdatePassword(String tel,String newPassword){

        SupplyResult supplyResult = sjyEmployee.updateEmployeePassword(tel, newPassword);

        return supplyResult;
    }





}
