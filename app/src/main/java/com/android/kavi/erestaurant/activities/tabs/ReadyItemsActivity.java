package com.android.kavi.erestaurant.activities.tabs;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.android.kavi.erestaurant.R;
import com.android.kavi.erestaurant.adapters.ActiveTableItemAdapter;
import com.android.kavi.erestaurant.adapters.ReadyItemAdapter;
import com.android.kavi.erestaurant.dataObjs.ActiveTableItem;
import com.android.kavi.erestaurant.dataObjs.ReadyItem;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kavi707 on 7/12/15.
 * @author Kavimal Wijewardana <kavi707@gmail.com>
 */
public class ReadyItemsActivity extends ActionBarActivity {

    private ListView readyItemsListView;
    private ReadyItemAdapter readyItemAdapter;
    private List<ReadyItem> readyItemList = new ArrayList<>();

    private Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tab_activity_ready_items);

        // Set App Icon on ActionBar
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayOptions(ActionBar.DISPLAY_SHOW_HOME | ActionBar.DISPLAY_SHOW_TITLE);
        actionBar.setIcon(R.drawable.logo);

        setUpViews();
    }

    private void setUpViews() {

        readyItemsListView = (ListView) findViewById(R.id.readyItemsListView);

        readyItemList.add(new ReadyItem("Table 04", "Vegetable fried rice", 5));
        readyItemList.add(new ReadyItem("Table 09", "Mix fried rice", 1));
        readyItemList.add(new ReadyItem("Table 02", "Chicken fried rice", 3));

        readyItemAdapter = new ReadyItemAdapter(readyItemList, context);
        readyItemsListView.setAdapter(readyItemAdapter);

        readyItemsListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.d("TAG", "Ready Item list view item selected");
            }
        });
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
