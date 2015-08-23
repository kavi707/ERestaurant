package com.android.kavi.erestaurant.views;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.android.kavi.erestaurant.R;
import com.android.kavi.erestaurant.activities.OrderBillActivity;
import com.android.kavi.erestaurant.activities.tabs.ActiveTablesActivity;
import com.android.kavi.erestaurant.dataObjs.ActiveTableItem;

/**
 * Created by kavi707 on 6/2/15.
 * @author Kavimal Wijewardana <kavi707@gmail.com>
 */
public class ActiveTableListItemView extends RelativeLayout {

    private TextView tableNameTextView;
    private LinearLayout tableNameLinearLayout;
    private LinearLayout billLinearLayout;
    private LinearLayout addItemLinearLayout;

    private ActiveTableItem activeTableItem;
    private Context context;

    public ActiveTableListItemView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();

        tableNameTextView = (TextView) findViewById(R.id.activeTableNameTextView);
        tableNameLinearLayout = (LinearLayout) findViewById(R.id.activeTableNameLinearLayout);
        billLinearLayout = (LinearLayout) findViewById(R.id.activeTableBillLinearLayout);
        addItemLinearLayout = (LinearLayout) findViewById(R.id.activeTableAddItemLinearLayout);
    }

    public ActiveTableItem getActiveTableItem() {
        return activeTableItem;
    }

    public void setActiveTableItem(ActiveTableItem activeTableItem) {
        this.activeTableItem = activeTableItem;

        tableNameTextView.setText(activeTableItem.getActiveTableName());

        billLinearLayout.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent billIntent = new Intent(context, OrderBillActivity.class);
                context.startActivity(billIntent);
            }
        });
    }
}
