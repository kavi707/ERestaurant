package com.android.kavi.erestaurant.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.android.kavi.erestaurant.R;
import com.android.kavi.erestaurant.dataObjs.OrderItem;
import com.android.kavi.erestaurant.views.OrderListItem;

import java.util.List;

/**
 * Created by kavi707 on 6/2/15.
 * @author Kavimal Wijewardana <kavi707@gmail.com>
 */
public class OrderItemAdapter extends BaseAdapter {

    private List<OrderItem> ordersList;
    private Context context;

    public OrderItemAdapter(List<OrderItem> ordersList, Context context) {
        this.ordersList = ordersList;
        this.context = context;
    }

    @Override
    public int getCount() {
        return ordersList.size();
    }

    @Override
    public Object getItem(int position) {
        return (ordersList == null)?null:ordersList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        OrderListItem orderListItem;
        if (convertView == null) {
            orderListItem = (OrderListItem) View.inflate(context, R.layout.list_item, null);
        } else {
            orderListItem = (OrderListItem) convertView;
        }

        orderListItem.setOrderItem(ordersList.get(position));
        return orderListItem;
    }
}
