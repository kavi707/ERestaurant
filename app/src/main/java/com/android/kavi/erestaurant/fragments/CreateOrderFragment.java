package com.android.kavi.erestaurant.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import com.android.kavi.erestaurant.CommonUtils;
import com.android.kavi.erestaurant.R;
import com.android.kavi.erestaurant.services.CommonServices;

import java.util.Map;

/**
 * Created by kavi707 on 5/27/15.
 */
public class CreateOrderFragment extends Fragment {

    private View createOrderFragmentView;

    private Button menuItemsBtn;
    private Button mealsBtn;
    private Button addOnsBtn;

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

        LinearLayout.LayoutParams btnLayoutParams = (LinearLayout.LayoutParams) menuItemsBtn.getLayoutParams();
        btnLayoutParams.width = CommonUtils.DEVICE_DIMENSIONS.get("width")/3;

        menuItemsBtn.setLayoutParams(btnLayoutParams);
        mealsBtn.setLayoutParams(btnLayoutParams);
        addOnsBtn.setLayoutParams(btnLayoutParams);

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
