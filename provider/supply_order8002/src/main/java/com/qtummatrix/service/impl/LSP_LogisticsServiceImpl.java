package com.qtummatrix.service.impl;

import com.qtummatrix.bean.LSP_Logistics;
import com.qtummatrix.mapper.LSP_LogisticsMapper;
import com.qtummatrix.service.LSP_LogisticsService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import java.util.List;


@Component
public class LSP_LogisticsServiceImpl implements LSP_LogisticsService {
    @Autowired(required = false)
    private LSP_LogisticsMapper lsp_logisticsMapper;

    @Override
    public List<LSP_Logistics> selectLog(@Param("orderstep")Integer orderstep) {
        List<LSP_Logistics> lsp_logistics = lsp_logisticsMapper.selectLog(orderstep);
        return lsp_logistics;
    }

    @Override
    public int updateLog(String orderid, Integer orderstep) {
        int i = lsp_logisticsMapper.updateLog(orderid, orderstep);
            return i;
        }


}
