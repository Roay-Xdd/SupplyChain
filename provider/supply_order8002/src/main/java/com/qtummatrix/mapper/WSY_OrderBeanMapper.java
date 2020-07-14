package com.qtummatrix.mapper;

import com.qtummatrix.bean.WSY_OrderBean;

import com.qtummatrix.entity.BmInorderlist;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface WSY_OrderBeanMapper extends BmInorderlistDao {


    @Override
    int deleteByPrimaryKey(String orderid);

    @Override
    int insert(BmInorderlist record);

    @Override
    int insertSelective(BmInorderlist record);

    @Override
    BmInorderlist selectByPrimaryKey(String orderid);

    @Override
    int updateByPrimaryKeySelective(BmInorderlist record);

    @Override
    int updateByPrimaryKeyWithBLOBs(BmInorderlist record);

    @Override
    int updateByPrimaryKey(BmInorderlist record);

    //理货主页面查询所有待配货采购单
    public List<WSY_OrderBean> selectBySellerId();

    //开始配货页面查询所有待配货采购单
    public List<WSY_OrderBean> selectOrderDetails(String orderId);

    //更改采购单状态(配货)
    public int updatePickingByOrderId(String orderId);

    //出库主页面查询所有待验货采购单
    public List<WSY_OrderBean> selectExamineByOrderId();

    //验货出库页面查询待验货订单
    public List<WSY_OrderBean> selectExamineOrderDetails(String orderId);

    //更改采购单状态(验货)
    public int updateExamineByOrderId(String orderId);
}
