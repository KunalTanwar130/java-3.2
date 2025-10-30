package com.student.hibernate.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.student.hibernate.entity.Student;

public class HibernateUtil {
    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        try {
            Configuration cfg = new Configuration();
            cfg.configure(); // loads hibernate.cfg.xml
            cfg.addAnnotatedClass(Student.class);
            return cfg.buildSessionFactory();
        } catch (Exception e) {
            throw new RuntimeException("Error building SessionFactory: " + e);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
