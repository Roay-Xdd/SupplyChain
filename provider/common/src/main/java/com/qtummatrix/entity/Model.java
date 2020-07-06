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
@ApiModel(value="Model对象", description="")
public class Model implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "ģ��ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "��ģ��id")
    private Integer parentid;

    @ApiModelProperty(value = "ģ������")
    private String modelname;

    @ApiModelProperty(value = "��תҳ��·��")
    private String modelurl;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public String getModelname() {
        return modelname;
    }

    public void setModelname(String modelname) {
        this.modelname = modelname;
    }

    public String getModelurl() {
        return modelurl;
    }

    public void setModelurl(String modelurl) {
        this.modelurl = modelurl;
    }

    @Override
    public String toString() {
        return "Model{" +
        "id=" + id +
        ", parentid=" + parentid +
        ", modelname=" + modelname +
        ", modelurl=" + modelurl +
        "}";
    }
}
