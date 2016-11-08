package com.samy.study.dto;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Created by arthanarisamya on 8/11/16.
 */
@Entity
@DiscriminatorValue(value = "BIKE")
public class TwoWheeler extends Vehicle {
    private String steeringHandle;

    public String getSteeringHandle() {
        return steeringHandle;
    }

    public void setSteeringHandle(String steeringHandle) {
        this.steeringHandle = steeringHandle;
    }
}
