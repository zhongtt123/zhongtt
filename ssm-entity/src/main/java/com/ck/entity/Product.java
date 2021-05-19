package com.ck.entity;

import java.util.Date;

/**
 * @Author 钟婷婷
 * @Date
 */
public class Product {
    private int id;
    private String name;
    private Double price;
    private int stock;
    private Date time;
    private String img;

    public Product(int id, String name, Double price, int stock, Date time, String img) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.time = time;
        this.img = img;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
