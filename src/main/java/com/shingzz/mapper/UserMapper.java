package com.shingzz.mapper;

import com.shingzz.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
@Mapper
public interface UserMapper {
    @Select("select * from user where user_id = #{id}")
    User query(Long id);
}
