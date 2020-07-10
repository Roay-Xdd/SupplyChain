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
    public String updateOrderStepByorderId(String orderId,Integer orderStep) {

        Map map = new HashMap();
        map.put("orderId",orderId);
        map.put("orderStep",orderStep);
        int i = orderBeanMapper.updateOrderStepByorderId(map);

        if (i>0){
            return "配货成功";
        }else {
            return "配货失败";
        }

    }
}
