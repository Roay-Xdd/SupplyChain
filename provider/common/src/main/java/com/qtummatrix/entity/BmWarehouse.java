package com.qtummatrix.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
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
@ApiModel(value="BmWarehouse对象", description="")
public class BmWarehouse implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "�ֿ���")
    @TableField("warehouseCode")
    private String warehouseCode;

    @ApiModelProperty(value = "����id")
    private Integer mechanismid;

    @ApiModelProperty(value = "�ֿ����� 1.���� 2.����")
    @TableField("warehouseType")
    private Integer warehouseType;

    @ApiModelProperty(value = "�ֿ��ַ")
    private String address;

    @ApiModelProperty(value = "������ÿ����")
    @TableField("deliveryFeeAveryKM")
    private BigDecimal deliveryFeeAveryKM;

    @ApiModelProperty(value = "��ʼӪҵʱ��")
    @TableField("startTime")
    private String startTime;

    @ApiModelProperty(value = "����Ӫҵʱ��")
    @TableField("endTime")
    private String endTime;

    @ApiModelProperty(value = "���ͷ�Χ")
    @TableField("deliveryRadius")
    private BigDecimal deliveryRadius;

    @ApiModelProperty(value = "�ֿ⾭γ������ �磺113.781181,34.720848")
    @TableField("mapCode")
    private String mapCode;

    @ApiModelProperty(value = "��ϵ�绰")
    private String tel;

    @ApiModelProperty(value = "��������")
    @TableField("startSendNum")
    private Integer startSendNum;

    @ApiModelProperty(value = "ɾ����� 0.δɾ�� 1.��ɾ��")
    @TableField("isDeleted")
    private Integer isDeleted;


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

    public Integer getMechanismid() {
        return mechanismid;
    }

    public void setMechanismid(Integer mechanismid) {
        this.mechanismid = mechanismid;
    }

    public Integer getWarehouseType() {
        return warehouseType;
    }

    public void setWarehouseType(Integer warehouseType) {
        this.warehouseType = warehouseType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public BigDecimal getDeliveryFeeAveryKM() {
        return deliveryFeeAveryKM;
    }

    public void setDeliveryFeeAveryKM(BigDecimal deliveryFeeAveryKM) {
        this.deliveryFeeAveryKM = deliveryFeeAveryKM;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public BigDecimal getDeliveryRadius() {
        return deliveryRadius;
    }

    public void setDeliveryRadius(BigDecimal deliveryRadius) {
        this.deliveryRadius = deliveryRadius;
    }

    public String getMapCode() {
        return mapCode;
    }

    public void setMapCode(String mapCode) {
        this.mapCode = mapCode;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Integer getStartSendNum() {
        return startSendNum;
    }

    public void setStartSendNum(Integer startSendNum) {
        this.startSendNum = startSendNum;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    @Override
    public String toString() {
        return "BmWarehouse{" +
        "id=" + id +
        ", warehouseCode=" + warehouseCode +
        ", mechanismid=" + mechanismid +
        ", warehouseType=" + warehouseType +
        ", address=" + address +
        ", deliveryFeeAveryKM=" + deliveryFeeAveryKM +
        ", startTime=" + startTime +
        ", endTime=" + endTime +
        ", deliveryRadius=" + deliveryRadius +
        ", mapCode=" + mapCode +
        ", tel=" + tel +
        ", startSendNum=" + startSendNum +
        ", isDeleted=" + isDeleted +
        "}";
    }
}
