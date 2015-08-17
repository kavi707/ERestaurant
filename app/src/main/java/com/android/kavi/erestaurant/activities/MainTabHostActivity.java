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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main_tab_host);

        Resources ressources = getResources();
        TabHost tabHost = getTabHost();

        // Home tab
        Intent intentHome = new Intent().setClass(this, HomeActivity.class);
        TabHost.TabSpec tabSpecHome = tabHost
                .newTabSpec("Home")
                .setIndicator("", ressources.getDrawable(R.drawable.home_image))
                .setContent(intentHome);

        // Current Order tab
        Intent intentCurrentOrder = new Intent().setClass(this, CurrentOrderActivity.class);
        TabHost.TabSpec tabSpecCurrentOrder = tabHost
                .newTabSpec("Current Order")
                .setIndicator("", ressources.getDrawable(R.drawable.search_image))
                .setContent(intentCurrentOrder);

        // Active Tables tab
        Intent intentActiveTabs = new Intent().setClass(this, ActiveTablesActivity.class);
        TabHost.TabSpec tabSpecActiveTables = tabHost
                .newTabSpec("Active Tables")
                .setIndicator("", ressources.getDrawable(R.drawable.table_image))
                .setContent(intentActiveTabs);

        // Ready Items tab
        Intent intentReadyItems = new Intent().setClass(this, ReadyItemsActivity.class);
        TabHost.TabSpec tabSpecReadyItems = tabHost
                .newTabSpec("Ready Items")
                .setIndicator("", ressources.getDrawable(R.drawable.thubms_image))
                .setContent(intentReadyItems);


        // add all tabs
        tabHost.addTab(tabSpecHome);
        tabHost.addTab(tabSpecCurrentOrder);
        tabHost.addTab(tabSpecActiveTables);
        tabHost.addTab(tabSpecReadyItems);

        //set Windows tab as default (zero based)
        tabHost.setCurrentTab(0);
    }
}
