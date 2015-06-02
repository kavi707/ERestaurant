package com.android.kavi.erestaurant.dataObjs;

/**
 * Created by kavi707 on 6/2/15.
 */
public class OrderItem {

    private String orderName;
    private String orderDescription;

    public OrderItem(String orderName, String orderDescription) {
        this.orderName = orderName;
        this.orderDescription = orderDescription;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public String getOrderDescription() {
        return orderDescription;
    }

    public void setOrderDescription(String orderDescription) {
        this.orderDescription = orderDescription;
    }
}
