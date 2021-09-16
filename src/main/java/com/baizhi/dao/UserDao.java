package com.baizhi.dao;

import com.baizhi.entity.User;

import java.util.List;

public interface UserDao {
    //查所有
    List<User> selectAll();
    //添加
    void insert();
    //删除
    void delete(String id);
    //修改
    void update();
    //查一个
    User selectOne();
}
