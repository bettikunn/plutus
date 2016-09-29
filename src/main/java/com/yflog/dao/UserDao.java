package com.yflog.dao;

import com.yflog.entity.User;

/**
 * Created by vincent on 9/28/16.
 */
public abstract class UserDao extends AbstractHibernateDao<User>  {
    public abstract User getByUsername(String name);

    public abstract User getByEmail(String email);
}
