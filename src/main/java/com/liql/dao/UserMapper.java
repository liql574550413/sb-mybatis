package com.liql.dao;

import com.liql.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

     User selectById(int id);

}
