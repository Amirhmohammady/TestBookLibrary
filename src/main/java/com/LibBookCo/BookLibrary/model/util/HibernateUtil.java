package com.LibBookCo.BookLibrary.model.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by Faez on 6/26/2015.
 */
public class HibernateUtil {
    private static SessionFactory sessionFactory;

    public HibernateUtil() {
        try {
            if (sessionFactory == null)
                sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();//Configuration().configure().buildSessionFactory();
        } catch (Exception e) {
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>1");
            e.printStackTrace();
            System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<1");
        }
    }

    public Session getSessin() {
        return sessionFactory.openSession();
    }
}
