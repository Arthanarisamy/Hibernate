package com.samy.study.dto.com.samy.study.service;

import com.samy.study.dto.EmployeeDetails;
import com.samy.study.dto.UserDetails;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Date;

/**
 * Created by arthanarisamya on 9/11/16.
 */
public class HibernateCRUDTest {

    public static void main(String args[]){
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        EmployeeDetails employee = session.get(EmployeeDetails.class, 2);
        employee.setUserName(employee.getUserName() + " Updated");
        session.update(employee);
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
        System.out.println(employee);

    }
}
