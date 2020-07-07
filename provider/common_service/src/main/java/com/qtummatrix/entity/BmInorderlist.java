package com.qtummatrix.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.Version;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 
 * </p>
 *
 * @author ${author}
 * @since 2020-07-06
 */
@ApiModel(value="BmInorderlist对象", description="")
public class BmInorderlist implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "����id")
    @TableId(value = "orderId", type = IdType.ID_WORKER)
    private String orderId;

    @ApiModelProperty(value = "����id")
    @TableField("sellerId")
    private Integer sellerId;

    @ApiModelProperty(value = "���ͷ�")
    @TableField("deliveryFee")
    private BigDecimal deliveryFee;

    @ApiModelProperty(value = "�������")
    private BigDecimal amount;

    @ApiModelProperty(value = "֧����ʽ 1.�������� 2.����֧��")
    @TableField("payType")
    private Integer payType;

    @ApiModelProperty(value = "�������� ��֧��=1 ��֧���������=2 ������������=3 ���������װ��=4 ��װ����������=5���ѷ�����������=6 �ѽ���=7")
    @TableField("orderStep")
    private Integer orderStep;

    @ApiModelProperty(value = "���͵�ַid")
    @TableField("deliveryAddId")
    private String deliveryAddId;

    @ApiModelProperty(value = "��������ʱ��")
    @TableField("createTime")
    private Date createTime;

    @ApiModelProperty(value = "֧��ʱ��")
    @TableField("payTime")
    private Date payTime;

    @ApiModelProperty(value = "����״̬ ��ȡ��=0 ��������=1 �Ѿ����=2 ȡ����=3 ��ʱ=4")
    @TableField("orderState")
    private Integer orderState;

    @ApiModelProperty(value = "�������Ͳ����¼")
    @TableField("orderStepRecord")
    private String orderStepRecord;

    @ApiModelProperty(value = "�ֿ������Աid")
    @TableField("warehouserId")
    private Integer warehouserId;

    @ApiModelProperty(value = "������Աid")
    @TableField("logisticsId")
    private Integer logisticsId;

    @ApiModelProperty(value = "������ע")
    private String mark;


    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Integer getSellerId() {
        return sellerId;
    }

    public void setSellerId(Integer sellerId) {
        this.sellerId = sellerId;
    }

    public BigDecimal getDeliveryFee() {
        return deliveryFee;
    }

    public void setDeliveryFee(BigDecimal deliveryFee) {
        this.deliveryFee = deliveryFee;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    public Integer getOrderStep() {
        return orderStep;
    }

    public void setOrderStep(Integer orderStep) {
        this.orderStep = orderStep;
    }

    public String getDeliveryAddId() {
        return deliveryAddId;
    }

    public void setDeliveryAddId(String deliveryAddId) {
        this.deliveryAddId = deliveryAddId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public Integer getOrderState() {
        return orderState;
    }

    public void setOrderState(Integer orderState) {
        this.orderState = orderState;
    }

    public String getOrderStepRecord() {
        return orderStepRecord;
    }

    public void setOrderStepRecord(String orderStepRecord) {
        this.orderStepRecord = orderStepRecord;
    }

    public Integer getWarehouserId() {
        return warehouserId;
    }

    public void setWarehouserId(Integer warehouserId) {
        this.warehouserId = warehouserId;
    }

    public Integer getLogisticsId() {
        return logisticsId;
    }

    public void setLogisticsId(Integer logisticsId) {
        this.logisticsId = logisticsId;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "BmInorderlist{" +
        "orderId=" + orderId +
        ", sellerId=" + sellerId +
        ", deliveryFee=" + deliveryFee +
        ", amount=" + amount +
        ", payType=" + payType +
        ", orderStep=" + orderStep +
        ", deliveryAddId=" + deliveryAddId +
        ", createTime=" + createTime +
        ", payTime=" + payTime +
        ", orderState=" + orderState +
        ", orderStepRecord=" + orderStepRecord +
        ", warehouserId=" + warehouserId +
        ", logisticsId=" + logisticsId +
        ", mark=" + mark +
        "}";
    }
}
