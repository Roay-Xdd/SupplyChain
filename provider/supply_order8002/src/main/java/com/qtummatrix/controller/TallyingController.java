package com.qtummatrix.controller;


import com.qtummatrix.bean.WSY_OrderBean;
import com.qtummatrix.service.WSY_OrderBeanService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
    @CrossOrigin(allowCredentials = "true",allowedHeaders = "*",
        methods = {RequestMethod.DELETE,RequestMethod.GET,
                RequestMethod.POST,RequestMethod.PUT,RequestMethod.HEAD},origins="*")
    public Object selectBySellerId(){
        List<WSY_OrderBean> wsy_orderBeans = orderBeanService.selectBySellerId();
        return wsy_orderBeans;
    }

    /**
     * @Author
     * 理货 方法
     *  更改订单状态（为采购单进行配货）
     */
    @RequestMapping("updateOrderStepByorderId")
    public Object updateOrderStepByorderId(String orderId,Integer orderStep){
        String s = orderBeanService.updateOrderStepByorderId(orderId, orderStep);
        return s;
    }




}
