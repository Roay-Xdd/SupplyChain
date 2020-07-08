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
    public List<WSY_OrderBean> selectBySellerId(String sellerId, Integer orderStep) {
        Map map = new HashMap();
        map.put("sellerId",sellerId);
        map.put("orderStep",orderStep);
        List<WSY_OrderBean> wsy_orderBeans = orderBeanMapper.selectBySellerId(map);
        return wsy_orderBeans;
    }
}
