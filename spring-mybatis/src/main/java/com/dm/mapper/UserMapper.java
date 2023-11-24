package com.dm.mapper;

import com.dm.entity.UserEntity;

public interface UserMapper {

    UserEntity findOne(Integer id);
}
