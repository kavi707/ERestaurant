package com.android.kavi.erestaurant.activities;

import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TabHost;

import com.android.kavi.erestaurant.R;
import com.android.kavi.erestaurant.activities.tabs.ActiveTablesActivity;
import com.android.kavi.erestaurant.activities.tabs.ReadyItemsActivity;
import com.android.kavi.erestaurant.activities.tabs.CurrentOrderActivity;
import com.android.kavi.erestaurant.activities.tabs.HomeActivity;

/**
 * Created by kavi707 on 7/12/15.
 * @author Kavimal Wijewardana <kavi707@gmail.com>
 */
public class MainTabHostActivity extends TabActivity {

    private TabHost tabHost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Bundle bundle = getIntent().getExtras();
        int tab_item = bundle.getInt("TAB_ITEM");

        setContentView(R.layout.activity_main_tab_host);

        Resources ressources = getResources();
        tabHost = getTabHost();

        // Home tab
        Intent intentHome = new Intent().setClass(this, HomeActivity.class);
        TabHost.TabSpec tabSpecHome = tabHost
                .newTabSpec("Home")
                .setIndicator("", ressources.getDrawable(R.drawable.footer_home))
                .setContent(intentHome);

        // Current Order tab
        Intent intentCurrentOrder = new Intent().setClass(this, CurrentOrderActivity.class);
        TabHost.TabSpec tabSpecCurrentOrder = tabHost
                .newTabSpec("Current Order")
                .setIndicator("", ressources.getDrawable(R.drawable.footer_current_order))
                .setContent(intentCurrentOrder);

        // Active Tables tab
        Intent intentActiveTabs = new Intent().setClass(this, ActiveTablesActivity.class);
        TabHost.TabSpec tabSpecActiveTables = tabHost
                .newTabSpec("Active Tables")
                .setIndicator("", ressources.getDrawable(R.drawable.footer_active_tables))
                .setContent(intentActiveTabs);

        // Ready Items tab
        Intent intentReadyItems = new Intent().setClass(this, ReadyItemsActivity.class);
        TabHost.TabSpec tabSpecReadyItems = tabHost
                .newTabSpec("Ready Items")
                .setIndicator("", ressources.getDrawable(R.drawable.footer_ready_items))
                .setContent(intentReadyItems);


        // add all tabs
        tabHost.addTab(tabSpecHome);
        tabHost.addTab(tabSpecCurrentOrder);
        tabHost.addTab(tabSpecActiveTables);
        tabHost.addTab(tabSpecReadyItems);

        //set Windows tab as default (zero based)
        tabHost.setCurrentTab(tab_item);
    }
}
