package com.qtummatrix.server.impl;

import com.qtummatrix.bean.F_customerDetail;
import com.qtummatrix.mapper.F_customerDetailMapper;
import com.qtummatrix.server.F_customerDetailservice;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class F_customerDetailserviceImpl implements F_customerDetailservice {
    @Resource
    private F_customerDetailMapper f_customerDetailMapper;


    /**
     * 根据店铺id查询客户详情
     * @param id
     * @return
     */
    @Override
    public List<F_customerDetail> getF_customerDetailById(Integer id) {
        return f_customerDetailMapper.getF_customerDetailById(id);
    }
}
