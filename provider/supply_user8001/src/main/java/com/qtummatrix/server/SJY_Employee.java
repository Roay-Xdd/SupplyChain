package com.qtummatrix.server;

import com.qtummatrix.SjyBean.SupplyResult;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 功能描述：员工service层接口
 *
 * @Author: Shi JiuYue
 * @Date: 2020/7/7 15:09
 */
public interface SJY_Employee {

    /**
     * 方法描述: 员工根据手机号和密码登陆
     * @Author: Shi JiuYue
     * @Date 15:12 2020/7/7
     **/
    public SupplyResult selectEmployee(String tel, String password,
    HttpServletRequest request, HttpServletResponse reponse);

    /**
     * 方法描述: 员工根据手机号修改密码
     * @Author: Shi JiuYue
     * @Date 15:14 2020/7/7
     **/
    public SupplyResult updateEmployeePassword(String tel,String newPassword);


    /**
     * 方法描述: 员工推出，删除缓存
     * @Author: Shi JiuYue
     * @Date 14:55 2020/7/13
     **/
    public SupplyResult LogOutEmployee(String token);


}
