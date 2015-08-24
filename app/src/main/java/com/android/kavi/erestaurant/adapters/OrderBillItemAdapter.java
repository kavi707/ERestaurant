package com.android.kavi.erestaurant.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.android.kavi.erestaurant.R;
import com.android.kavi.erestaurant.dataObjs.OrderBillItem;
import com.android.kavi.erestaurant.views.OrderBillListItemView;

import java.util.List;

/**
 * Created by kavi707 on 8/24/15.
 *
 * @author Kavimal Wijewardana <kavi707@gmail.com>
 */
public class OrderBillItemAdapter extends BaseAdapter {

    private List<OrderBillItem> orderBillItemList;
    private Context context;

    public OrderBillItemAdapter(List<OrderBillItem> orderBillItemList, Context context) {
        this.orderBillItemList = orderBillItemList;
        this.context = context;
    }

    @Override
    public int getCount() {
        return orderBillItemList.size();
    }

    @Override
    public Object getItem(int position) {
        return (orderBillItemList == null)?null:orderBillItemList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        OrderBillListItemView orderBillListItemView;
        if (convertView == null) {
            orderBillListItemView = (OrderBillListItemView) View.inflate(context, R.layout.list_item_order_bill, null);
        } else {
            orderBillListItemView = (OrderBillListItemView) convertView;
        }

        orderBillListItemView.setOrderBillItem(orderBillItemList.get(position));
        return orderBillListItemView;
    }
}
