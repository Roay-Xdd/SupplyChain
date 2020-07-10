package com.qtummatrix.service;

import com.qtummatrix.bean.WSY_OrderBean;
//import com.qtummatrix.service.impl.WSY_OrderBeanServiceFallBack;
import org.apache.ibatis.annotations.Param;
import org.springframework.cloud.openfeign.FeignClient;

import java.util.List;

//@FeignClient(value = "product-service",fallback = WSY_OrderBeanServiceFallBack.class)
public interface WSY_OrderBeanService {

    /**
     * 查询所有采购单详情
     * @return
     */
    public List<WSY_OrderBean> selectBySellerId();

    /**
     * 更改采购单状态（为采购单进行配货）
     * @param orderId
     * @return
     */
    public String updateOrderStepByorderId(@Param("orderId") String orderId,@Param("orderStep") Integer orderStep);
}
