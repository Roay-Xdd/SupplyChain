package com.qtummatrix.service;

import com.qtummatrix.util.SupplyResult;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName PWL_ClientListServerApplication
 * @Description TODO
 * @Author 潘文龙
 * @Date 2020/7/10 10:27
 * @Version 1.0
 */
@Component
public class PWL_ClientListServerApplication implements PWL_ClientListServer80 {

    /**
     * @方法描述: 查询所有的熔断方法
     * @Author panwenlong
     * @Date 10:44 2020/7/10
    **/
    @Override
    public Map<String, Object> getClientListByToken(String token) {
        System.out.println("token为"+token+"的用户查询失败");
        Map<String,Object> param = new HashMap<>();
        param.put("product",null);
        param.put("message","token为"+token+"的用户查询失败");
        return param;
    }

    /**
     * @方法描述: 条件查询的熔断方法
     * @Author panwenlong
     * @Date 10:44 2020/7/10
    **/
    @Override
    public Map<String, Object> getClientListBy(String warehouseCode, String businessName) {
        System.out.println("仓库编号为"+warehouseCode+"店铺名包含"+businessName+"的查询失败");
        Map<String,Object> param = new HashMap<>();
        param.put("product",null);
        param.put("message","仓库编号为"+warehouseCode+"店铺名包含"+businessName+"的查询失败");
        return param;
    }

    @Override
    public Map getClientListByWarehouseCode(String warehouseCode) {
        System.out.println("1111");
        return null;
    }

    @Override
    public Map addCooperation(Integer id, String warehouseCode) {
        System.out.println("1111");
        return null;
    }

    @Override
    public SupplyResult EmployeeLogin(String username, String password) {

        System.out.println("请求超时");
        return SupplyResult.build(500,"请求异常");
    }
}
