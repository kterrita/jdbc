package com.beleychev;

import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by ilya on 16.06.2015.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Main.xml");
        SpitterDAO spitterDAO = new HibernateSpitterDAO((SessionFactory)context.getBean("sessionFactory"));
        System.out.println(spitterDAO.getSpitterById(3));
    }
}
