package com.yflog.service;

import com.yflog.dao.UserDao;
import com.yflog.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by vincent on 9/28/16.
 */
@Service("userService")
public class UserService {

    @Autowired
    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void save(User user) {
        userDao.save(user);
    }

    public void update(User user) {
        userDao.update(user);
    }

    public void delete(User user) {
        userDao.delete(user);
    }


    public User getById(int id) {
        return userDao.getById(id);
    }

    public User getByUserName(String name) {
        return userDao.getByUsername(name);
    }

    public User getByEmail(String email) {
        return userDao.getByEmail(email);
    }
}
