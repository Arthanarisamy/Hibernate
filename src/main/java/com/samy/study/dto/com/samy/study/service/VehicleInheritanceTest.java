package com.samy.study.dto.com.samy.study.service;

import com.samy.study.dto.FourWheeler;
import com.samy.study.dto.TwoWheeler;
import com.samy.study.dto.Vehicle;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by arthanarisamya on 8/11/16.
 */
public class VehicleInheritanceTest {

    public static void main(String args[]){

        Vehicle vehicle = new Vehicle();
        vehicle.setVehicleName("RE");

        TwoWheeler twoWheeler = new TwoWheeler();
        twoWheeler.setVehicleName("Bullet");
        twoWheeler.setSteeringHandle("Old Model Flat bar");

        FourWheeler fourWheeler = new FourWheeler();
        fourWheeler.setVehicleName("Esteem");
        fourWheeler.setSteeringWheel("Power Steering");

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.getTransaction().begin();

        session.save(vehicle);
        session.save(twoWheeler);
        session.save(fourWheeler);

        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
        System.out.println("Done.......");

    }

}
