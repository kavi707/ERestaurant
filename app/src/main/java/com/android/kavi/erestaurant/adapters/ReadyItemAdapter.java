package com.android.kavi.erestaurant.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.android.kavi.erestaurant.R;
import com.android.kavi.erestaurant.dataObjs.ReadyItem;
import com.android.kavi.erestaurant.views.ReadyListItemView;

import java.util.List;

/**
 * Created by kavi707 on 6/2/15.
 * @author Kavimal Wijewardana <kavi707@gmail.com>
 */
public class ReadyItemAdapter extends BaseAdapter {

    private List<ReadyItem> readyItemList;
    private Context context;

    public ReadyItemAdapter(List<ReadyItem> readyItemList, Context context) {
        this.readyItemList = readyItemList;
        this.context = context;
    }

    @Override
    public int getCount() {
        return readyItemList.size();
    }

    @Override
    public Object getItem(int position) {
        return (readyItemList == null)?null:readyItemList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ReadyListItemView readyItemListItem;
        if (convertView == null) {
            readyItemListItem = (ReadyListItemView) View.inflate(context, R.layout.list_item_ready, null);
        } else {
            readyItemListItem = (ReadyListItemView) convertView;
        }

        readyItemListItem.setReadyItem(readyItemList.get(position));
        return readyItemListItem;
    }
}
