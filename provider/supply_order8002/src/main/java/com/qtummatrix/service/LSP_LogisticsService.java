package com.qtummatrix.service;

import com.qtummatrix.bean.LSP_Logistics;
import org.apache.ibatis.annotations.Param;
import java.util.List;


public interface LSP_LogisticsService {
    //   查询订单号信息
    List<LSP_Logistics> selectLog(@Param("orderstep") Integer orderstep);
    //   修改配货状态
    int updateLog(@Param("orderid") String orderid, @Param("orderstep") Integer orderstep);
    //    根据订单号查询具体

}
