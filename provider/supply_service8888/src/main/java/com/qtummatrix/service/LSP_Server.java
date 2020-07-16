package com.qtummatrix.service;

import com.qtummatrix.bean.LSP_Logistics;
import org.apache.ibatis.annotations.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 功能描述：
 *
 * @Author: Shi JiuYue
 * @Date: 2020/7/16 19:09
 */
@FeignClient(value = "supply-order" ,fallback = LSP_ServerApplication.class)
public interface LSP_Server {


    @RequestMapping("api/LSP_Logistics/selectLog")
    public List<LSP_Logistics> selectLog(@RequestParam("orderstep")Integer orderstep);

    @RequestMapping("api/LSP_Logistics/updateLog")
    public Object updateLog(@RequestParam("orderid")String orderid,
                            @RequestParam("orderstep")Integer orderstep);


}
