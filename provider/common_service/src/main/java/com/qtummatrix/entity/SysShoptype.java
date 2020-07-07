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
@ApiModel(value="SysShoptype对象", description="")
public class SysShoptype implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "�������� һ�������磺1.��λ�� 2.����Ʒ 3.����ͨ 4.����ҵ ���������磺�����������ꡢ�������������")
    @TableField("typeName")
    private String typeName;

    @ApiModelProperty(value = "������id")
    @TableField("parentId")
    private Integer parentId;

    @ApiModelProperty(value = "�����ֶ�")
    private Integer sort;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    @Override
    public String toString() {
        return "SysShoptype{" +
        "id=" + id +
        ", typeName=" + typeName +
        ", parentId=" + parentId +
        ", sort=" + sort +
        "}";
    }
}
