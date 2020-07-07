package com.qtummatrix.controller;


import com.qtummatrix.bean.WSY_OrderBean;
import com.qtummatrix.service.WSY_OrderBeanService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;


/**
 *  理货控制中心
 */
@Controller
@RequestMapping("/tallying")
public class TallyingController {

    @Resource
    private WSY_OrderBeanService orderBeanService;

    /**
     * @Author
     * 理货 方法
     * 查询所有采购单
     */
    @RequestMapping("selectBySellerId")
    @ResponseBody
    public Object selectBySellerId(String orderId,Integer orderType){
        List<WSY_OrderBean> wsy_orderBeans = orderBeanService.selectBySellerId(orderId, orderType);
        return wsy_orderBeans;
    }

    /**
     * @Author
     * 理货 方法
     */
    @RequestMapping("material")
    public void material(){


    }




}
