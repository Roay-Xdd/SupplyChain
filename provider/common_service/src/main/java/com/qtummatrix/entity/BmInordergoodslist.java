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
@ApiModel(value="BmInordergoodslist对象", description="")
public class BmInordergoodslist implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "������Ʒid")
    @TableId(value = "id", type = IdType.ID_WORKER)
    private Integer id;

    @ApiModelProperty(value = "����id")
    @TableField("orderId")
    private String orderId;

    @ApiModelProperty(value = "��Ʒid")
    @TableField("goodsId")
    private Integer goodsId;

    @ApiModelProperty(value = "���id")
    @TableField("spId")
    private Integer spId;

    @ApiModelProperty(value = "�������")
    private String sname;

    @ApiModelProperty(value = "��Ʒ����")
    @TableField("goodsName")
    private String goodsName;

    @ApiModelProperty(value = "��ƷͼƬ")
    @TableField("goodsImg")
    private String goodsImg;

    @ApiModelProperty(value = "��������")
    @TableField("buyNum")
    private Integer buyNum;

    @ApiModelProperty(value = "������")
    private BigDecimal price;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getSpId() {
        return spId;
    }

    public void setSpId(Integer spId) {
        this.spId = spId;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsImg() {
        return goodsImg;
    }

    public void setGoodsImg(String goodsImg) {
        this.goodsImg = goodsImg;
    }

    public Integer getBuyNum() {
        return buyNum;
    }

    public void setBuyNum(Integer buyNum) {
        this.buyNum = buyNum;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "BmInordergoodslist{" +
        "id=" + id +
        ", orderId=" + orderId +
        ", goodsId=" + goodsId +
        ", spId=" + spId +
        ", sname=" + sname +
        ", goodsName=" + goodsName +
        ", goodsImg=" + goodsImg +
        ", buyNum=" + buyNum +
        ", price=" + price +
        "}";
    }
}
