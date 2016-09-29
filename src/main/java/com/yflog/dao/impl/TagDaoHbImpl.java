package com.yflog.dao.impl;

import com.yflog.dao.TagDao;
import com.yflog.entity.Tag;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by vincent on 9/29/16.
 */
@Repository("tagDao")
public class TagDaoHbImpl extends TagDao {
    @Override
    public Tag getByName(String name) {
        List<Tag> tags = (List<Tag>) getHibernateTemplate().findByNamedParam("from Tag as t where t.name=:name", "name", name);
        if (tags == null || tags.isEmpty()) {
            return null;
        }

        return tags.get(0);
    }

    @Transactional
    @Override
    public void save(Tag tag) {
        getHibernateTemplate().save(tag);
    }

    @Override
    public void update(Tag o) {
        getHibernateTemplate().update(o);
    }

    @Override
    public void delete(Tag o) {
        getHibernateTemplate().delete(o);
    }

    @Override
    public Tag getById(int id) {
        return getHibernateTemplate().get(Tag.class, id);
    }
}
