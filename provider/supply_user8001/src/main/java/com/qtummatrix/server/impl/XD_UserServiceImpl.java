package com.qtummatrix.server.impl;

import com.qtummatrix.entity.BmMember;
import com.qtummatrix.mapper.XD_BmMemberMapper;
import com.qtummatrix.server.XD_UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class XD_UserServiceImpl implements XD_UserService {


    @Autowired(required = false)
    private XD_BmMemberMapper xd_bmMemberMapper;
    @Override
    public int addUser(BmMember bmMember) {
      return xd_bmMemberMapper.insert(bmMember);
    }

}
