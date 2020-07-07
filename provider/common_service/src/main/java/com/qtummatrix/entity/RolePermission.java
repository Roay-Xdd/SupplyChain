package com.qtummatrix.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.Version;
import com.baomidou.mybatisplus.annotation.TableId;
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
@ApiModel(value="RolePermission对象", description="")
public class RolePermission implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "��������ID")
    @TableId(value = "levelId", type = IdType.AUTO)
    private Integer levelId;

    @ApiModelProperty(value = "Ȩ��ID")
    private Integer permissionid;


    public Integer getLevelId() {
        return levelId;
    }

    public void setLevelId(Integer levelId) {
        this.levelId = levelId;
    }

    public Integer getPermissionid() {
        return permissionid;
    }

    public void setPermissionid(Integer permissionid) {
        this.permissionid = permissionid;
    }

    @Override
    public String toString() {
        return "RolePermission{" +
        "levelId=" + levelId +
        ", permissionid=" + permissionid +
        "}";
    }
}
