package com.android.kavi.erestaurant.dataObjs;

/**
 * Created by kavi707 on 6/2/15.
 * @author Kavimal Wijewardana <kavi707@gmail.com>
 */
public class ActiveTableItem {

    private String tableNumber;
    private String lastItemName;

    public ActiveTableItem(String tableNumber, String lastItemName) {
        this.tableNumber = tableNumber;
        this.lastItemName = lastItemName;
    }

    public String getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(String tableNumber) {
        this.tableNumber = tableNumber;
    }

    public String getLastItemName() {
        return lastItemName;
    }

    public void setLastItemName(String lastItemName) {
        this.lastItemName = lastItemName;
    }
}
