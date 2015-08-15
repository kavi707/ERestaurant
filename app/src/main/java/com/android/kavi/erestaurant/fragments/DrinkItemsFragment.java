package com.android.kavi.erestaurant.fragments;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import com.android.kavi.erestaurant.R;
import com.android.kavi.erestaurant.activities.SelectedItemsActivity;
import com.android.kavi.erestaurant.adapters.CustomGridViewAdapter;
import com.android.kavi.erestaurant.dataObjs.GridItem;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kavi707 on 5/27/15.
 * @author Kavimal Wijewardana <kavi707@gmail.com>
 */
public class DrinkItemsFragment extends Fragment {

    private View drinkItemFragmentView;

    private GridView drinkItemGridView;
    private CustomGridViewAdapter customGridViewAdapter;
    private List<GridItem> gridViewItems = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        drinkItemFragmentView = inflater.inflate(R.layout.fragment_drink_items, container, false);
        setUpViews();

        return drinkItemFragmentView;
    }

    private void setUpViews() {

        gridViewItems.add(new GridItem("Soft Drinks"));
        gridViewItems.add(new GridItem("Bear"));

        drinkItemGridView = (GridView) drinkItemFragmentView.findViewById(R.id.drinksItemGridView);
        customGridViewAdapter = new CustomGridViewAdapter(gridViewItems, getActivity());
        drinkItemGridView.setAdapter(customGridViewAdapter);

        drinkItemGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.d("Grid Item pos: ", ">>>>>>>>>>>>>>>>>>>>>> " + position);
                Intent selectedItemIntent = new Intent(getActivity(), SelectedItemsActivity.class);
                startActivity(selectedItemIntent);
            }
        });
        // End with List View
    }
}
