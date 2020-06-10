package com.zhaike.service.impl;

import com.zhaike.entity.Users;
import com.zhaike.entity.UsersExample;
import com.zhaike.mapping.UsersMapper;
import com.zhaike.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UsersServiceImpl implements UsersService {
    @Autowired
    private UsersMapper mapper;
    @Override
    public List<Users> selectByExample(UsersExample example) {
        return mapper.selectByExample(example);
    }
}
