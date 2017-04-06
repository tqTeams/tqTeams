package com.team.com.team.jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by Administrator on 2017/4/6.
 */
@Entity
public class User {
    @Id
    @GeneratedValue
    private long id;

    private String userName;
    private String firstName;
    private String lastName;
    private Date createdDate;

    private Boolean isActive;
}
