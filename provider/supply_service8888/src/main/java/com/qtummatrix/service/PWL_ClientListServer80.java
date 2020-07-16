package com.qtummatrix.service;

import com.qtummatrix.util.SupplyResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;


@FeignClient(value = "supply-user" ,fallback = PWL_ClientListServerApplication.class)
public interface PWL_ClientListServer80 {

    @GetMapping("api/clientList/getClientListByTel")
    public Map<String,Object> getClientListByToken(@RequestParam("token") String token);

    @RequestMapping("api/clientList/getClientList")
    public Map<String,Object> getClientListBy(@RequestParam("warehouseCode") String warehouseCode,
                                            @RequestParam("businessName") String businessName);

    @RequestMapping("api/clientList/getClientListByWarehouseCode")
    public Map getClientListByWarehouseCode (@RequestParam("warehouseCode") String warehouseCode);

    @RequestMapping("api/clientList/addCooperation")
    public Map addCooperation(@RequestParam("id") Integer id,
                              @RequestParam("warehouseCode") String warehouseCode);

    
    @PostMapping("/employee/EmployeeLogin")
    public SupplyResult EmployeeLogin(@RequestParam("username")String username,
                                      @RequestParam("password")String password
                                     );
}
