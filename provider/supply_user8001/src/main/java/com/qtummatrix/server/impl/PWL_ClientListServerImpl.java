package com.qtummatrix.server.impl;

import com.qtummatrix.bean.PWL_ClientList;
import com.qtummatrix.mapper.PWL_ClientListMapper;
import com.qtummatrix.server.PWL_ClientListServer;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName ClientListSercerImpl
 * @Description TODO
 * @Author 潘文龙
 * @Date 2020/7/7 14:08
 * @Version 1.0
 */
@Service("clientListServer")
public class PWL_ClientListServerImpl implements PWL_ClientListServer {

    @Resource
    private PWL_ClientListMapper clientListMapper;

    /**
     * @方法描述: 根据员工手机号获取仓库编号获取所有与之建立合作的店铺信息
     * @Author panwenlong
     * @Date 15:04 2020/7/7
    **/
    @Override
    public List<PWL_ClientList> getClientListByTel(String tel) {
        List<PWL_ClientList> clientLists = clientListMapper.getClientListByTel(tel);
        for (PWL_ClientList clientList : clientLists) {
            String ToCoordinate = clientList.getStoreMapCode();
            String EndCoordinates = clientList.getWarehouseMapCode();
            String distance = CalculationOfDistance(ToCoordinate,EndCoordinates);
            clientList.setDistance(distance);
        }
        return clientLists;
    }

    /**
     * @方法描述: 根据仓库编号与店铺名称查询（模糊查询）
     * @Author panwenlong
     * @Date 15:04 2020/7/7
    **/
    @Override
    public List<PWL_ClientList> getClientList(String warehouseCode, String businessName) {
        Map map = new HashMap();
        map.put("warehouseCode",warehouseCode);
        map.put("businessName",businessName);
        List<PWL_ClientList> clientLists = clientListMapper.getClientList(map);
        for (PWL_ClientList clientList : clientLists) {
            String ToCoordinate = clientList.getStoreMapCode();
            String EndCoordinates = clientList.getWarehouseMapCode();
            String distance = CalculationOfDistance(ToCoordinate,EndCoordinates);
            clientList.setDistance(distance);
        }
        return clientLists;
    }

    /**
     * @方法描述: 根据仓库编号查询没有与之建立合作关系的店铺
     * @Author panwenlong
     * @Date 10:17 2020/7/15
    **/
    @Override
    public List<PWL_ClientList> getClientListByWarehouseCode(String warehouseCode) {
        List<PWL_ClientList> clientLists = clientListMapper.getClientListByWarehouseCode(warehouseCode);
        return clientLists;
    }

    /**
     * @方法描述: 建立新合作关系
     * @Author panwenlong
     * @Date 10:18 2020/7/15
    **/
    @Override
    public Integer addCooperation(Integer id,String warehouseCode) {
        Map map = new HashMap();
        map.put("id",id);
        map.put("warehouseCode",warehouseCode);
        Integer result = clientListMapper.addCooperation(map);
        return result;
    }

    /**
     * @方法描述: 计算店铺与仓库的直线距离
     * @Author panwenlong
     * @Date 19:51 2020/7/7
    **/
    private static double rad(double d) {
        return d * Math.PI / 180.0;
    }
    public String CalculationOfDistance(String ToCoordinate,String EndCoordinates){
        double EARTH_RADIUS = 6378.137;

        String[] temp = ToCoordinate.split(",");
        String[] temp2 = EndCoordinates.split(",");

        double radLat1 = rad(Double.parseDouble(temp[1]));
        double radLat2 = rad(Double.parseDouble(temp2[1]));
        double a = radLat1 - radLat2;
        double b = rad(Double.parseDouble(temp[0])) - rad(Double.parseDouble(temp2[0]));
        double s = 2 * Math.asin(Math.sqrt(Math.pow(Math.sin(a / 2), 2)
                + Math.cos(radLat1) * Math.cos(radLat2)
                * Math.pow(Math.sin(b / 2), 2)));
        s = s * EARTH_RADIUS;
        // 保留两位小数
        s = Math.round(s * 100d) / 100d;
        String distance = "";
        if(s < 1){
            distance = s * 1000 + "米";
        }else {
            distance = s + "千米";
        }
        return distance;
    }
}
