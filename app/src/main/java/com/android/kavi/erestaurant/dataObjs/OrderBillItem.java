package com.android.kavi.erestaurant.dataObjs;

/**
 * Created by kavi707 on 8/24/15.
 *
 * @author Kavimal Wijewardana <kavi707@gmail.com>
 */
public class OrderBillItem {

    private String billItemCode;
    private String billItemName;
    private float billItemUnitPrice;
    private int billItemQty;
    private float billItemPrice;

    public OrderBillItem(String billItemCode, String billItemName,
                         float billItemUnitPrice, int billItemQty, float billItemPrice) {
        this.billItemCode = billItemCode;
        this.billItemName = billItemName;
        this.billItemUnitPrice = billItemUnitPrice;
        this.billItemQty = billItemQty;
        this.billItemPrice = billItemPrice;
    }

    public String getBillItemCode() {
        return billItemCode;
    }

    public void setBillItemCode(String billItemCode) {
        this.billItemCode = billItemCode;
    }

    public String getBillItemName() {
        return billItemName;
    }

    public void setBillItemName(String billItemName) {
        this.billItemName = billItemName;
    }

    public float getBillItemUnitPrice() {
        return billItemUnitPrice;
    }

    public void setBillItemUnitPrice(float billItemUnitPrice) {
        this.billItemUnitPrice = billItemUnitPrice;
    }

    public int getBillItemQty() {
        return billItemQty;
    }

    public void setBillItemQty(int billItemQty) {
        this.billItemQty = billItemQty;
    }

    public float getBillItemPrice() {
        return billItemPrice;
    }

    public void setBillItemPrice(float billItemPrice) {
        this.billItemPrice = billItemPrice;
    }
}
