package com.crm.dao.impl;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.model.naming.ImplicitNamingStrategyJpaCompliantImpl;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateSessionFactory {

    private static final String CFG_FILE_LOCATION = "/Hibernate.cfg.xml";

    private static final ThreadLocal<Session> threadLocal = new ThreadLocal<Session>();

    private static final Configuration cfg = new Configuration()
            .configure(CFG_FILE_LOCATION);

    private static ServiceRegistry registry;

    private static SessionFactory sessionFactory;

    public static Session currentSession() throws HibernateException {
        Session session = threadLocal.get();

        if (session == null || session.isOpen() == false) {

            if (sessionFactory == null) {
                StandardServiceRegistry standardRegistry = new StandardServiceRegistryBuilder()
                        .configure().build();
                Metadata metadata = new MetadataSources(standardRegistry)
                        .getMetadataBuilder()
                        .applyImplicitNamingStrategy(
                                ImplicitNamingStrategyJpaCompliantImpl.INSTANCE)
                        .build();
                sessionFactory = metadata
                        .getSessionFactoryBuilder().build();
            }

            session = sessionFactory.openSession();
            threadLocal.set(session);

        }

        return session;
    }

    public static void closeSession() throws HibernateException {
        Session session = threadLocal.get();
        threadLocal.set(null);
        if (session != null) {
            session.close();
        }
    }

}