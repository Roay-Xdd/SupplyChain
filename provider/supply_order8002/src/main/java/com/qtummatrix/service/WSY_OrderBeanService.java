package com.qtummatrix.service;

import com.qtummatrix.bean.WSY_OrderBean;
import org.apache.ibatis.annotations.Param;
import org.springframework.cloud.openfeign.FeignClient;

import java.util.List;

public interface WSY_OrderBeanService {

    /**
     * 理货主页面查询所有待配货采购单
     * @return
     */
    public List<WSY_OrderBean> selectBySellerId();

    /**
     * 开始配货页面查询待配货采购单
     * @return
     */
    public List<WSY_OrderBean> selectOrderDetails(String orderId);

    /**
     * 更改采购单状态（为采购单进行配货）
     * @param orderId
     * @return
     */
    public Integer updatePickingByOrderId(@Param("orderId") String orderId);

    /**
     * 查询所有待验货订单列表
     * @return
     */
    public List<WSY_OrderBean> selectExamineByOrderId();

    /**
     * 验货出库页面，根据ID查询待验货订单
     * @param orderId
     * @return
     */
    public List<WSY_OrderBean> selectExamineOrderDetails(String orderId);

    /**
     * 更改采购单状态（为采购单进行验货）
     * @param orderId
     * @return
     */
    public Integer updateExamineByOrderId(@Param("orderId") String orderId);
}
