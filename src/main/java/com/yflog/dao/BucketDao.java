package com.yflog.dao;

import com.yflog.entity.Bucket;

/**
 * Created by vincent on 9/29/16.
 */
public abstract class BucketDao extends AbstractHibernateDao<Bucket> {
    public abstract Bucket getByName(String name);
}
