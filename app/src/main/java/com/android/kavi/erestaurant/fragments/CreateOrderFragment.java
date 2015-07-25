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
import android.widget.Button;
import android.widget.GridView;
import android.widget.LinearLayout;

import com.android.kavi.erestaurant.CommonUtils;
import com.android.kavi.erestaurant.R;
import com.android.kavi.erestaurant.adapters.CustomGridViewAdapter;
import com.android.kavi.erestaurant.dataObjs.GridItem;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kavi707 on 5/27/15.
 * @author Kavimal Wijewardana <kavi707@gmail.com>
 */
public class CreateOrderFragment extends Fragment {

    private View createOrderFragmentView;

    private GridView menuItemGridView;
    private CustomGridViewAdapter customGridViewAdapter;
    private List<GridItem> gridViewItems = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        createOrderFragmentView = inflater.inflate(R.layout.fragment_create_order, container, false);
        setUpViews();

        return createOrderFragmentView;
    }

    private void setUpViews() {

        Bitmap defaultMealIcon = BitmapFactory.decodeResource(this.getResources(), R.drawable.default_meal_image);

        gridViewItems.add(new GridItem(defaultMealIcon, "Rice"));
        gridViewItems.add(new GridItem(defaultMealIcon, "Noodles"));
        gridViewItems.add(new GridItem(defaultMealIcon, "Soups"));

        menuItemGridView = (GridView) createOrderFragmentView.findViewById(R.id.menuItemGridView);
        customGridViewAdapter = new CustomGridViewAdapter(getActivity(), R.layout.grid_item, gridViewItems);
        menuItemGridView.setAdapter(customGridViewAdapter);

        menuItemGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.d("Grid Item pos: ", ">>>>>>>>>>>>>>>>>>>>>> " + position);
            }
        });
        // End of loading data to grid view
    }
}
