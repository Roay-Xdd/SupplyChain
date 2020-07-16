package com.qtummatrix.mapper;

import com.qtummatrix.bean.LSP_Logistics;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;


@Mapper
public interface LSP_LogisticsMapper {
    //    查询待配货
  List<LSP_Logistics> selectLog(@Param("orderstep") Integer orderstep);
   //   修改配货状态
   int updateLog(@Param("orderid") String orderid, @Param("orderstep") Integer orderstep);


}
