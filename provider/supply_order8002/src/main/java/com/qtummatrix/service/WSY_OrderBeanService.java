package com.qtummatrix.service;

import com.qtummatrix.bean.WSY_OrderBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WSY_OrderBeanService {

    /**
     * 查询所有采购单详情
     * @param sellerId
     * @param orderStep
     * @return
     */
    public List<WSY_OrderBean> selectBySellerId(@Param("sellerId") String sellerId, @Param("orderStep") Integer orderStep);
}
