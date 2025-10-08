package org.example.springdemo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.example.springdemo.model.User;

@Mapper
public interface UserMapper {

    @Select("select * from t_user where id = #{id}")
    public User selectById(Integer id);
}
