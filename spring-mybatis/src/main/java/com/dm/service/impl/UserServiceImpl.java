package com.dm.service.impl;

import com.dm.entity.UserEntity;
import com.dm.mapper.UserMapper;
import com.dm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;
    public UserEntity findOne(Integer id) {
        return userMapper.findOne(id);
    }
}
