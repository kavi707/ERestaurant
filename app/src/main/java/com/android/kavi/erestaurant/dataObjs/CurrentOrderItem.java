package com.android.kavi.erestaurant.dataObjs;

import android.graphics.Bitmap;

/**
 * Created by kavi707 on 8/17/15.
 *
 * @author Kavimal Wijewardana <kavi707@gmail.com>
 */
public class CurrentOrderItem {

    private Bitmap image;
    private String code;
    private String name;
    private float price;
    private int qty;
    private float total;

    public CurrentOrderItem(Bitmap image, String code, String name, float price, int qty, float total) {
        this.image = image;
        this.code = code;
        this.name = name;
        this.price = price;
        this.qty = qty;
        this.total = total;
    }

    public Bitmap getImage() {
        return image;
    }

    public void setImage(Bitmap image) {
        this.image = image;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
}
