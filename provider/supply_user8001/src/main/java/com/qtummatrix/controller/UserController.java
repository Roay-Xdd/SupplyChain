package com.qtummatrix.controller;


import com.qtummatrix.entity.BmMember;
import com.qtummatrix.server.XD_UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("user")
@RestController
public class UserController {



    @Autowired
    private XD_UserService xd_userService;
    /**
     * @Antour 谢东
     *  添加商户
     * @return
     */
    @RequestMapping("adduser")
    public int addUser(BmMember bmMember){
        System.out.println("添加商户为："+bmMember);
        return xd_userService.addUser(bmMember);
    }





}
