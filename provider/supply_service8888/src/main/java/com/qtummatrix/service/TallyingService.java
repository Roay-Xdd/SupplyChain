package com.qtummatrix.service;

import com.qtummatrix.bean.WSY_OrderBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * 功能描述：
 *
 * @Author: Shi JiuYue
 * @Date: 2020/7/16 17:44
 */
@FeignClient(value = "supply-order" ,fallback = TallyingServiceApplication.class)
public interface TallyingService {


    /**
     * @Author
     * 理货 方法
     * 查询所有采购单
     */
    @RequestMapping("/tallying/selectBySellerId")
    public List<WSY_OrderBean> selectBySellerId();


    /**
     * 查询所有待配货订单（主要展示商品）
     */
    @RequestMapping("/tallying/selectOrderDetails")
    public List<WSY_OrderBean> selectOrderDetails(@RequestParam("orderId")String orderId);


    /**
     * @Author
     * 理货 方法
     *  更改订单状态（为采购单进行配货）
     */
    @RequestMapping("/tallying/updatePickingByOrderId")
    public Object updatePickingByOrderId(@RequestParam("orderId")String orderId);


    /**
     * @Author
     * 出库 方法
     * 查询所有待验货采购单
     */
    @RequestMapping("/tallying/selectExamineByOrderId")
    public List<WSY_OrderBean> selectExamineByOrderId();


    /**
     * 查询所有待验货订单（主要展示商品）
     */
    @RequestMapping("/tallying/selectExamineOrderDetails")
    public List<WSY_OrderBean> selectExamineOrderDetails(@RequestParam("orderId")String orderId);


    /**
     * @Author
     * 出库 方法
     *  更改订单状态（为采购单进行验货）
     */
    @RequestMapping("/tallying/updateExamineByOrderId")
    public Object updateExamineByOrderId(@RequestParam("orderId")String orderId);




}
