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

    public List<WSY_OrderBean> selectBySellerId(Map map);

}
