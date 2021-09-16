package com.baizhi.service;

import com.baizhi.entity.User;

import java.util.List;

public interface UserService {
    //查所有
    List<User> queryAll();
    //添加
    void add();
    //删除
    void remove(String id);
    //修改
    void change();
    //查一个
    User queryOne();
}
