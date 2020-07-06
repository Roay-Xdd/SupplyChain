package com.qtummatrix.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.Version;
import com.baomidou.mybatisplus.annotation.TableId;
import java.sql.Blob;
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
@ApiModel(value="BmSpecification对象", description="")
public class BmSpecification implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "所属商品id")
    @TableField("goodsId")
    private Integer goodsId;

    @ApiModelProperty(value = "规格名称")
    private String sname;

    @ApiModelProperty(value = "原价")
    @TableField("oldPrice")
    private BigDecimal oldPrice;

    @ApiModelProperty(value = "现价")
    private BigDecimal price;

    @ApiModelProperty(value = "库存")
    private Integer stock;

    @ApiModelProperty(value = "警戒库存")
    @TableField("warnStock")
    private Integer warnStock;

    @ApiModelProperty(value = "总销量")
    @TableField("allSaled")
    private Integer allSaled;

    @ApiModelProperty(value = "月销量")
    @TableField("currentMonth")
    private String currentMonth;

    @ApiModelProperty(value = "是否上架 0.未上架 1.上架")
    @TableField("isShelves")
    private Integer isShelves;

    @ApiModelProperty(value = "是否推荐 0.不推荐 1.推荐")
    @TableField("isRecom")
    private Integer isRecom;

    @ApiModelProperty(value = "商品图片")
    @TableField("goodsImgUrl")
    private String goodsImgUrl;

    @ApiModelProperty(value = "保质期")
    @TableField("qualityPeriod")
    private String qualityPeriod;

    @ApiModelProperty(value = "二维码")
    @TableField("barCode")
    private Blob barCode;

    @ApiModelProperty(value = "生产日期")
    @TableField("productionDate")
    private Date productionDate;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public BigDecimal getOldPrice() {
        return oldPrice;
    }

    public void setOldPrice(BigDecimal oldPrice) {
        this.oldPrice = oldPrice;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getWarnStock() {
        return warnStock;
    }

    public void setWarnStock(Integer warnStock) {
        this.warnStock = warnStock;
    }

    public Integer getAllSaled() {
        return allSaled;
    }

    public void setAllSaled(Integer allSaled) {
        this.allSaled = allSaled;
    }

    public String getCurrentMonth() {
        return currentMonth;
    }

    public void setCurrentMonth(String currentMonth) {
        this.currentMonth = currentMonth;
    }

    public Integer getIsShelves() {
        return isShelves;
    }

    public void setIsShelves(Integer isShelves) {
        this.isShelves = isShelves;
    }

    public Integer getIsRecom() {
        return isRecom;
    }

    public void setIsRecom(Integer isRecom) {
        this.isRecom = isRecom;
    }

    public String getGoodsImgUrl() {
        return goodsImgUrl;
    }

    public void setGoodsImgUrl(String goodsImgUrl) {
        this.goodsImgUrl = goodsImgUrl;
    }

    public String getQualityPeriod() {
        return qualityPeriod;
    }

    public void setQualityPeriod(String qualityPeriod) {
        this.qualityPeriod = qualityPeriod;
    }

    public Blob getBarCode() {
        return barCode;
    }

    public void setBarCode(Blob barCode) {
        this.barCode = barCode;
    }

    public Date getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(Date productionDate) {
        this.productionDate = productionDate;
    }

    @Override
    public String toString() {
        return "BmSpecification{" +
        "id=" + id +
        ", goodsId=" + goodsId +
        ", sname=" + sname +
        ", oldPrice=" + oldPrice +
        ", price=" + price +
        ", stock=" + stock +
        ", warnStock=" + warnStock +
        ", allSaled=" + allSaled +
        ", currentMonth=" + currentMonth +
        ", isShelves=" + isShelves +
        ", isRecom=" + isRecom +
        ", goodsImgUrl=" + goodsImgUrl +
        ", qualityPeriod=" + qualityPeriod +
        ", barCode=" + barCode +
        ", productionDate=" + productionDate +
        "}";
    }
}
