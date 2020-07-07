package com.qtummatrix.controller;

import com.qtummatrix.bean.LSP_Logistics;
import com.qtummatrix.mapper.LSP_LogisticsMapper;
import com.sun.org.apache.bcel.internal.generic.IRETURN;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("LSP_Logistics")
public class LSP_Controller {
    @Resource
    private LSP_LogisticsMapper lsp_logisticsMapper;

    @ResponseBody
    @RequestMapping("selectLog")
    public List<LSP_Logistics> selectLog(String orderid){
        List<LSP_Logistics> lsp_logistics = lsp_logisticsMapper.selectLog(orderid);
        for (LSP_Logistics lsp_logistic : lsp_logistics) {
            System.out.println(lsp_logistic);
        }
            return lsp_logistics;
    }
}
