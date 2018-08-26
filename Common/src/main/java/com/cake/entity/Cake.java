package com.cake.entity;

import java.util.Date;


/**
 * 蛋糕
 */
public class Cake {
    private Long id;
    private Long categoryId;
    private String name;

    /**
     * 级别 几颗星
     */
    private  Integer level;
    /**
     * 价格整型
     */
    private Integer price;
    private byte[] samllImg;

    private Date createTime;
    private Date updateTime;

    public Long getId() {
        return id;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public String getName() {
        return name;
    }

    public Integer getLevel() {
        return level;
    }

    public Integer getPrice() {
        return price;
    }

    public byte[] getSamllImg() {
        return samllImg;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public void setSamllImg(byte[] samllImg) {
        this.samllImg = samllImg;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
