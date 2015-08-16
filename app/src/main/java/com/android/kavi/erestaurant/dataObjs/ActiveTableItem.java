package com.android.kavi.erestaurant.dataObjs;

/**
 * Created by kavi707 on 6/2/15.
 * @author Kavimal Wijewardana <kavi707@gmail.com>
 */
public class ActiveTableItem {

    private String activeTableName;
    private String activeTableId;

    public ActiveTableItem(String activeTableId, String activeTableName) {
        this.activeTableId = activeTableId;
        this.activeTableName = activeTableName;
    }

    public String getActiveTableName() {
        return activeTableName;
    }

    public void setActiveTableName(String activeTableName) {
        this.activeTableName = activeTableName;
    }

    public String getActiveTableId() {
        return activeTableId;
    }

    public void setActiveTableId(String activeTableId) {
        this.activeTableId = activeTableId;
    }
}
