package com.qtummatrix.bean;


public class F_customerDetail {
    private Integer id;//id
    private String businessname;//店铺名称
    private String backimg;//店铺图片
    private String shoptype;//店铺类型
    private String tel;//电话号码
    private String mapcode;//地址坐标

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBusinessname() {
        return businessname;
    }

    public void setBusinessname(String businessname) {
        this.businessname = businessname;
    }

    public String getBackimg() {
        return backimg;
    }

    public void setBackimg(String backimg) {
        this.backimg = backimg;
    }

    public String getShoptype() {
        return shoptype;
    }

    public void setShoptype(String shoptype) {
        this.shoptype = shoptype;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getMapcode() {
        return mapcode;
    }

    public void setMapcode(String mapcode) {
        this.mapcode = mapcode;
    }

    @Override
    public String toString() {
        return "F_customerDetail{" +
                "id=" + id +
                ", businessname='" + businessname + '\'' +
                ", backimg='" + backimg + '\'' +
                ", shoptype='" + shoptype + '\'' +
                ", tel='" + tel + '\'' +
                ", mapcode='" + mapcode + '\'' +
                '}';
    }
}
