package com.yflog.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

/**
 * Created by vincent on 9/28/16.
 */
public interface AbstractHibernateDao<T> {

    void save(T o);

    void update(T o);

    void delete(T o);

    T getById(int id);
}
