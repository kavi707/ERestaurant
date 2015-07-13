package com.android.kavi.erestaurant.activities;

import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TabHost;

import com.android.kavi.erestaurant.R;
import com.android.kavi.erestaurant.activities.tabs.ActiveTablesActivity;
import com.android.kavi.erestaurant.activities.tabs.HomeActivity;
import com.android.kavi.erestaurant.activities.tabs.ReadyItemsActivity;
import com.android.kavi.erestaurant.activities.tabs.SearchActivity;

/**
 * Created by kavi707 on 7/12/15.
 */
public class MainTabHostActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main_tab_host);

        Resources ressources = getResources();
        TabHost tabHost = getTabHost();

        // Active Tables tab
        Intent intentActiveTabs = new Intent().setClass(this, ActiveTablesActivity.class);
        TabHost.TabSpec tabSpecActiveTables = tabHost
                .newTabSpec("Active Tables")
                .setIndicator("", ressources.getDrawable(R.drawable.default_meal_image))
                .setContent(intentActiveTabs);

        // Search tab
        Intent intentSearch = new Intent().setClass(this, SearchActivity.class);
        TabHost.TabSpec tabSpecSearch = tabHost
                .newTabSpec("Search")
                .setIndicator("", ressources.getDrawable(R.drawable.default_meal_image))
                .setContent(intentSearch);

        // Home tab
        Intent intentHome = new Intent().setClass(this, HomeActivity.class);
        TabHost.TabSpec tabSpecHome = tabHost
                .newTabSpec("Home")
                .setIndicator("", ressources.getDrawable(R.drawable.default_meal_image))
                .setContent(intentHome);

        // Ready Items tab
        Intent intentReadyItems = new Intent().setClass(this, ReadyItemsActivity.class);
        TabHost.TabSpec tabSpecReadyItems = tabHost
                .newTabSpec("Ready Items")
                .setIndicator("", ressources.getDrawable(R.drawable.default_meal_image))
                .setContent(intentReadyItems);

        // Old tab
        Intent oldTabIntent = new Intent().setClass(this, TabsActivity.class);
        TabHost.TabSpec tabSpecOldTab = tabHost
                .newTabSpec("Ready Items")
                .setIndicator("", ressources.getDrawable(R.drawable.default_meal_image))
                .setContent(oldTabIntent);

        // add all tabs
        tabHost.addTab(tabSpecActiveTables);
        tabHost.addTab(tabSpecSearch);
        tabHost.addTab(tabSpecHome);
        tabHost.addTab(tabSpecReadyItems);
        tabHost.addTab(tabSpecOldTab);

        //set Windows tab as default (zero based)
        tabHost.setCurrentTab(0);
    }
}
