package com.qtummatrix.controller;

import com.qtummatrix.bean.LSP_Logistics;
import com.qtummatrix.service.LSP_LogisticsService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

//    解决跨域请求
//@CrossOrigin(allowCredentials = "true",allowedHeaders = "*",
//      methods = {RequestMethod.DELETE,RequestMethod.GET,
//      RequestMethod.POST,RequestMethod.PUT,RequestMethod.HEAD},origins="*")
@Controller
@RequestMapping("/api/LSP_Logistics")
public class LSP_Controller {
    @Resource
    private LSP_LogisticsService lsp_logisticsService;

    @ResponseBody
    @RequestMapping("/selectLog")
    public List<LSP_Logistics> selectLog(@RequestParam("orderstep")Integer orderstep){
        List<LSP_Logistics> lsp_logistics = lsp_logisticsService.selectLog(orderstep);
        return lsp_logistics;
    }
    @ResponseBody
    @RequestMapping("/updateLog")
    public Object updateLog(@RequestParam("orderid")String orderid,
                            @RequestParam("orderstep")Integer orderstep){
        int i = lsp_logisticsService.updateLog(orderid, orderstep);
        return i;
    }


}
