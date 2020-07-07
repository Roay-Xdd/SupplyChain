package com.qtummatrix.bean;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.util.Date;

public class LSP_Logistics {
//    订单号
    private String orderid;

    private Integer sellerid; //客户商家id

    private BigDecimal deliveryfee; //配送费

    private BigDecimal amount; //订单金额

    private Integer paytype; //支付方式 1.货到付款 2.在线支付

    private Integer orderstep;//订单步骤 待支付=1 已支付，待配货=2 已配货，待验货=3 已验货，待装货=4 已装货，待发货=5，已发货，待交货=6 已交货=7

    private String deliveryaddid; //配送地址id

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date createtime;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date endtime;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date paytime; //支付时间

    private Integer orderstate; //订单状态 已取消=0 正常订单=1 已经完成=2 取消中=3 超时=4

    private Integer warehouserid; //仓库管理人员id

    private Integer logisticsid; //物流人员id

    private String mark; //订单备注

    private String ordersteprecord; //订单配送步骤记录

    private String goodsname; //商品名称

    private String goodsimg; //商品图片

    private Integer buynum; //购买数量

    private BigDecimal price; //购买金额

    private String contacter;//收货姓名

    private String tel; //电话

    private String address;//地址

    @Override
    public String toString() {
        return "LSP_Logistics{" +
                "orderid='" + orderid + '\'' +
                ", sellerid=" + sellerid +
                ", deliveryfee=" + deliveryfee +
                ", amount=" + amount +
                ", paytype=" + paytype +
                ", orderstep=" + orderstep +
                ", deliveryaddid='" + deliveryaddid + '\'' +
                ", createtime=" + createtime +
                ", endtime=" + endtime +
                ", paytime=" + paytime +
                ", orderstate=" + orderstate +
                ", warehouserid=" + warehouserid +
                ", logisticsid=" + logisticsid +
                ", mark='" + mark + '\'' +
                ", ordersteprecord='" + ordersteprecord + '\'' +
                ", goodsname='" + goodsname + '\'' +
                ", goodsimg='" + goodsimg + '\'' +
                ", buynum=" + buynum +
                ", price=" + price +
                ", contacter='" + contacter + '\'' +
                ", tel='" + tel + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    public Integer getSellerid() {
        return sellerid;
    }

    public void setSellerid(Integer sellerid) {
        this.sellerid = sellerid;
    }

    public BigDecimal getDeliveryfee() {
        return deliveryfee;
    }

    public void setDeliveryfee(BigDecimal deliveryfee) {
        this.deliveryfee = deliveryfee;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Integer getPaytype() {
        return paytype;
    }

    public void setPaytype(Integer paytype) {
        this.paytype = paytype;
    }

    public Integer getOrderstep() {
        return orderstep;
    }

    public void setOrderstep(Integer orderstep) {
        this.orderstep = orderstep;
    }

    public String getDeliveryaddid() {
        return deliveryaddid;
    }

    public void setDeliveryaddid(String deliveryaddid) {
        this.deliveryaddid = deliveryaddid;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public Date getPaytime() {
        return paytime;
    }

    public void setPaytime(Date paytime) {
        this.paytime = paytime;
    }

    public Integer getOrderstate() {
        return orderstate;
    }

    public void setOrderstate(Integer orderstate) {
        this.orderstate = orderstate;
    }

    public Integer getWarehouserid() {
        return warehouserid;
    }

    public void setWarehouserid(Integer warehouserid) {
        this.warehouserid = warehouserid;
    }

    public Integer getLogisticsid() {
        return logisticsid;
    }

    public void setLogisticsid(Integer logisticsid) {
        this.logisticsid = logisticsid;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getOrdersteprecord() {
        return ordersteprecord;
    }

    public void setOrdersteprecord(String ordersteprecord) {
        this.ordersteprecord = ordersteprecord;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname;
    }

    public String getGoodsimg() {
        return goodsimg;
    }

    public void setGoodsimg(String goodsimg) {
        this.goodsimg = goodsimg;
    }

    public Integer getBuynum() {
        return buynum;
    }

    public void setBuynum(Integer buynum) {
        this.buynum = buynum;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getContacter() {
        return contacter;
    }

    public void setContacter(String contacter) {
        this.contacter = contacter;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
