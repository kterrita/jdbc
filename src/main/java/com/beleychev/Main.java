package com.beleychev;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.*;

/**
 * Created by ilya on 16.06.2015.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Main.xml");
        SpitterDAO spitterDAO = (SpitterDAO) context.getBean("spitterDAO");
        Spitter spitter = spitterDAO.getSpitterById(2);
        System.out.println(spitter);
        spitter = spitterDAO.getSpitterById(4);
        System.out.println(spitter);
    }
}
