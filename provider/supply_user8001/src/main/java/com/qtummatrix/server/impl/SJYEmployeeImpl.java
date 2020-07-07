package com.qtummatrix.server.impl;

import com.qtummatrix.SjyBean.SupplyResult;
import com.qtummatrix.entity.SysEmployee;
import com.qtummatrix.mapper.SJYSysEmployeeMapper;
import com.qtummatrix.server.SJYEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 功能描述：员工操作service实现类
 *
 * @Author: Shi JiuYue
 * @Date: 2020/7/7 15:14
 */
@Service
@Transactional
public class SJYEmployeeImpl implements SJYEmployee {


    @Autowired(required = false)
    private SJYSysEmployeeMapper sjySysEmployeeMapper;


    @Override
    public SupplyResult selectEmployee(String tel, String password,
    HttpServletRequest request, HttpServletResponse reponse) {

        SysEmployee sysEmployee = sjySysEmployeeMapper.selectByTel(tel);
        if (sysEmployee==null||sysEmployee.equals("")){
            return SupplyResult.build(500,"用户名或密码错误");
        }
        if(!sysEmployee.getPassword().equals(password)){
            return SupplyResult.build(500,"用户名或密码错误");
        }
        //密码匹配，清空密码（安全）
        sysEmployee.setPassword(null);
        String token = sysEmployee.getToken();


        return null;
    }

    @Override
    public SupplyResult updateEmployeePassword(String tel, String newPassword) {
        return null;
    }
}
