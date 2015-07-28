package com.android.kavi.erestaurant.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.android.kavi.erestaurant.R;
import com.android.kavi.erestaurant.dataObjs.ActiveTableItem;
import com.android.kavi.erestaurant.dataObjs.ReadyItem;

/**
 * Created by kavi707 on 6/2/15.
 * @author Kavimal Wijewardana <kavi707@gmail.com>
 */
public class ReadyItemsListItem extends RelativeLayout {

    private TextView readyItemNameTextView;
    private TextView servedTableNumberTextView;

    private ReadyItem readyItem;

    public ReadyItemsListItem(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();

        readyItemNameTextView = (TextView) findViewById(R.id.readyItemName);
        servedTableNumberTextView = (TextView) findViewById(R.id.servedTableName);
    }

    public ReadyItem getReadyItem() {
        return readyItem;
    }

    public void setReadyItem(ReadyItem readyItem) {
        this.readyItem = readyItem;

        readyItemNameTextView.setText(readyItem.getReadyItemName());
        servedTableNumberTextView.setText(readyItem.getSeveredTableNumber());
    }
}
