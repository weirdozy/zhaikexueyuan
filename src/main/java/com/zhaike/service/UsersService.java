package com.zhaike.service;

import com.zhaike.entity.Users;
import com.zhaike.entity.UsersExample;

import java.util.List;

public interface UsersService {

    List<Users> selectByExample(UsersExample example);
}
