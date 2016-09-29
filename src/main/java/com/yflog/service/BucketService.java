package com.yflog.service;

import com.yflog.dao.BucketDao;
import com.yflog.entity.Bucket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by vincent on 9/29/16.
 */
@Service("bucketService")
public class BucketService {
    @Autowired
    private BucketDao bucketDao;

    public void save(Bucket bucket) {
        bucketDao.save(bucket);
    }

    public void update(Bucket bucket) {
        bucketDao.update(bucket);
    }

    public void delete(Bucket bucket) {
        bucketDao.delete(bucket);
    }

    public Bucket getById(int id) {
        return bucketDao.getById(id);
    }

    public Bucket getByName(String name) {
        return bucketDao.getByName(name);
    }
}
