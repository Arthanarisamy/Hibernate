package com.samy.study.dto;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Created by arthanarisamya on 8/11/16.
 */
@Entity(name = "TB_FOUR_WHEELER")
public class FourWheeler extends Vehicle{
    private String steeringWheel;

    public String getSteeringWheel() {
        return steeringWheel;
    }

    public void setSteeringWheel(String steeringWheel) {
        this.steeringWheel = steeringWheel;
    }
}
