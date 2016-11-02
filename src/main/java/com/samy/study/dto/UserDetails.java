package com.samy.study.dto;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.io.Serializable;
import java.util.*;

/**
 * Created by arthanarisamya on 19/10/16.
 */
@Entity
@Table(name = "TB_USER_DETAILS")
public class UserDetails implements Serializable {
    @Id
    @Column(name = "USER_ID")
    private int userId;
    @Column(name = "USER_NAME")
    private String userName;
    @Temporal(TemporalType.DATE)
    @Column(name = "JOINED_DATE")
    private Date joinedDate;

    @Column(name = "DESIGNATION")
    private String designation;
    @Column(name = "DESCRIPTION")
    private String description;
    @OneToOne
    @JoinColumn(name = "VEHILCE_ID")
    private Vehicle vehicle;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName + " From Getter.";
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getJoinedDate() {
        return joinedDate;
    }

    public void setJoinedDate(Date joinedDate) {
        this.joinedDate = joinedDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public String toString() {
        return "UserDetails{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", joinedDate=" + joinedDate +
                ", designation='" + designation + '\'' +
                ", description='" + description + '\'' +
                ", vehicle=" + vehicle +
                '}';
    }



}
