package com.android.kavi.erestaurant.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.android.kavi.erestaurant.R;
import com.android.kavi.erestaurant.dataObjs.CurrentOrderItem;

/**
 * Created by kavi707 on 8/17/15.
 *
 * @author Kavimal Wijewardana <kavi707@gmail.com>
 */
public class CurrentOrderItemView extends RelativeLayout {

    private ImageView currentOrderItemImageView;
    private TextView currentOrderItemCodeTextView;
    private TextView currentOrderItemNameTextView;
    private TextView currentOrderItemPriceTextView;
    private TextView currentOrderItemQtyTextView;
    private TextView currentOrderItemTotalTextView;
    private ImageButton currentOrderItemRemoveButton;

    private CurrentOrderItem currentOrderItem;

    public CurrentOrderItemView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();

        currentOrderItemImageView = (ImageView) findViewById(R.id.currentOrderItemImageView);
        currentOrderItemCodeTextView = (TextView) findViewById(R.id.currentOrderItemCodeTextView);
        currentOrderItemNameTextView = (TextView) findViewById(R.id.currentOrderItemNameTextView);
        currentOrderItemPriceTextView = (TextView) findViewById(R.id.currentOrderItemPriceTextView);
        currentOrderItemQtyTextView = (TextView) findViewById(R.id.currentOrderItemQtyTextView);
        currentOrderItemTotalTextView = (TextView) findViewById(R.id.currentOrderItemTotalTextView);
        currentOrderItemRemoveButton = (ImageButton) findViewById(R.id.removeFromCurrentOrderButton);
    }

    public CurrentOrderItem getCurrentOrderItem() {
        return currentOrderItem;
    }

    public void setCurrentOrderItem(CurrentOrderItem currentOrderItem) {
        this.currentOrderItem = currentOrderItem;

        currentOrderItemImageView.setImageBitmap(currentOrderItem.getImage());
        currentOrderItemCodeTextView.setText(currentOrderItem.getCode());
        currentOrderItemNameTextView.setText(currentOrderItem.getName());
        currentOrderItemPriceTextView.setText("Rs." + currentOrderItem.getPrice() + "/-");
        currentOrderItemQtyTextView.setText("QTY - " + currentOrderItem.getQty());
        currentOrderItemTotalTextView.setText("Rs." + currentOrderItem.getTotal() + "/-");
    }
}
