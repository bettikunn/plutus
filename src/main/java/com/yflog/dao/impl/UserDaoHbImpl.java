package com.yflog.dao.impl;

import com.yflog.dao.UserDao;
import com.yflog.entity.User;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;


/**
 * Created by vincent on 9/28/16.
 */
@Repository("userDao")
public class UserDaoHbImpl extends UserDao {

    @Override
    @Transactional
    public void save(User user) {
        getHibernateTemplate().save(user);
    }

    @Override
    public void update(User user) {
        getHibernateTemplate().update(user);
    }

    @Override
    public void delete(User user) {
        getHibernateTemplate().delete(user);
    }

    @Override
    public User getById(int id) {
         return getHibernateTemplate().get(User.class, id);
    }

    @Override
    public User getByUsername(String name) {
        List<User> users = (List<User>) getHibernateTemplate().findByNamedParam("from User u where u.username=:name", "name", name);
        if (users== null || users.isEmpty())
            return null;

        return users.get(0);
    }

    @Override
    public User getByEmail(String email) {
        List<User> users = (List<User>) getHibernateTemplate().findByNamedParam("from User u where u.email=:email", "email", email);
        if (users== null || users.isEmpty())
            return null;

        return users.get(0);
    }
}
