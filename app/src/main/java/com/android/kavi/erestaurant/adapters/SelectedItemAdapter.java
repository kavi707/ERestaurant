package com.android.kavi.erestaurant.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.android.kavi.erestaurant.R;
import com.android.kavi.erestaurant.dataObjs.SelectedItem;
import com.android.kavi.erestaurant.views.SelectedListItemView;

import java.util.List;

/**
 * Created by kavi707 on 6/2/15.
 * @author Kavimal Wijewardana <kavi707@gmail.com>
 */
public class SelectedItemAdapter extends BaseAdapter {

    private List<SelectedItem> selectedItemList;
    private Context context;

    public SelectedItemAdapter(List<SelectedItem> selectedItemList, Context context) {
        this.selectedItemList = selectedItemList;
        this.context = context;
    }

    @Override
    public int getCount() {
        return selectedItemList.size();
    }

    @Override
    public Object getItem(int position) {
        return (selectedItemList == null)?null:selectedItemList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        SelectedListItemView selectedListItem;
        if (convertView == null) {
            selectedListItem = (SelectedListItemView) View.inflate(context, R.layout.list_item_selected, null);
        } else {
            selectedListItem = (SelectedListItemView) convertView;
        }

        selectedListItem.setSelectedItem(selectedItemList.get(position));
        return selectedListItem;
    }
}
