package com.samy.study.dto.com.samy.study.service;

import com.samy.study.dto.Address;
import com.samy.study.dto.UserDetails;
import com.samy.study.dto.Vehicle;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Date;

/**
 * Created by arthanarisamya on 20/10/16.
 */
public class UserDetailsService {

    public static void main(String args[]){

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();
        UserDetails userDetails = createUserDetails();
        Vehicle vehicle = createVehicleDetails("Bike");
//        vehicle.setUserDetail(userDetails);
        Vehicle vehicle2 = createVehicleDetails("Jeep");
//        vehicle2.setUserDetail(userDetails);
        userDetails.getVehicles().add(vehicle);
        userDetails.getVehicles().add(vehicle2);
        session.persist(userDetails);
//        session.save(vehicle);
//        session.save(vehicle2);
        session.getTransaction().commit();
        session.close();

        // Reading the value from DB
//        session = sessionFactory.openSession();
        userDetails = null; // Initializing to null
//        userDetails = session.get(UserDetails.class, 1504);
//        session.close();
        sessionFactory.close();
        System.out.println("Done.......");
    }

    public static UserDetails createUserDetails(){
        UserDetails userDetails = new UserDetails();
        userDetails.setUserId(1504);
        userDetails.setUserName("Samy A");
        userDetails.setDesignation("Designation");
        userDetails.setJoinedDate(new Date());
//        userDetails.setVehicle(createVehicleDetails());
        return userDetails;
    }

    public static Vehicle createVehicleDetails(String vehicleName) {
        Vehicle vehicle = new Vehicle();
        vehicle.setVehicleName(vehicleName);
        return vehicle;
    }
}
