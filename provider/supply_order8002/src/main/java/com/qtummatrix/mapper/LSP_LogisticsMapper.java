package com.qtummatrix.mapper;

import com.qtummatrix.bean.LSP_Logistics;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LSP_LogisticsMapper {
   List<LSP_Logistics> selectLog(String orderid);
}
