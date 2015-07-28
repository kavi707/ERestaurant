package com.android.kavi.erestaurant.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.android.kavi.erestaurant.R;
import com.android.kavi.erestaurant.dataObjs.ActiveTableItem;

/**
 * Created by kavi707 on 6/2/15.
 * @author Kavimal Wijewardana <kavi707@gmail.com>
 */
public class ActiveTableListItem extends RelativeLayout {

    private TextView tableNumberTextView;
    private TextView lastItemNameTextView;

    private ActiveTableItem activeTableListItem;

    public ActiveTableListItem(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();

        tableNumberTextView = (TextView) findViewById(R.id.tableNumberTextView);
        lastItemNameTextView = (TextView) findViewById(R.id.lastItemsNameTextView);
    }

    public ActiveTableItem getOrderItem() {
        return activeTableListItem;
    }

    public void setOrderItem(ActiveTableItem activeTableListItem) {
        this.activeTableListItem = activeTableListItem;

        tableNumberTextView.setText(activeTableListItem.getTableNumber());
        lastItemNameTextView.setText(activeTableListItem.getLastItemName());
    }
}
