package com.android.kavi.erestaurant.views;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.android.kavi.erestaurant.R;
import com.android.kavi.erestaurant.activities.tabs.CurrentOrderActivity;
import com.android.kavi.erestaurant.dataObjs.CurrentOrderItem;

import java.util.List;

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
    private ImageView currentOrderItemRemoveImageView;

    private CurrentOrderItem currentOrderItem;
    private CurrentOrderActivity currentOrderActivity = new CurrentOrderActivity();

    public CurrentOrderItemView(Context context, AttributeSet attrs)  {
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
        currentOrderItemRemoveImageView = (ImageView) findViewById(R.id.removeFromCurrentOrderImageView);
    }

    public CurrentOrderItem getCurrentOrderItem() {
        return currentOrderItem;
    }

    public void setCurrentOrderItem(final CurrentOrderItem currentOrderItem) {
        this.currentOrderItem = currentOrderItem;

        currentOrderItemImageView.setImageBitmap(currentOrderItem.getImage());
        currentOrderItemCodeTextView.setText(currentOrderItem.getCode());
        currentOrderItemNameTextView.setText(currentOrderItem.getName());
        currentOrderItemPriceTextView.setText("Rs." + currentOrderItem.getPrice() + "/-");
        currentOrderItemQtyTextView.setText("QTY - " + currentOrderItem.getQty());
        currentOrderItemTotalTextView.setText("Rs." + currentOrderItem.getTotal() + "/-");

        currentOrderItemRemoveImageView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(">>>>>>>>>>>", "Btn clicked");
            }
        });
    }
}
