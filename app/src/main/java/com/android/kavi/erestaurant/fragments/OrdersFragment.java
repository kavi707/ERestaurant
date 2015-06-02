package com.android.kavi.erestaurant.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.android.kavi.erestaurant.CommonUtils;
import com.android.kavi.erestaurant.R;
import com.android.kavi.erestaurant.adapters.OrderItemAdapter;
import com.android.kavi.erestaurant.dataObjs.OrderItem;
import com.android.kavi.erestaurant.services.CommonServices;

import java.util.ArrayList;
import java.util.List;
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

    private ListView ordersListView;
    private OrderItemAdapter orderItemAdapter;
    private List<OrderItem> orderItemList = new ArrayList<>();

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

        //TODO - Start on List View
        ordersListView = (ListView) ordersFragmentView.findViewById(R.id.ordersListView);

        orderItemList.add(new OrderItem("Order One", "Dec One"));
        orderItemList.add(new OrderItem("Order Two", "Dec Two"));
        orderItemList.add(new OrderItem("Order Three", "Dec Three"));
        orderItemList.add(new OrderItem("Order Four", "Dec Four"));
        orderItemList.add(new OrderItem("Order Five", "Dec Five"));

        orderItemAdapter = new OrderItemAdapter(orderItemList, getActivity());
        ordersListView.setAdapter(orderItemAdapter);

        ordersListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.d("List Item pos: ", ">>>>>>>>>>>>>>>>>>>>>> " + position);
            }
        });
        // End with List View

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
