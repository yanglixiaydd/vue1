package com.baizhi.service.impl;

import com.baizhi.dao.UserDao;
import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;
    @Override
    public List<User> queryAll() {
        return userDao.selectAll();
    }

    @Override
    public void add() {
        userDao.insert();
    }

    @Override
    public void remove(String id) {
        userDao.delete(id);
    }

    @Override
    public void change() {
        userDao.update();
    }

    @Override
    public User queryOne() {
        return userDao.selectOne();
    }
}
