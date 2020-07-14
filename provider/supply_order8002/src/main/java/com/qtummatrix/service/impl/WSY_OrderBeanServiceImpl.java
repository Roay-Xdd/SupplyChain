package com.qtummatrix.service.impl;

import com.qtummatrix.bean.WSY_OrderBean;
import com.qtummatrix.mapper.WSY_OrderBeanMapper;
import com.qtummatrix.service.WSY_OrderBeanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class WSY_OrderBeanServiceImpl implements WSY_OrderBeanService {

    @Autowired(required = false)
    private WSY_OrderBeanMapper orderBeanMapper;

    @Override
    public List<WSY_OrderBean> selectBySellerId() {
        List<WSY_OrderBean> wsy_orderBeans = orderBeanMapper.selectBySellerId();
        return wsy_orderBeans;
    }

    @Override
    public List<WSY_OrderBean> selectOrderDetails(String orderId) {
        List<WSY_OrderBean> wsy_orderBeans = orderBeanMapper.selectOrderDetails(orderId);
        return wsy_orderBeans;
    }

    @Override
    public Integer updatePickingByOrderId(String orderId) {

        int i = orderBeanMapper.updatePickingByOrderId(orderId);

        return i;
    }

    @Override
    public List<WSY_OrderBean> selectExamineByOrderId() {
        List<WSY_OrderBean> wsy_orderBeans = orderBeanMapper.selectExamineByOrderId();
        return wsy_orderBeans;
    }

    @Override
    public List<WSY_OrderBean> selectExamineOrderDetails(String orderId) {
        List<WSY_OrderBean> wsy_orderBeans = orderBeanMapper.selectExamineOrderDetails(orderId);
        return wsy_orderBeans;
    }

    @Override
    public Integer updateExamineByOrderId(String orderId) {
        int i = orderBeanMapper.updateExamineByOrderId(orderId);

        return i;
    }
}
