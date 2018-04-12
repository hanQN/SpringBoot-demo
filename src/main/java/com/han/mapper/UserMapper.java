package com.han.mapper;

import com.han.bean.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by 123 on 2018/4/11.
 */
@Mapper
public interface UserMapper {
    @Select("select * from user where name = #{name}")
    User findByName(@Param("name") String name);

    @Insert("insert user(name, age) values(#{name}, #{age})")
    int insert(@Param("name") String name, @Param("age") Integer age);

}
