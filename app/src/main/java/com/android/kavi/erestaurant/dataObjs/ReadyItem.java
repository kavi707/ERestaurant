package com.android.kavi.erestaurant.dataObjs;

/**
 * Created by kavi707 on 6/2/15.
 * @author Kavimal Wijewardana <kavi707@gmail.com>
 */
public class ReadyItem {

    private String readyItemName;
    private String severedTableNumber;

    public ReadyItem(String readyItemName, String severedTableNumber) {
        this.readyItemName = readyItemName;
        this.severedTableNumber = severedTableNumber;
    }

    public String getReadyItemName() {
        return readyItemName;
    }

    public void setReadyItemName(String readyItemName) {
        this.readyItemName = readyItemName;
    }

    public String getSeveredTableNumber() {
        return severedTableNumber;
    }

    public void setSeveredTableNumber(String severedTableNumber) {
        this.severedTableNumber = severedTableNumber;
    }
}
