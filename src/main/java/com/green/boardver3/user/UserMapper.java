package com.green.boardver3.user;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    int insBoard(UserEntity entity);
}