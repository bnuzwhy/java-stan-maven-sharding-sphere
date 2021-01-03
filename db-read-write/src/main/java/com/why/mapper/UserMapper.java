package com.why.mapper;

import com.why.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {

    @Insert("insert into tab_user values(#{id},#{name},#{sex},#{age},#{createTime},#{updateTime},#{status})")
    int insertUser(User user);

    @Select("select * from tab_user")
    List<User> selectUsers();
}
