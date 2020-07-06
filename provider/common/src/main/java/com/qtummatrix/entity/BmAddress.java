package com.qtummatrix.entity;

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
@ApiModel(value="BmAddress对象", description="")
public class BmAddress implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "addId", type = IdType.AUTO)
    private Integer addId;

    @ApiModelProperty(value = "����id")
    @TableField("sellerId")
    private Integer sellerId;

    @ApiModelProperty(value = "��ϵ��")
    private String contacter;

    @ApiModelProperty(value = "��ϵ�绰")
    private String tel;

    @ApiModelProperty(value = "��ŵ�ַ")
    @TableField("mainAddress")
    private String mainAddress;

    @ApiModelProperty(value = "��ϸ��ַ")
    private String address;

    @ApiModelProperty(value = "�Ƿ�Ĭ�ϵ�ַ 0.���� 1.��")
    @TableField("isDefault")
    private Integer isDefault;

    @ApiModelProperty(value = "ɾ����� 0.δɾ�� 1.��ɾ��")
    @TableField("isDeleted")
    private Integer isDeleted;

    @ApiModelProperty(value = "����")
    private String lng;

    @ApiModelProperty(value = "γ��")
    private String lat;


    public Integer getAddId() {
        return addId;
    }

    public void setAddId(Integer addId) {
        this.addId = addId;
    }

    public Integer getSellerId() {
        return sellerId;
    }

    public void setSellerId(Integer sellerId) {
        this.sellerId = sellerId;
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

    public String getMainAddress() {
        return mainAddress;
    }

    public void setMainAddress(String mainAddress) {
        this.mainAddress = mainAddress;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Integer isDefault) {
        this.isDefault = isDefault;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    @Override
    public String toString() {
        return "BmAddress{" +
        "addId=" + addId +
        ", sellerId=" + sellerId +
        ", contacter=" + contacter +
        ", tel=" + tel +
        ", mainAddress=" + mainAddress +
        ", address=" + address +
        ", isDefault=" + isDefault +
        ", isDeleted=" + isDeleted +
        ", lng=" + lng +
        ", lat=" + lat +
        "}";
    }
}
