package com.android.kavi.erestaurant.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.android.kavi.erestaurant.R;
import com.android.kavi.erestaurant.dataObjs.ActiveTableItem;
import com.android.kavi.erestaurant.views.ActiveTableListItemView;

import java.util.List;

/**
 * Created by kavi707 on 6/2/15.
 * @author Kavimal Wijewardana <kavi707@gmail.com>
 */
public class ActiveTableItemAdapter extends BaseAdapter {

    private List<ActiveTableItem> activeTableList;
    private Context context;

    public ActiveTableItemAdapter(List<ActiveTableItem> activeTableList, Context context) {
        this.activeTableList = activeTableList;
        this.context = context;
    }

    @Override
    public int getCount() {
        return activeTableList.size();
    }

    @Override
    public Object getItem(int position) {
        return (activeTableList == null)?null:activeTableList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ActiveTableListItemView activeTableListItem;
        if (convertView == null) {
            activeTableListItem = (ActiveTableListItemView) View.inflate(context, R.layout.active_table_list_item, null);
        } else {
            activeTableListItem = (ActiveTableListItemView) convertView;
        }

        activeTableListItem.setOrderItem(activeTableList.get(position));
        return activeTableListItem;
    }
}
