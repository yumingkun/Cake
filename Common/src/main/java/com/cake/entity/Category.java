package com.cake.entity;

import java.util.Date;

public class Category {

    private Long id;
    private String name;
    private Date createTime;
    private Date upadteTime;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public Date getUpadteTime() {
        return upadteTime;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public void setUpadteTime(Date upadteTime) {
        this.upadteTime = upadteTime;
    }
}
