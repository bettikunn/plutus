package com.yflog.dao.impl;

import com.yflog.dao.BucketDao;
import com.yflog.entity.Bucket;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by vincent on 9/29/16.
 */
@Repository("bucketDao")
public class BucketDaoHbImpl extends BucketDao {
    @Override
    public Bucket getByName(String name) {
        List<Bucket> buckets = (List<Bucket>) getHibernateTemplate().findByNamedParam("from Bucket as b where b.name=:name", "name", name);
        if (buckets == null || buckets.isEmpty()) {
            return null;
        }
        return buckets.get(0);
    }

    @Override
    public void save(Bucket o) {
        getHibernateTemplate().save(o);
    }

    @Override
    public void update(Bucket o) {
        getHibernateTemplate().update(o);
    }

    @Override
    public void delete(Bucket o) {
        getHibernateTemplate().delete(o);
    }

    @Override
    public Bucket getById(int id) {
        return getHibernateTemplate().get(Bucket.class, id);
    }
}
