package com.skyview.dao.impl;

import com.skyview.base.BaseDao;
import com.skyview.dao.UserDao;
import com.skyview.model.User;
import com.skyview.until.HibernateUntil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * Created by yys on 2017/5/27.
 */
public class UserDaoImpl extends BaseDao implements UserDao{
    public void add(User user) {
        this.getSessionFactory().getCurrentSession().save(user);
        System.out.println("save user");
//        HibernateUntil hibernateUntil =  new HibernateUntil();
//        SessionFactory sessionFactory = hibernateUntil.getSessionFactory();
//        Session session = sessionFactory.openSession();
//        Transaction transaction = session.beginTransaction();
//        session.save(user);
//        transaction.commit();
//        session.close();
//        sessionFactory.close();
    }
}
