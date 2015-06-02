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
 */
public class CreateOrderFragment extends Fragment {

    private View createOrderFragmentView;

    private Button menuItemsBtn;
    private Button mealsBtn;
    private Button addOnsBtn;

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

        menuItemsBtn = (Button) createOrderFragmentView.findViewById(R.id.menuItemsBtn);
        mealsBtn = (Button) createOrderFragmentView.findViewById(R.id.mealsBtn);
        addOnsBtn = (Button) createOrderFragmentView.findViewById(R.id.addOnsBtn);

        //TODO - Start on Grid View
        Bitmap appIcon = BitmapFactory.decodeResource(this.getResources(), R.mipmap.ic_launcher);

        gridViewItems.add(new GridItem(appIcon, "Rice"));
        gridViewItems.add(new GridItem(appIcon, "Noodles"));
        gridViewItems.add(new GridItem(appIcon, "Soups"));
        gridViewItems.add(new GridItem(appIcon, "Salads"));

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

        LinearLayout.LayoutParams btnLayoutParams = (LinearLayout.LayoutParams) menuItemsBtn.getLayoutParams();
        btnLayoutParams.width = CommonUtils.DEVICE_DIMENSIONS.get("width")/3;

        menuItemsBtn.setLayoutParams(btnLayoutParams);
        mealsBtn.setLayoutParams(btnLayoutParams);
        addOnsBtn.setLayoutParams(btnLayoutParams);

        // Initial selection indicator
        menuItemsBtn.setBackgroundColor(getResources().getColor(R.color.tabsScrollColor));

        menuItemsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Selector indication
                menuItemsBtn.setBackgroundColor(getResources().getColor(R.color.tabsScrollColor));
                mealsBtn.setBackgroundColor(getResources().getColor(R.color.red400));
                addOnsBtn.setBackgroundColor(getResources().getColor(R.color.red400));
            }
        });

        mealsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Selector indication
                menuItemsBtn.setBackgroundColor(getResources().getColor(R.color.red400));
                mealsBtn.setBackgroundColor(getResources().getColor(R.color.tabsScrollColor));
                addOnsBtn.setBackgroundColor(getResources().getColor(R.color.red400));
            }
        });

        addOnsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Selector indication
                menuItemsBtn.setBackgroundColor(getResources().getColor(R.color.red400));
                mealsBtn.setBackgroundColor(getResources().getColor(R.color.red400));
                addOnsBtn.setBackgroundColor(getResources().getColor(R.color.tabsScrollColor));
            }
        });
    }
}
