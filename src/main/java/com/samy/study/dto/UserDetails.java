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
    @OneToMany
    @JoinTable(name = "TB_USER_VEHICLE", joinColumns = @JoinColumn(name = "USER_ID"),inverseJoinColumns =@JoinColumn(name = "VEHICLE_ID"))
    private Collection<Vehicle> vehicles = new ArrayList<Vehicle>();

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

    public Collection<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(Collection<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    @Override
    public String toString() {
        return "UserDetails{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", joinedDate=" + joinedDate +
                ", designation='" + designation + '\'' +
                ", description='" + description + '\'' +
                ", vehicles=" + vehicles +
                '}';
    }


}
