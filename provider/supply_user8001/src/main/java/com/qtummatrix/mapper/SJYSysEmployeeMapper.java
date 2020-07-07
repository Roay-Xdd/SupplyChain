package com.qtummatrix.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qtummatrix.entity.SysEmployee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

/**
 * 方法描述: 员工mapper接口
 * @Author: Shi JiuYue
 * @Date 14:47 2020/7/7
 **/

@Component
public interface SJYSysEmployeeMapper extends BaseMapper<SysEmployee> {

    int deleteByPrimaryKey(Integer id);

    int insert(SysEmployee record);

    int insertSelective(SysEmployee record);

    SysEmployee selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysEmployee record);

    int updateByPrimaryKey(SysEmployee record);


    /**
     * 方法描述: 通过tel得到员工
     * @Author: Shi JiuYue
     * @Date 14:50 2020/7/7
     **/
    SysEmployee selectByTel(String tel);


    /**
     * 方法描述: 查询所有员工的手机号
     * @Author: Shi JiuYue
     * @Date 14:51 2020/7/7
     **/
    String [] selectTel();


    /**
     * 方法描述: 根据手机号修改员工密码
     * @Author: Shi JiuYue
     * @Date 14:52 2020/7/7
     **/
    int updatePassword (@Param("tel")String tel,@Param("newPassword")String newPassword);






}
