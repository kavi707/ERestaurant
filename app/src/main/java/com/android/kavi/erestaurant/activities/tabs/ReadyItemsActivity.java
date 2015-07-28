package com.android.kavi.erestaurant.activities.tabs;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
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

        readyItemList.add(new ReadyItem("Vegetable fried rice", "Table 04"));
        readyItemList.add(new ReadyItem("Mix fried rice", "Table 09"));
        readyItemList.add(new ReadyItem("Chicken fried rice", "Table 02"));

        readyItemAdapter = new ReadyItemAdapter(readyItemList, context);
        readyItemsListView.setAdapter(readyItemAdapter);
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
