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
@ApiModel(value="SysMechanism对象", description="")
public class SysMechanism implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "�������")
    @TableField("mechanismCode")
    private String mechanismCode;

    @ApiModelProperty(value = "��������")
    @TableField("mechanismName")
    private String mechanismName;

    @ApiModelProperty(value = "����id")
    @TableField("levelId")
    private Integer levelId;

    @ApiModelProperty(value = "������������")
    private String addvcd;

    @ApiModelProperty(value = "��½����")
    private String password;

    @ApiModelProperty(value = "������ϵ�绰")
    private String tel;

    @ApiModelProperty(value = "�ϼ�����id")
    @TableField("parentId")
    private Integer parentId;

    @ApiModelProperty(value = "����ʱ��")
    @TableField("createTime")
    private Date createTime;

    @ApiModelProperty(value = "ɾ����� 0.δɾ�� 1.��ɾ��")
    @TableField("isDeleted")
    private Integer isDeleted;

    private String city;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMechanismCode() {
        return mechanismCode;
    }

    public void setMechanismCode(String mechanismCode) {
        this.mechanismCode = mechanismCode;
    }

    public String getMechanismName() {
        return mechanismName;
    }

    public void setMechanismName(String mechanismName) {
        this.mechanismName = mechanismName;
    }

    public Integer getLevelId() {
        return levelId;
    }

    public void setLevelId(Integer levelId) {
        this.levelId = levelId;
    }

    public String getAddvcd() {
        return addvcd;
    }

    public void setAddvcd(String addvcd) {
        this.addvcd = addvcd;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "SysMechanism{" +
        "id=" + id +
        ", mechanismCode=" + mechanismCode +
        ", mechanismName=" + mechanismName +
        ", levelId=" + levelId +
        ", addvcd=" + addvcd +
        ", password=" + password +
        ", tel=" + tel +
        ", parentId=" + parentId +
        ", createTime=" + createTime +
        ", isDeleted=" + isDeleted +
        ", city=" + city +
        "}";
    }
}
