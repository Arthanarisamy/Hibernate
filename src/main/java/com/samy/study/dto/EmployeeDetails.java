package com.samy.study.dto;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by arthanarisamya on 9/11/16.
 */
@Entity
@Table(name = "TB_EMPLOYEE_DETAILS")
public class EmployeeDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
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

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "EmployeeDetails{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", joinedDate=" + joinedDate +
                ", designation='" + designation + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
