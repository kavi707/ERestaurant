package com.android.kavi.erestaurant.views;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.android.kavi.erestaurant.R;
import com.android.kavi.erestaurant.dataObjs.ActiveTableItem;
import com.android.kavi.erestaurant.dataObjs.ReadyItem;

/**
 * Created by kavi707 on 6/2/15.
 * @author Kavimal Wijewardana <kavi707@gmail.com>
 */
public class ReadyItemsListItemView extends RelativeLayout {

    private TextView readyTableNameTextView;
    private TextView readyItemNameTextView;
    private TextView itemQtyTextView;

    private ReadyItem readyItem;

    public ReadyItemsListItemView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();

        readyTableNameTextView = (TextView) findViewById(R.id.readyTableNameTextView);
        readyItemNameTextView = (TextView) findViewById(R.id.readyItemNameTextView);
        itemQtyTextView = (TextView) findViewById(R.id.itemQtyTextView);
    }

    public ReadyItem getReadyItem() {
        return readyItem;
    }

    public void setReadyItem(ReadyItem readyItem) {
        this.readyItem = readyItem;

        readyTableNameTextView.setText(readyItem.getReadyTableName());
        readyItemNameTextView.setText(readyItem.getReadyItemName());
        itemQtyTextView.setText(String.valueOf(readyItem.getItemQty()));
    }
}
