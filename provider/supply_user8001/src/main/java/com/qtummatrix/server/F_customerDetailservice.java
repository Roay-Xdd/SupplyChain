package com.qtummatrix.server;

import com.qtummatrix.bean.F_customerDetail;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface F_customerDetailservice {
    //根据店铺id查询客户详情
    List<F_customerDetail> getF_customerDetailById(Integer id);
}
