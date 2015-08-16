package com.android.kavi.erestaurant.dataObjs;

/**
 * Created by kavi707 on 6/2/15.
 * @author Kavimal Wijewardana <kavi707@gmail.com>
 */
public class ReadyItem {

    private String readyTableName;
    private String readyItemName;
    private int itemQty;

    public ReadyItem(String readyItemName, String readyTableName, int itemQty) {
        this.readyTableName = readyTableName;
        this.readyItemName = readyItemName;
        this.itemQty = itemQty;
    }

    public String getReadyItemName() {
        return readyItemName;
    }

    public void setReadyItemName(String readyItemName) {
        this.readyItemName = readyItemName;
    }

    public String getReadyTableName() {
        return readyTableName;
    }

    public void setReadyTableName(String readyTableName) {
        this.readyTableName = readyTableName;
    }

    public int getItemQty() {
        return itemQty;
    }

    public void setItemQty(int itemQty) {
        this.itemQty = itemQty;
    }
}
