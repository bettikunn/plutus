package com.yflog.service;

import com.yflog.dao.TagDao;
import com.yflog.entity.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by vincent on 9/29/16.
 */
@Service("tagService")
public class TagService {

    @Autowired
    private TagDao tagDao;

    public TagDao getTagDao() {
        return tagDao;
    }

    public void setTagDao(TagDao tagDao) {
        this.tagDao = tagDao;
    }

    public void save(Tag tag) {
        tagDao.save(tag);
    }

    public void update(Tag tag) {
        tagDao.update(tag);
    }

    public void delete(Tag tag) {
        tagDao.delete(tag);
    }

    public Tag getById(int id) {
        return tagDao.getById(id);
    }

    public Tag getByName(String name) {
        return tagDao.getByName(name);
    }
}

