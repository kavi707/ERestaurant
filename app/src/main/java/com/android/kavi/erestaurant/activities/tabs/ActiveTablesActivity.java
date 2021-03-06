package com.android.kavi.erestaurant.activities.tabs;

import android.app.TabActivity;
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
import android.widget.TabHost;

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

        activeTablesListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.d("TAG", "Active Tables clicked");
            }
        });
    }
}
