package com.android.kavi.erestaurant.activities;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.android.kavi.erestaurant.R;
import com.android.kavi.erestaurant.adapters.SelectedItemAdapter;
import com.android.kavi.erestaurant.dataObjs.SelectedItem;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kavi707 on 7/27/15.
 * @author Kavimal Wijewardana <kavi707@gmail.com>
 */
public class SelectedItemsActivity extends Activity {

    private ListView selectedItemListView;
    private ImageButton navBackImageButton;
    private LinearLayout currentOrderNavLinearLayout;

    private SelectedItemAdapter selectedItemAdapter;
    private List<SelectedItem> selectedItemList = new ArrayList<>();

    private Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selected_items);

        setUpViews();
    }

    private void setUpViews() {

        selectedItemListView = (ListView) findViewById(R.id.selectedItemsListView);
        navBackImageButton = (ImageButton) findViewById(R.id.navSelectedCategoryImageButton);
        currentOrderNavLinearLayout = (LinearLayout) findViewById(R.id.currentOrderNavLinearLayout);

        selectedItemList.add(new SelectedItem(null, "#1252", "Fried Rice with Vegetable & Egg", "Sample descroption text here ...", 400));
        selectedItemList.add(new SelectedItem(null, "#1253", "Basmati Steamed Rice", "Sample descroption text here ...", 450));
        selectedItemList.add(new SelectedItem(null, "#1254", "Mixed Fried Rice", "Sample descroption text here ...", 250));
        selectedItemList.add(new SelectedItem(null, "#1255", "Fried Rice with Shrimp & C.", "Sample description text here ...", 550));
        selectedItemList.add(new SelectedItem(null, "#1255", "Fried Rice with Shrimp & C.", "Sample description text here ...", 550));
        selectedItemList.add(new SelectedItem(null, "#1255", "Fried Rice with Shrimp & C.", "Sample description text here ...", 550));
        selectedItemList.add(new SelectedItem(null, "#1255", "Fried Rice with Shrimp & C.", "Sample description text here ...", 550));
        selectedItemList.add(new SelectedItem(null, "#1255", "Fried Rice with Shrimp & C.", "Sample description text here ...", 550));
        selectedItemList.add(new SelectedItem(null, "#1255", "Fried Rice with Shrimp & C.", "Sample description text here ...", 550));
        selectedItemList.add(new SelectedItem(null, "#1255", "Fried Rice with Shrimp & C.", "Sample description text here ...", 550));
        selectedItemList.add(new SelectedItem(null, "#1255", "Fried Rice with Shrimp & C.", "Sample description text here ...", 550));

        selectedItemAdapter = new SelectedItemAdapter(selectedItemList, context);
        selectedItemListView.setAdapter(selectedItemAdapter);

        navBackImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tabsIntent = new Intent(SelectedItemsActivity.this, MainTabHostActivity.class);
                tabsIntent.putExtra("TAB_ITEM", 0);
                startActivity(tabsIntent);
                finish();
            }
        });

        currentOrderNavLinearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tabsIntent = new Intent(SelectedItemsActivity.this, MainTabHostActivity.class);
                tabsIntent.putExtra("TAB_ITEM", 1);
                startActivity(tabsIntent);
                finish();
            }
        });

        selectedItemListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Log.d("TAG", "Coming here: Clicked : " + position );

                SelectedItem selectedItem = (SelectedItem) selectedItemListView.getItemAtPosition(position);

                Intent singleItemIntent = new Intent(SelectedItemsActivity.this, SingleItemActivity.class);
                startActivity(singleItemIntent);
            }
        });
    }
}
