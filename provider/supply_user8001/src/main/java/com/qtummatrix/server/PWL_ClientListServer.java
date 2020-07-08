package com.qtummatrix.server;

import com.qtummatrix.bean.PWL_ClientList;

import java.util.List;

public interface PWL_ClientListServer {

//    根据员工手机号获取仓库编号获取所有与之建立合作的店铺信息
    List<PWL_ClientList> getClientListByTel(String tel);

//    根据仓库编号和店铺名称查询（模糊查询）
    List<PWL_ClientList> getClientList(String warehouseCode, String businessName);

}
