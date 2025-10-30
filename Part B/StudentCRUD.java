package com.student.hibernate.main;

import com.student.hibernate.entity.Student;
import com.student.hibernate.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class StudentCRUD {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        Student s1 = new Student();
        s1.setName("Kunal Rajput");
        s1.setCourse("Computer Engineering");
        s1.setMarks(90);
        session.persist(s1);

        Student s2 = session.get(Student.class, s1.getId());
        System.out.println("Fetched Student: " + s2.getName());

        s2.setMarks(95);
        session.merge(s2);

        session.remove(s2);

        tx.commit();
        session.close();
    }
}
