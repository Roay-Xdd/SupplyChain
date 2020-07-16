package com.qtummatrix.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Component
@FeignClient(value = "supply-user" ,fallback = F_customerServerApplication.class)
public interface F_customerGet {
    @GetMapping("customer/getById")
    public Map<String,Object> getF_customerDetailById(@RequestParam("id") Integer id);
}
