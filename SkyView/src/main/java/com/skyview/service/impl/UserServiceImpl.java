package com.skyview.service.impl;

import com.skyview.dao.UserDao;
import com.skyview.dao.impl.UserDaoImpl;
import com.skyview.model.User;
import com.skyview.service.UserService;

/**
 * Created by yys on 2017/5/27.
 */
public class UserServiceImpl implements UserService{
    private UserDao userDao;
    public void add(User user){
        userDao.add(user);
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
