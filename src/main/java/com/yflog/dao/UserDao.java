package com.yflog.dao;

import com.yflog.entity.User;

/**
 * Created by vincent on 9/28/16.
 */
public interface UserDao extends AbstractHibernateDao<User>  {
    User getByUsername(String name);

    User getByEmail(String email);
}
