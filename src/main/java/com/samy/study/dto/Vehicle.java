package com.samy.study.dto;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by arthanarisamya on 27/10/16.
 */
@Entity
@Table(name = "TB_VEHICLES")
@Inheritance(strategy = InheritanceType.JOINED)
public class Vehicle implements Serializable {
    @Id
    @GeneratedValue
//    @GenericGenerator(name = "vehicle-id",strategy = "sequence")
    private int vehicleId;
    private String vehicleName;

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleId=" + vehicleId +
                ", vehicleName='" + vehicleName + '\'' +
                '}';
    }
}
