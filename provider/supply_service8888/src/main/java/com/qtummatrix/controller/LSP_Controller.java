package com.qtummatrix.controller;

import com.qtummatrix.bean.LSP_Logistics;
import com.qtummatrix.service.LSP_Server;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * 功能描述：
 *
 * @Author: Shi JiuYue
 * @Date: 2020/7/16 19:17
 */
@Controller
@RequestMapping("api/LSP_Logistics")
public class LSP_Controller {

    @Resource
    private LSP_Server lsp_server;

    @ResponseBody
    @RequestMapping("/selectLog")
    public List<LSP_Logistics> selectLog(@RequestParam("orderstep")Integer orderstep){
        List<LSP_Logistics> lsp_logistics = lsp_server.selectLog(orderstep);
        return lsp_logistics;
    }


    @ResponseBody
    @RequestMapping("/updateLog")
    public Object updateLog(@RequestParam("orderid")String orderid,
                            @RequestParam("orderstep")Integer orderstep){
        Object o = lsp_server.updateLog(orderid, orderstep);
        int i = (int) o;
        return i;
    }
}
