package com.samy.study.dto;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by arthanarisamya on 19/10/16.
 */
@Entity(name = "TB_USER_DETAILS")
public class UserDetails implements Serializable {
    @Id
    @Column(name = "USER_ID")
    private int userId;
    @Column(name = "USER_NAME")
    private String userName;
    @Temporal(TemporalType.DATE)
    @Column(name = "JOINED_DATE")
    private Date joinedDate;
    @Column(name = "ADDRESS")
    private String address;
    @Column(name = "DESIGNATION")
    private String designation;
    @Column(name = "DESCRIPTION")
    private String description;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "UserDetails{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", joinedDate=" + joinedDate +
                ", address='" + address + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }
}
