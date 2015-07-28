package com.android.kavi.erestaurant.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.android.kavi.erestaurant.R;
import com.android.kavi.erestaurant.dataObjs.SelectedItem;

/**
 * Created by kavi707 on 6/2/15.
 * @author Kavimal Wijewardana <kavi707@gmail.com>
 */
public class SelectedListItem extends RelativeLayout {

    private TextView itemNameTextView;
    private TextView itemPriceTextView;

    private SelectedItem selectedListItem;

    public SelectedListItem(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();

        itemNameTextView = (TextView) findViewById(R.id.itemNameTextView);
        itemPriceTextView = (TextView) findViewById(R.id.priceTextView);
    }

    public SelectedItem getSelectedItem() {
        return selectedListItem;
    }

    public void setSelectedItem(SelectedItem selectedItem) {
        this.selectedListItem = selectedListItem;

        itemNameTextView.setText(selectedItem.getSelectedItemName());
        itemPriceTextView.setText("$ " + selectedItem.getSelectedItemPrice());
    }
}
