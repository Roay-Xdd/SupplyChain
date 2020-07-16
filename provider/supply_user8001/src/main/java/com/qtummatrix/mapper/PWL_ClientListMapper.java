package com.qtummatrix.mapper;

import com.qtummatrix.bean.PWL_ClientList;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface PWL_ClientListMapper {

//    根据员工手机号获取仓库编号获取所有与之建立合作的店铺信息
    List<PWL_ClientList> getClientListByTel(String tel);

//    根据仓库编号和店铺名称查询（模糊查询）
    List<PWL_ClientList> getClientList(Map map);
//   根据仓库编号查询没有与之建立合作关系的店铺
    List<PWL_ClientList> getClientListByWarehouseCode(String warehouseCode);
//    建立新合作关系
    Integer addCooperation(Map map);


}
