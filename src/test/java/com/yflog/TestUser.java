package com.yflog;

import com.yflog.entity.User;
import com.yflog.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

/**
 * Created by vincent on 9/28/16.
 */
public class TestUser {
    @Test
    public void test() {
        Session session = HibernateUtil.getSession();
        User user = new User();
        user.setUsername("VincentZhang");
        user.setPassword("sdfadzhanfg");
        user.setEmail("vinct.zh@gmail.com");
        Transaction transaction = session.beginTransaction();

        session.save(user);

        transaction.commit();

        session.close();
    }
}
