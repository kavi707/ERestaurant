package com.android.kavi.erestaurant.dataObjs;

import android.graphics.Bitmap;

/**
 * Created by kavi707 on 7/27/15.
 * @author Kavimal Wijewardana <kavi707@gmail.com>
 */
public class SelectedItem {

    private Bitmap itemImage;
    private String itemCode;
    private String itemName;
    private String itemDes;
    private float itemPrice;

    public SelectedItem(Bitmap itemImage, String itemCode, String itemName, String itemDes, float itemPrice) {
        this.itemImage = itemImage;
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.itemDes = itemDes;
        this.itemPrice = itemPrice;
    }

    public Bitmap getItemImage() {
        return itemImage;
    }

    public void setItemImage(Bitmap itemImage) {
        this.itemImage = itemImage;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemDes() {
        return itemDes;
    }

    public void setItemDes(String itemDes) {
        this.itemDes = itemDes;
    }

    public float getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(float itemPrice) {
        this.itemPrice = itemPrice;
    }
}
