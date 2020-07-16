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
//    @CrossOrigin(allowCredentials = "true",allowedHeaders = "*",
//        methods = {RequestMethod.DELETE,RequestMethod.GET,
//                RequestMethod.POST,RequestMethod.PUT,RequestMethod.HEAD},origins="*")
    public List<WSY_OrderBean> selectBySellerId(){
        List<WSY_OrderBean> wsy_orderBeans = orderBeanService.selectBySellerId();
        return wsy_orderBeans;
    }

    /**
     * 查询所有待配货订单（主要展示商品）
     */
    @RequestMapping("selectOrderDetails")
    @ResponseBody
//    @CrossOrigin(allowCredentials = "true",allowedHeaders = "*",
//            methods = {RequestMethod.DELETE,RequestMethod.GET,
//                    RequestMethod.POST,RequestMethod.PUT,RequestMethod.HEAD},origins="*")
    public List<WSY_OrderBean> selectOrderDetails(String orderId){
        System.out.println(orderId+"=====================================================");
        List<WSY_OrderBean> wsy_orderBeans = orderBeanService.selectOrderDetails(orderId);
        for (WSY_OrderBean wsy_orderBean : wsy_orderBeans) {
            System.out.println(wsy_orderBean.toString());
        }
        return wsy_orderBeans;
    }

    /**
     * @Author
     * 理货 方法
     *  更改订单状态（为采购单进行配货）
     */
    @RequestMapping("updatePickingByOrderId")
    @ResponseBody
//    @CrossOrigin(allowCredentials = "true",allowedHeaders = "*",
//            methods = {RequestMethod.DELETE,RequestMethod.GET,
//                    RequestMethod.POST,RequestMethod.PUT,RequestMethod.HEAD},origins="*")
    public Object updatePickingByOrderId(String orderId){
        System.out.println(orderId+"配货=====================================================");
        int i  = orderBeanService.updatePickingByOrderId(orderId);
        return i;
    }

    /**
     * @Author
     * 出库 方法
     * 查询所有待验货采购单
     */
    @RequestMapping("selectExamineByOrderId")
    @ResponseBody
//    @CrossOrigin(allowCredentials = "true",allowedHeaders = "*",
//            methods = {RequestMethod.DELETE,RequestMethod.GET,
//                    RequestMethod.POST,RequestMethod.PUT,RequestMethod.HEAD},origins="*")
    public List<WSY_OrderBean> selectExamineByOrderId(){
        List<WSY_OrderBean> wsy_orderBeans = orderBeanService.selectExamineByOrderId();
        return wsy_orderBeans;
    }

    /**
     * 查询所有待验货订单（主要展示商品）
     */
    @RequestMapping("selectExamineOrderDetails")
    @ResponseBody
//    @CrossOrigin(allowCredentials = "true",allowedHeaders = "*",
//            methods = {RequestMethod.DELETE,RequestMethod.GET,
//                    RequestMethod.POST,RequestMethod.PUT,RequestMethod.HEAD},origins="*")
    public List<WSY_OrderBean> selectExamineOrderDetails(String orderId){
        System.out.println(orderId+"验货出库页面开始验货=====================================================");
        List<WSY_OrderBean> wsy_orderBeans = orderBeanService.selectExamineOrderDetails(orderId);
        for (WSY_OrderBean wsy_orderBean : wsy_orderBeans) {
            System.out.println(wsy_orderBean.toString());
        }
        return wsy_orderBeans;
    }

    /**
     * @Author
     * 出库 方法
     *  更改订单状态（为采购单进行验货）
     */
    @RequestMapping("updateExamineByOrderId")
    @ResponseBody
//    @CrossOrigin(allowCredentials = "true",allowedHeaders = "*",
//            methods = {RequestMethod.DELETE,RequestMethod.GET,
//                    RequestMethod.POST,RequestMethod.PUT,RequestMethod.HEAD},origins="*")
    public Object updateExamineByOrderId(String orderId){
        System.out.println(orderId+"验货=====================================================");
        int i  = orderBeanService.updateExamineByOrderId(orderId);
        return i;
    }

}
