package com.android.kavi.erestaurant.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.android.kavi.erestaurant.R;
import com.android.kavi.erestaurant.dataObjs.GridItem;
import com.android.kavi.erestaurant.views.GridItemView;

import java.util.List;

/**
 * Created by kavi707 on 6/2/15.
 * @author Kavimal Wijewardana <kavi707@gmail.com>
 */
public class CustomGridViewAdapter extends BaseAdapter /*ArrayAdapter<GridItem>*/ {

    private Context context;
    private List<GridItem> gridItemList;

    public CustomGridViewAdapter(List<GridItem> dataList, Context context) {
        this.gridItemList = dataList;
        this.context = context;
    }

    @Override
    public int getCount() {
        return gridItemList.size();
    }

    @Override
    public Object getItem(int position) {
        return (gridItemList == null)?null:gridItemList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        GridItemView gridItemView;
        if (convertView == null) {
            gridItemView = (GridItemView) View.inflate(context, R.layout.grid_item, null);
        } else {
            gridItemView = (GridItemView) convertView;
        }

        gridItemView.setGridItem(gridItemList.get(position));
        return gridItemView;
    }
}
