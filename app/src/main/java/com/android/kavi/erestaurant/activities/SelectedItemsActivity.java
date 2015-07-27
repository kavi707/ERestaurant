package com.android.kavi.erestaurant.activities;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
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

        selectedItemList.add(new SelectedItem("Chicken Fried Rice", 100));
        selectedItemList.add(new SelectedItem("Fish Fried Rice", 80));
        selectedItemList.add(new SelectedItem("Vegetable Fried Rice", 60));

        selectedItemAdapter = new SelectedItemAdapter(selectedItemList, context);
        selectedItemListView.setAdapter(selectedItemAdapter);
    }
}
