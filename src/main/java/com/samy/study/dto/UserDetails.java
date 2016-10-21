package com.samy.study.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

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

    @Override
    public String toString() {
        return "UserDetails{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                '}';
    }
}
