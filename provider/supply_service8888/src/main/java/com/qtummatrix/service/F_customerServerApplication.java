package com.qtummatrix.service;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName F_customerServerApplication
 * @Description TODO
 * @Author fyz
 * @Date 2020/7/10 10:27
 * @Version 1.0
 */
@Component
public class F_customerServerApplication implements F_customerGet{

    /**
     * @方法描述: 查询所有的熔断方法
     * @Author panwenlong
     * @Date 10:44 2020/7/10
    **/
     @Override
    public Map<String, Object> getF_customerDetailById(Integer id) {
        System.out.println("id为"+id+"的用户查询失败");
        Map<String,Object> param = new HashMap<>();
        param.put("product",null);
        param.put("message","id为"+id+"的用户查询失败");
        return param;
    }

}
