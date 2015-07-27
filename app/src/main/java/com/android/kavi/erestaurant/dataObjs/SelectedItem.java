package com.android.kavi.erestaurant.dataObjs;

/**
 * Created by kavi707 on 7/27/15.
 * @author Kavimal Wijewardana <kavi707@gmail.com>
 */
public class SelectedItem {

    private String selectedItemName;
    private float selectedItemPrice;

    public SelectedItem(String selectedItemName, float selectedItemPrice) {
        this.selectedItemName = selectedItemName;
        this.selectedItemPrice = selectedItemPrice;
    }

    public String getSelectedItemName() {
        return selectedItemName;
    }

    public void setSelectedItemName(String selectedItemName) {
        this.selectedItemName = selectedItemName;
    }

    public float getSelectedItemPrice() {
        return selectedItemPrice;
    }

    public void setSelectedItemPrice(float selectedItemPrice) {
        this.selectedItemPrice = selectedItemPrice;
    }
}
