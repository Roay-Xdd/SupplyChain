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
@ApiModel(value="BmMember对象", description="")
public class BmMember implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "��������")
    @TableField("BusinessName")
    private String BusinessName;

    @ApiModelProperty(value = "���ͽ��")
    @TableField("deliveryFee")
    private BigDecimal deliveryFee;

    @ApiModelProperty(value = "���;���")
    @TableField("deliveryRadius")
    private BigDecimal deliveryRadius;

    @ApiModelProperty(value = "���̵�ַ")
    private String address;

    @ApiModelProperty(value = "����ͼƬ")
    @TableField("backImg")
    private String backImg;

    @ApiModelProperty(value = "��ַ����")
    @TableField("mapCode")
    private String mapCode;

    @ApiModelProperty(value = "���״̬ 0.δ��� 1.�����")
    private Integer state;

    @ApiModelProperty(value = "Ӫҵ״̬ 0.Ъҵ 1.Ӫҵ")
    @TableField("workState")
    private Integer workState;

    @ApiModelProperty(value = "�绰����")
    private String tel;

    @ApiModelProperty(value = "��½����")
    private String password;

    @ApiModelProperty(value = "�ϰ�����")
    @TableField("trueName")
    private String trueName;

    @ApiModelProperty(value = "��������")
    @TableField("shopType")
    private String shopType;

    @ApiModelProperty(value = "���̵�½��ʶ")
    private String token;

    @ApiModelProperty(value = "�˻����")
    private BigDecimal amount;

    @TableField("addTime")
    private Date addTime;

    @ApiModelProperty(value = "ɾ����� 0.δɾ�� 1.��ɾ��")
    @TableField("isDeleted")
    private Integer isDeleted;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBusinessName() {
        return BusinessName;
    }

    public void setBusinessName(String BusinessName) {
        this.BusinessName = BusinessName;
    }

    public BigDecimal getDeliveryFee() {
        return deliveryFee;
    }

    public void setDeliveryFee(BigDecimal deliveryFee) {
        this.deliveryFee = deliveryFee;
    }

    public BigDecimal getDeliveryRadius() {
        return deliveryRadius;
    }

    public void setDeliveryRadius(BigDecimal deliveryRadius) {
        this.deliveryRadius = deliveryRadius;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBackImg() {
        return backImg;
    }

    public void setBackImg(String backImg) {
        this.backImg = backImg;
    }

    public String getMapCode() {
        return mapCode;
    }

    public void setMapCode(String mapCode) {
        this.mapCode = mapCode;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getWorkState() {
        return workState;
    }

    public void setWorkState(Integer workState) {
        this.workState = workState;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTrueName() {
        return trueName;
    }

    public void setTrueName(String trueName) {
        this.trueName = trueName;
    }

    public String getShopType() {
        return shopType;
    }

    public void setShopType(String shopType) {
        this.shopType = shopType;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    @Override
    public String toString() {
        return "BmMember{" +
        "id=" + id +
        ", BusinessName=" + BusinessName +
        ", deliveryFee=" + deliveryFee +
        ", deliveryRadius=" + deliveryRadius +
        ", address=" + address +
        ", backImg=" + backImg +
        ", mapCode=" + mapCode +
        ", state=" + state +
        ", workState=" + workState +
        ", tel=" + tel +
        ", password=" + password +
        ", trueName=" + trueName +
        ", shopType=" + shopType +
        ", token=" + token +
        ", amount=" + amount +
        ", addTime=" + addTime +
        ", isDeleted=" + isDeleted +
        "}";
    }
}
