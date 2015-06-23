package com.android.kavi.erestaurant.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.android.kavi.erestaurant.R;
import com.android.kavi.erestaurant.dataObjs.OrderItem;

/**
 * Created by kavi707 on 6/2/15.
 * @author Kavimal Wijewardana <kavi707@gmail.com>
 */
public class OrderListItem extends LinearLayout {

    private TextView orderNameTextView;
    private TextView orderDescriptionTextView;

    private OrderItem orderItem;

    public OrderListItem(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();

        orderNameTextView = (TextView) findViewById(R.id.orderNameTextView);
        orderDescriptionTextView = (TextView) findViewById(R.id.orderDescrionTextView);
    }

    public OrderItem getOrderItem() {
        return orderItem;
    }

    public void setOrderItem(OrderItem orderItem) {
        this.orderItem = orderItem;

        orderNameTextView.setText(orderItem.getOrderName());
        orderDescriptionTextView.setText(orderItem.getOrderDescription());
    }
}
