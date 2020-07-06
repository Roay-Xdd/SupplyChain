package com.qtummatrix.entity;

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
@ApiModel(value="BmGoods对象", description="")
public class BmGoods implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "��Ʒ���")
    @TableField("goodsCode")
    private String goodsCode;

    @ApiModelProperty(value = "��Ʒ����")
    @TableField("goodsName")
    private String goodsName;

    @ApiModelProperty(value = "�ֿ���")
    @TableField("warehouseCode")
    private String warehouseCode;

    @ApiModelProperty(value = "��Ʒ����id")
    @TableField("categoryId")
    private Integer categoryId;

    @ApiModelProperty(value = "Ʒ��id")
    @TableField("brandId")
    private Integer brandId;

    @ApiModelProperty(value = "����")
    private Integer sort;

    @ApiModelProperty(value = "��Ʒ����")
    @TableField("goodsDetails")
    private String goodsDetails;

    @ApiModelProperty(value = "��Ʒ����")
    @TableField("goodsMark")
    private String goodsMark;

    @TableField("createTime")
    private Date createTime;

    @ApiModelProperty(value = "ɾ����� 0.δɾ�� 1.��ɾ��")
    @TableField("isDeleted")
    private Integer isDeleted;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGoodsCode() {
        return goodsCode;
    }

    public void setGoodsCode(String goodsCode) {
        this.goodsCode = goodsCode;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getWarehouseCode() {
        return warehouseCode;
    }

    public void setWarehouseCode(String warehouseCode) {
        this.warehouseCode = warehouseCode;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getGoodsDetails() {
        return goodsDetails;
    }

    public void setGoodsDetails(String goodsDetails) {
        this.goodsDetails = goodsDetails;
    }

    public String getGoodsMark() {
        return goodsMark;
    }

    public void setGoodsMark(String goodsMark) {
        this.goodsMark = goodsMark;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    @Override
    public String toString() {
        return "BmGoods{" +
        "id=" + id +
        ", goodsCode=" + goodsCode +
        ", goodsName=" + goodsName +
        ", warehouseCode=" + warehouseCode +
        ", categoryId=" + categoryId +
        ", brandId=" + brandId +
        ", sort=" + sort +
        ", goodsDetails=" + goodsDetails +
        ", goodsMark=" + goodsMark +
        ", createTime=" + createTime +
        ", isDeleted=" + isDeleted +
        "}";
    }
}
