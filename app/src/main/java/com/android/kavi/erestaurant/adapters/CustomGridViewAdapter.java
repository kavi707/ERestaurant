package com.android.kavi.erestaurant.adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.kavi.erestaurant.R;
import com.android.kavi.erestaurant.dataObjs.GridItem;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kavi707 on 6/2/15.
 * @author Kavimal Wijewardana <kavi707@gmail.com>
 */
public class CustomGridViewAdapter extends ArrayAdapter<GridItem> {

    private Context context;
    private int layoutResourceId;
    private List<GridItem> data = new ArrayList<>();

    public CustomGridViewAdapter(Context context, int layoutResourceId, List<GridItem> data) {
        super(context, layoutResourceId, data);
        this.layoutResourceId = layoutResourceId;
        this.context = context;
        this.data = data;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        RecordHolder holder = null;

        if (row == null) {
            LayoutInflater inflater = ((Activity) context).getLayoutInflater();
            row = inflater.inflate(layoutResourceId, parent, false);

            holder = new RecordHolder();
            holder.txtTitle = (TextView) row.findViewById(R.id.item_text);
            holder.imageItem = (ImageView) row.findViewById(R.id.item_image);
            row.setTag(holder);
        } else {
            holder = (RecordHolder) row.getTag();
        }

        GridItem item = data.get(position);
        holder.txtTitle.setText(item.getTitle());
        holder.imageItem.setImageBitmap(item.getImage());
        return row;

    }

    static class RecordHolder {
        TextView txtTitle;
        ImageView imageItem;
    }
}
