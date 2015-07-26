package com.android.kavi.erestaurant.fragments;

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
import android.widget.ListView;

import com.android.kavi.erestaurant.R;
import com.android.kavi.erestaurant.adapters.CustomGridViewAdapter;
import com.android.kavi.erestaurant.adapters.OrderItemAdapter;
import com.android.kavi.erestaurant.dataObjs.GridItem;
import com.android.kavi.erestaurant.dataObjs.OrderItem;

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

        Bitmap defaultMealIcon = BitmapFactory.decodeResource(this.getResources(), R.drawable.default_meal_image);

        gridViewItems.add(new GridItem(defaultMealIcon, "Rice"));
        gridViewItems.add(new GridItem(defaultMealIcon, "Noodles"));
        gridViewItems.add(new GridItem(defaultMealIcon, "Soups"));

        drinkItemGridView = (GridView) drinkItemFragmentView.findViewById(R.id.drinksItemGridView);
        customGridViewAdapter = new CustomGridViewAdapter(getActivity(), R.layout.grid_item, gridViewItems);
        drinkItemGridView.setAdapter(customGridViewAdapter);

        drinkItemGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.d("Grid Item pos: ", ">>>>>>>>>>>>>>>>>>>>>> " + position);
            }
        });
        // End with List View
    }
}
