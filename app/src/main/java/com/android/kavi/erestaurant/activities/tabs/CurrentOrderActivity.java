package com.android.kavi.erestaurant.activities.tabs;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import com.android.kavi.erestaurant.R;
import com.android.kavi.erestaurant.adapters.CurrentOrderItemAdapter;
import com.android.kavi.erestaurant.customDialogs.QtyDialog;
import com.android.kavi.erestaurant.dataObjs.CurrentOrderItem;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kavi707 on 7/12/15.
 * @author Kavimal Wijewardana <kavi707@gmail.com>
 */
public class CurrentOrderActivity extends ActionBarActivity {

    private ListView currentOrderListView;
    private Button confirmOrderBtn;
    private Button cancelOrderBtn;

    private CurrentOrderItemAdapter currentOrderItemAdapter;
    private List<CurrentOrderItem> currentOrderItemList = new ArrayList<>();

    private Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tab_activity_current_order);

        // Set App Icon on ActionBar
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayOptions(ActionBar.DISPLAY_SHOW_HOME | ActionBar.DISPLAY_SHOW_TITLE);
        actionBar.setIcon(R.drawable.logo);

        setUpViews();
    }

    private void setUpViews() {

        currentOrderListView = (ListView) findViewById(R.id.currentOrderItemListView);
        confirmOrderBtn = (Button) findViewById(R.id.confirmOrderButton);
        cancelOrderBtn = (Button) findViewById(R.id.cancelOrderButton);

        currentOrderItemList.add(new CurrentOrderItem(null, "#01252", "Fried Rice With Vegetable & Egg", 400, 2, 800));
        currentOrderItemList.add(new CurrentOrderItem(null, "#01253", "Fried Rice With Vegetable & Egg", 400, 2, 800));

        currentOrderItemAdapter = new CurrentOrderItemAdapter(currentOrderItemList, context);
        currentOrderListView.setAdapter(currentOrderItemAdapter);

        currentOrderListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.d("TAG", "current order item list view selected");
            }
        });

        confirmOrderBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final QtyDialog qtyDialog = new QtyDialog(context);

                qtyDialog.show();
            }
        });
    }

    public void removeItemFromCurrentOrderListView() {

    }
}
