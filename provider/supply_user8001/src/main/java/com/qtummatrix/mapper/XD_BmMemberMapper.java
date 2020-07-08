package com.qtummatrix.mapper;

import com.qtummatrix.entity.BmMember;
import org.mapstruct.Mapper;


@Mapper
public interface XD_BmMemberMapper extends BmMemberDao {

    @Override
    int deleteByPrimaryKey(Integer id);

    @Override
    int insert(BmMember record);

    @Override
    int insertSelective(BmMember record);

    @Override
    BmMember selectByPrimaryKey(Integer id);

    @Override
    int updateByPrimaryKeySelective(BmMember record);

    @Override
    int updateByPrimaryKey(BmMember record);

}
