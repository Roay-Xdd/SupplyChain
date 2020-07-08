package com.qtummatrix.bean;

/**
 * @ClassName ClientList   店铺列表类
 * @Description TODO
 * @Author 潘文龙
 * @Date 2020/7/7 15:20
 * @Version 1.0
 */
public class PWL_ClientList {
//  店铺ID
    private Integer id;
//  仓库编号
    private String warehouseCode;
//  店铺名称
    private String businessName;
//  店铺图片
    private String backImg;
//  距离
    private String distance;
//  店铺坐标
    private String storeMapCode;
//  仓库坐标
    private String warehouseMapCode;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWarehouseCode() {
        return warehouseCode;
    }

    public void setWarehouseCode(String warehouseCode) {
        this.warehouseCode = warehouseCode;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getBackImg() {
        return backImg;
    }

    public void setBackImg(String backImg) {
        this.backImg = backImg;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public String getStoreMapCode() {
        return storeMapCode;
    }

    public void setStoreMapCode(String storeMapCode) {
        this.storeMapCode = storeMapCode;
    }

    public String getWarehouseMapCode() {
        return warehouseMapCode;
    }

    public void setWarehouseMapCode(String warehouseMapCode) {
        this.warehouseMapCode = warehouseMapCode;
    }
    @Override
    public String toString() {
        return "PWL_ClientList{" +
                "id=" + id +
                ", warehouseCode='" + warehouseCode + '\'' +
                ", businessName='" + businessName + '\'' +
                ", backImg='" + backImg + '\'' +
                ", distance='" + distance + '\'' +
                ", storeMapCode='" + storeMapCode + '\'' +
                ", warehouseMapCode='" + warehouseMapCode + '\'' +
                '}';
    }

}
