package com.samy.study.dto;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by arthanarisamya on 27/10/16.
 */
@Entity
@Table(name = "TB_VEHICLES")
public class Vehicle implements Serializable {
    @Id
    @GeneratedValue
//    @GenericGenerator(name = "vehicle-id",strategy = "sequence")
    private int vehicleId;
    private String vehicleName;
    @ManyToOne
    @JoinColumn(name = "USER_ID")
    private UserDetails user;

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

    public UserDetails getUser() {
        return user;
    }

    public void setUser(UserDetails user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleId=" + vehicleId +
                ", vehicleName='" + vehicleName + '\'' +
                '}';
    }
}
