package com.jacky.spring5.service;

import com.jacky.spring5.dao.UserDao;
import com.jacky.spring5.dao.UserDaoImpl;

/**
 * 2022/4/2
 */
public class UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add(){
        System.out.println("service add..");
        userDao.update();
        //原始方式
//        UserDao dao  = new UserDaoImpl();
//        dao.update();
    }
}
