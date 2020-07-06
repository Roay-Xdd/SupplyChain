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
@ApiModel(value="SysEmployee对象", description="")
public class SysEmployee implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "Ա�����")
    @TableField("employeeCode")
    private String employeeCode;

    @ApiModelProperty(value = "Ա������")
    private String ename;

    @ApiModelProperty(value = "�ֿ���")
    @TableField("warehouseCode")
    private String warehouseCode;

    @ApiModelProperty(value = "�ֻ�����")
    private String tel;

    @ApiModelProperty(value = "�Ա� 0.Ů 1.��")
    private Integer sex;

    @ApiModelProperty(value = "��������")
    private Date birthday;

    @ApiModelProperty(value = "��½����")
    private String password;

    @ApiModelProperty(value = "��½��ʶ")
    private String token;

    @ApiModelProperty(value = "Ա����λ 1.ִ�о��� 2.���۴��� 3.�ֿ������Ա 4.����������Ա")
    @TableField("positionId")
    private String positionId;

    @ApiModelProperty(value = "ͷ��")
    @TableField("imageUrl")
    private String imageUrl;

    @ApiModelProperty(value = "����ʱ��")
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

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getWarehouseCode() {
        return warehouseCode;
    }

    public void setWarehouseCode(String warehouseCode) {
        this.warehouseCode = warehouseCode;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getPositionId() {
        return positionId;
    }

    public void setPositionId(String positionId) {
        this.positionId = positionId;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
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
        return "SysEmployee{" +
        "id=" + id +
        ", employeeCode=" + employeeCode +
        ", ename=" + ename +
        ", warehouseCode=" + warehouseCode +
        ", tel=" + tel +
        ", sex=" + sex +
        ", birthday=" + birthday +
        ", password=" + password +
        ", token=" + token +
        ", positionId=" + positionId +
        ", imageUrl=" + imageUrl +
        ", createTime=" + createTime +
        ", isDeleted=" + isDeleted +
        "}";
    }
}
