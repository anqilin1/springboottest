package com.example.demo.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by AnQiLin on 2018/7/10.
 * 用户
 */
@Entity
public class Customer {

    public Customer(String name) {
        this.name = name;
        this.createTime = new Date();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime;

    private String name;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
