package com.android.kavi.erestaurant.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.android.kavi.erestaurant.R;
import com.android.kavi.erestaurant.dataObjs.CurrentOrderItem;
import com.android.kavi.erestaurant.views.CurrentOrderItemView;

import java.util.List;

/**
 * Created by kavi707 on 8/17/15.
 *
 * @author Kavimal Wijewardana <kavi707@gmail.com>
 */
public class CurrentOrderItemAdapter extends BaseAdapter {

    private List<CurrentOrderItem> currentOrderItemList;
    private Context context;

    public CurrentOrderItemAdapter(List<CurrentOrderItem> currentOrderItemList, Context context) {
        this.currentOrderItemList = currentOrderItemList;
        this.context = context;
    }

    @Override
    public int getCount() {
        return currentOrderItemList.size();
    }

    @Override
    public Object getItem(int position) {
        return (currentOrderItemList == null)?null:currentOrderItemList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        CurrentOrderItemView currentOrderItemView;
        if (convertView == null) {
            currentOrderItemView = (CurrentOrderItemView) View.inflate(context, R.layout.list_item_current_order, null);
        } else {
            currentOrderItemView = (CurrentOrderItemView) convertView;
        }

        currentOrderItemView.setCurrentOrderItem(currentOrderItemList.get(position));
        return currentOrderItemView;
    }
}
