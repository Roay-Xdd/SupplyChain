package com.qtummatrix.service;

import com.qtummatrix.bean.WSY_OrderBean;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 功能描述：
 *
 * @Author: Shi JiuYue
 * @Date: 2020/7/16 17:49
 */
@Component
public class TallyingServiceApplication implements TallyingService{


    @Override
    public List<WSY_OrderBean> selectBySellerId() {
        System.out.println("超时");
        return null;
    }

    @Override
    public List<WSY_OrderBean> selectOrderDetails(String orderId) {
        System.out.println("超时");
        return null;
    }

    @Override
    public Object updatePickingByOrderId(String orderId) {
        System.out.println("超时");
        return null;
    }

    @Override
    public List<WSY_OrderBean> selectExamineByOrderId() {
        System.out.println("超时");
        return null;
    }

    @Override
    public List<WSY_OrderBean> selectExamineOrderDetails(String orderId) {
        System.out.println("超时");
        return null;
    }

    @Override
    public Object updateExamineByOrderId(String orderId) {
        System.out.println("超时");
        return null;
    }
}
