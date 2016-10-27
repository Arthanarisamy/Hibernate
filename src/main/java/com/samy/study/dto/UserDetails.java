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

    @Column(name = "DESIGNATION")
    private String designation;
    @Column(name = "DESCRIPTION")
    private String description;
    /*@Embedded
    private Address homeAddress;
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "street", column = @Column(name = "OFFICE_STREET_NAME")),
            @AttributeOverride(name = "city", column = @Column(name = "OFFICE_CITY_NAME")),
            @AttributeOverride(name = "state", column = @Column(name = "OFFICE_STATE_NAME")),
            @AttributeOverride(name = "pincode", column = @Column(name = "OFFICE_PINCODE"))
    })
    private Address officeAddress;*/
    @ElementCollection(fetch = FetchType.EAGER)
    @JoinTable(name = "TB_USER_ADDRESS", joinColumns = @JoinColumn(name = "USER_ID"))
//    @GenericGenerator(name = "Hib-Gen", strategy = "sequence")
//    @CollectionId(type = @Type(type = "int"), columns = @Column(name = "ADDRESS_ID"), generator = "Hib-Gen")
    private Collection<Address> addresses = new ArrayList<Address>();

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

    public Collection<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(Collection<Address> addresses) {
        this.addresses = addresses;
    }

    @Override
    public String toString() {
        return "UserDetails{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", joinedDate=" + joinedDate +
                ", designation='" + designation + '\'' +
                ", description='" + description + '\'' +
                ", addresses=" + addresses +
                '}';
    }
}
