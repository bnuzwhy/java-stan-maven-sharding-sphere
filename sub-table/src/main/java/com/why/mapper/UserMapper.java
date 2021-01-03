package com.why.mapper;

import com.why.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {

    @Insert({
            "<script>",
            "insert into tab_user values",
            "<foreach collection='list' item='user' index='index' separator=','>",
            "(#{user.id},#{user.name},#{user.sex},#{user.age},#{user.createTime},#{user.updateTime},#{user.status})",
            "</foreach>",
            "</script>"
    })
    int insertBatch(List<User> list);

    @Select("select * from tab_user order by id")
    List<User> selectAll();

    @Insert("insert into tab_user values(#{id},#{name},#{sex},#{age},#{createTime},#{updateTime},#{status})")
    int insert(User user);

    @Select("select * from tab_user where id = #{id}")
    User selectById(Long id);

    @Select("select * from tab_user where name = #{name}")
    User selectByName(String name);
}
