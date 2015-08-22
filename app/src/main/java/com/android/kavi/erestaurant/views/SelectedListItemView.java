package com.android.kavi.erestaurant.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.android.kavi.erestaurant.R;
import com.android.kavi.erestaurant.dataObjs.SelectedItem;

/**
 * Created by kavi707 on 6/2/15.
 * @author Kavimal Wijewardana <kavi707@gmail.com>
 */
public class SelectedListItemView extends RelativeLayout {

    private ImageView itemImageView;
    private TextView itemCodeTextView;
    private TextView itemNameTextView;
    private TextView itemDescriptionTextView;
    private TextView itemPriceTextView;
    private ImageView addToOrderBtn;

    private SelectedItem selectedItem;

    public SelectedListItemView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();

        itemImageView = (ImageView) findViewById(R.id.itemImageView);
        itemCodeTextView = (TextView) findViewById(R.id.itemCodeTextView);
        itemNameTextView = (TextView) findViewById(R.id.itemNameTextView);
        itemDescriptionTextView = (TextView) findViewById(R.id.itemDesTextView);
        itemPriceTextView = (TextView) findViewById(R.id.itemPriceTextView);
        addToOrderBtn = (ImageView) findViewById(R.id.addToOrderImageView);
    }

    public SelectedItem getSelectedItem() {
        return selectedItem;
    }

    public void setSelectedItem(SelectedItem selectedItem) {
        this.selectedItem = selectedItem;

        itemImageView.setImageBitmap(selectedItem.getItemImage());
        itemCodeTextView.setText(selectedItem.getItemCode());
        itemNameTextView.setText(selectedItem.getItemName());
        itemDescriptionTextView.setText(selectedItem.getItemDes());
        itemPriceTextView.setText("Rs." + selectedItem.getItemPrice() + "/-");
    }
}
