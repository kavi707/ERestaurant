package com.android.kavi.erestaurant.activities.tabs;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import com.android.kavi.erestaurant.R;
import com.android.kavi.erestaurant.adapters.ActiveTableItemAdapter;
import com.android.kavi.erestaurant.dataObjs.ActiveTableItem;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kavi707 on 7/12/15.
 * @author Kavimal Wijewardana <kavi707@gmail.com>
 */
public class ActiveTablesActivity extends ActionBarActivity {

    private ListView activeTablesListView;
    private ActiveTableItemAdapter activeTableAdapter;
    private List<ActiveTableItem> activeTableList = new ArrayList<>();

    private Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tab_activity_active_tables);

        // Set App Icon on ActionBar
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayOptions(ActionBar.DISPLAY_SHOW_HOME | ActionBar.DISPLAY_SHOW_TITLE);
        actionBar.setIcon(R.drawable.logo);

        setUpViews();
    }

    private void setUpViews() {

        activeTablesListView = (ListView) findViewById(R.id.activeTablesListView);

        activeTableList.add(new ActiveTableItem("4", "TABLE 04"));
        activeTableList.add(new ActiveTableItem("9", "TABLE 09"));
        activeTableList.add(new ActiveTableItem("2", "TABLE 02"));

        activeTableAdapter = new ActiveTableItemAdapter(activeTableList, context);
        activeTablesListView.setAdapter(activeTableAdapter);
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
