package com.yflog.dao;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import javax.annotation.Resource;

/**
 * Created by vincent on 9/28/16.
 */
public abstract class AbstractHibernateDao<T> extends HibernateDaoSupport {

    @Resource
    public void setSessionFactory0(SessionFactory sessionFactory){
        super.setSessionFactory(sessionFactory);
    }


    public abstract void save(T o);

    public abstract void update(T o);

    public abstract void delete(T o);

    public abstract T getById(int id);
}
