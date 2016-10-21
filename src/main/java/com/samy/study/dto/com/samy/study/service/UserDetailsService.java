package com.samy.study.dto.com.samy.study.service;

import com.samy.study.dto.UserDetails;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by arthanarisamya on 20/10/16.
 */
public class UserDetailsService {

    public static void main(String args[]){

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        UserDetails userDetails = createUserDetails();

        session.save(userDetails);
        session.getTransaction().commit();
        session.close();

        sessionFactory.close();
        System.out.println("Done.......");
    }

    public static UserDetails createUserDetails(){
        UserDetails userDetails = new UserDetails();
        userDetails.setUserId(1504);
        userDetails.setUserName("Samy A");
        return userDetails;
    }
}
