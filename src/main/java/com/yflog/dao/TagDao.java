package com.yflog.dao;

import com.yflog.entity.Tag;

/**
 * Created by vincent on 9/29/16.
 */
public abstract class TagDao extends AbstractHibernateDao<Tag> {
    public abstract Tag getByName(String name);
}
