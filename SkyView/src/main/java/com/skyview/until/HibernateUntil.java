package com.skyview.until;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * Created by yys on 2017/5/27.
 */
public  class HibernateUntil {
    private static SessionFactory sessionFactory = null;
    static {
        Configuration configiguration = new Configuration().configure();
        ServiceRegistryBuilder builder = new ServiceRegistryBuilder().applySettings(configiguration.getProperties());
        ServiceRegistry registry = builder.buildServiceRegistry();
        sessionFactory = configiguration.buildSessionFactory(registry);
    }
    public SessionFactory getSessionFactory(){
        return sessionFactory;
    }
}
