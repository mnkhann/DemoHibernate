package com.seu.bd.Prohib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

    public Main() {

        Configuration configuration = new Configuration();
        final Configuration configure = configuration.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();


        Student student = new Student(1, "John" );



        session.save(student);
        session.getTransaction().commit();
        System.out.println(student);
    }

    public static void main(String args[]) {

        new Main();

    }
}
