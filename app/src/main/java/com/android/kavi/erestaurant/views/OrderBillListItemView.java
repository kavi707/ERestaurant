package com.android.kavi.erestaurant.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.android.kavi.erestaurant.R;
import com.android.kavi.erestaurant.dataObjs.OrderBillItem;

/**
 * Created by kavi707 on 8/24/15.
 *
 * @author Kavimal Wijewardana <kavi707@gmail.com>
 */
public class OrderBillListItemView extends RelativeLayout {

    private TextView itemCodeTextView;
    private TextView itemNameTextView;
    private TextView itemUnitPriceTextView;
    private TextView itemQtyTextView;
    private TextView itemPriceTextView;

    private OrderBillItem orderBillItem;
    private Context context;

    public OrderBillListItemView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();

        itemCodeTextView = (TextView) findViewById(R.id.billItemCodeTextView);
        itemNameTextView = (TextView) findViewById(R.id.billItemNameTextView);
        itemUnitPriceTextView = (TextView) findViewById(R.id.billItemUnitPriceTextView);
        itemQtyTextView = (TextView) findViewById(R.id.billItemQtyTextView);
        itemPriceTextView = (TextView) findViewById(R.id.billItemPriceTextView);
    }

    public OrderBillItem getOrderBillItem() {
        return orderBillItem;
    }

    public void setOrderBillItem(OrderBillItem orderBillItem) {
        this.orderBillItem = orderBillItem;

        itemCodeTextView.setText(orderBillItem.getBillItemCode());
        itemNameTextView.setText(orderBillItem.getBillItemName());
        itemUnitPriceTextView.setText(String.valueOf(orderBillItem.getBillItemUnitPrice()));
        itemQtyTextView.setText(String.valueOf(orderBillItem.getBillItemQty()));
        itemPriceTextView.setText(String.valueOf(orderBillItem.getBillItemPrice()));
    }
}
