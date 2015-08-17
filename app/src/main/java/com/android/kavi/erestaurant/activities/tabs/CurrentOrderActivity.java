package com.android.kavi.erestaurant.activities.tabs;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import com.android.kavi.erestaurant.R;
import com.android.kavi.erestaurant.adapters.CurrentOrderItemAdapter;
import com.android.kavi.erestaurant.dataObjs.CurrentOrderItem;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kavi707 on 7/12/15.
 * @author Kavimal Wijewardana <kavi707@gmail.com>
 */
public class CurrentOrderActivity extends ActionBarActivity {

    private ListView currentOrderListView;

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

        currentOrderItemList.add(new CurrentOrderItem(null, "#01252", "Fried Rice With Vegetable & Egg", 400, 2, 800));
        currentOrderItemList.add(new CurrentOrderItem(null, "#01253", "Fried Rice With Vegetable & Egg", 400, 2, 800));

        currentOrderItemAdapter = new CurrentOrderItemAdapter(currentOrderItemList, context);
        currentOrderListView.setAdapter(currentOrderItemAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
