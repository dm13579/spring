package com.dm.service;

import com.dm.entity.UserEntity;

public interface UserService {
    UserEntity findOne(Integer id);
}
