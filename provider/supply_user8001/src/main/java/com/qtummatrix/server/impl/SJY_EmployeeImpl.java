package com.qtummatrix.server.impl;

import com.qtummatrix.SjyBean.RedisFeignClient;
import com.qtummatrix.SjyBean.SupplyResult;
import com.qtummatrix.entity.SysEmployee;
import com.qtummatrix.mapper.SJY_SysEmployeeMapper;
import com.qtummatrix.server.SJY_Employee;
import com.qtummatrix.util.CookieUtils;
import org.springframework.beans.factory.annotation.Autowired;
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
public class SJY_EmployeeImpl implements SJY_Employee {


    @Autowired(required = false)
    private SJY_SysEmployeeMapper sjySysEmployeeMapper;

    private RedisFeignClient redisFeignClient;


    /**
     * 方法描述: 员工登陆，加载到缓存
     * @Author: Shi JiuYue
     * @Date 20:55 2020/7/7
     **/
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



        //将用户存入到redis中,并且设置过期时间为一天
        redisFeignClient.setToRedis(token,sysEmployee,new Long(60*60*24));

        //添加cookie，cookie的有效期是关闭浏览器失效
        CookieUtils.setCookie(request,reponse,"Supply_TOKEN",token);

        return SupplyResult.ok(token);
    }


    /**
     * 方法描述: 员工根据手机号修改密码
     * @Author: Shi JiuYue
     * @Date 17:43 2020/7/7
     **/
    @Override
    public SupplyResult updateEmployeePassword(String tel, String newPassword) {

        //status返回的是修改了几行数据
        int status = sjySysEmployeeMapper.updatePassword(tel,newPassword);

        if(status==1){
            return SupplyResult.build(200,"修改成功");
        }

        return SupplyResult.build(500,"修改失败");
    }
}
