package com.qtummatrix.mapper;

import com.qtummatrix.bean.F_customerDetail;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface F_customerDetailMapper {

     //根据店铺id查询客户详情
     List<F_customerDetail> getF_customerDetailById(Integer id);
}
