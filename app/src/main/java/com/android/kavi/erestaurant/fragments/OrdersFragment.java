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
 * @author Kavimal Wijewardana <kavi707@gmail.com>
 */
public class OrdersFragment extends Fragment {

    private View ordersFragmentView;

    private Button newOrdersBtn;
    private Button inProgressOdersBtn;
    private Button completedOrderBtn;
    private Button canceledOrdersBtn;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ordersFragmentView = inflater.inflate(R.layout.fragment_orders, container, false);
        setUpViews();

        return ordersFragmentView;
    }

    private void setUpViews() {
        newOrdersBtn = (Button) ordersFragmentView.findViewById(R.id.newOrdersBtn);
        inProgressOdersBtn = (Button) ordersFragmentView.findViewById(R.id.workInProgressBtn);
        completedOrderBtn = (Button) ordersFragmentView.findViewById(R.id.completedOrdersBtn);
        canceledOrdersBtn = (Button) ordersFragmentView.findViewById(R.id.cancelOrdersBtn);

        LinearLayout.LayoutParams btnLayoutParams = (LinearLayout.LayoutParams) newOrdersBtn.getLayoutParams();
        btnLayoutParams.width = CommonUtils.DEVICE_DIMENSIONS.get("width")/4;

        newOrdersBtn.setLayoutParams(btnLayoutParams);
        inProgressOdersBtn.setLayoutParams(btnLayoutParams);
        completedOrderBtn.setLayoutParams(btnLayoutParams);
        canceledOrdersBtn.setLayoutParams(btnLayoutParams);

        // Initial selection indicator
        newOrdersBtn.setBackgroundColor(getResources().getColor(R.color.tabsScrollColor));

        newOrdersBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Selector indication
                newOrdersBtn.setBackgroundColor(getResources().getColor(R.color.tabsScrollColor));
                inProgressOdersBtn.setBackgroundColor(getResources().getColor(R.color.red400));
                completedOrderBtn.setBackgroundColor(getResources().getColor(R.color.red400));
                canceledOrdersBtn.setBackgroundColor(getResources().getColor(R.color.red400));
            }
        });

        inProgressOdersBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Selector indication
                newOrdersBtn.setBackgroundColor(getResources().getColor(R.color.red400));
                inProgressOdersBtn.setBackgroundColor(getResources().getColor(R.color.tabsScrollColor));
                completedOrderBtn.setBackgroundColor(getResources().getColor(R.color.red400));
                canceledOrdersBtn.setBackgroundColor(getResources().getColor(R.color.red400));
            }
        });

        completedOrderBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Selector indication
                newOrdersBtn.setBackgroundColor(getResources().getColor(R.color.red400));
                inProgressOdersBtn.setBackgroundColor(getResources().getColor(R.color.red400));
                completedOrderBtn.setBackgroundColor(getResources().getColor(R.color.tabsScrollColor));
                canceledOrdersBtn.setBackgroundColor(getResources().getColor(R.color.red400));
            }
        });

        canceledOrdersBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Selector indication
                newOrdersBtn.setBackgroundColor(getResources().getColor(R.color.red400));
                inProgressOdersBtn.setBackgroundColor(getResources().getColor(R.color.red400));
                completedOrderBtn.setBackgroundColor(getResources().getColor(R.color.red400));
                canceledOrdersBtn.setBackgroundColor(getResources().getColor(R.color.tabsScrollColor));
            }
        });
    }
}
