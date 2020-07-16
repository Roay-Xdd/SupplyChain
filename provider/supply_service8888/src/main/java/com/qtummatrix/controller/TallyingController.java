package com.qtummatrix.controller;

import com.qtummatrix.bean.WSY_OrderBean;
import com.qtummatrix.service.TallyingService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * 功能描述：
 *
 * @Author: Shi JiuYue
 * @Date: 2020/7/16 17:51
 */
@Controller
@RequestMapping("api/tallying")
public class TallyingController {

    @Resource
    private TallyingService tallyingService;

    /**
     * @Author
     * 理货 方法
     * 查询所有采购单
     */
    @ResponseBody
    @RequestMapping("/selectBySellerId")
    public Object selectBySellerId(){

        List<WSY_OrderBean> wsy_orderBeans= (List<WSY_OrderBean>) tallyingService.selectBySellerId();

        return wsy_orderBeans;

    }

    /**
     * 查询所有待配货订单（主要展示商品）
     */
    @ResponseBody
    @RequestMapping("/selectOrderDetails")
    public Object selectOrderDetails(String orderId){
        List<WSY_OrderBean> wsy_orderBeans=tallyingService.selectOrderDetails(orderId);

        return wsy_orderBeans;
    }

    /**
     * @Author
     * 理货 方法
     *  更改订单状态（为采购单进行配货）
     */
    @ResponseBody
    @RequestMapping("/updatePickingByOrderId")
    public Object updatePickingByOrderId(String orderId){

        Object o = tallyingService.updatePickingByOrderId(orderId);

        return o;
    }


    /**
     * @Author
     * 出库 方法
     * 查询所有待验货采购单
     */
    @ResponseBody
    @RequestMapping("/selectExamineByOrderId")
    public Object selectExamineByOrderId(){
        List<WSY_OrderBean> wsy_orderBeans=tallyingService.selectExamineByOrderId();

        return wsy_orderBeans;
    }


    /**
     * 查询所有待验货订单（主要展示商品）
     */
    @ResponseBody
    @RequestMapping("/selectExamineOrderDetails")
    public Object selectExamineOrderDetails(String orderId){
        List<WSY_OrderBean> wsy_orderBeans=tallyingService.selectExamineOrderDetails(orderId);

        return wsy_orderBeans;
    }


    /**
     * @Author
     * 出库 方法
     *  更改订单状态（为采购单进行验货）
     */
    @ResponseBody
    @RequestMapping("/updateExamineByOrderId")
    public Object updateExamineByOrderId(String orderId){

        Object o = tallyingService.updateExamineByOrderId(orderId);

        return o;

    }


}
