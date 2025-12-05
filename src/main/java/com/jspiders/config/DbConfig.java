package com.jspiders.config;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DbConfig {
    private static SessionFactory sessionFactory;
    static
    {
        //load config
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        System.out.println(" Loading configuration");

        sessionFactory = configuration.buildSessionFactory();
        System.out.println("Build SessionFactory");
    }

    public static Session getSession()
    {
        Session session = sessionFactory.openSession();
        System.out.println("Session Opened");
        return session;
    }

    public static void shutdown()
    {
        sessionFactory.close();
        System.out.println("Session Factory Closed");
    }
}
