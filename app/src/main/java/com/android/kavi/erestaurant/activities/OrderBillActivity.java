package com.android.kavi.erestaurant.activities;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;

import com.android.kavi.erestaurant.R;
import com.android.kavi.erestaurant.adapters.OrderBillItemAdapter;
import com.android.kavi.erestaurant.dataObjs.OrderBillItem;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kavi707 on 8/23/15.
 *
 * @author Kavimal Wijewardana <kavi707@gmail.com>
 */
public class OrderBillActivity extends Activity {

    private ImageButton navOrderBillBackImageBtn;
    private ListView orderBillItemListView;

    private OrderBillItemAdapter orderBillItemAdapter;
    private List<OrderBillItem> orderBillItemList = new ArrayList<>();

    private Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_bill);

        setUpViews();
    }

    private void setUpViews() {

        navOrderBillBackImageBtn = (ImageButton) findViewById(R.id.navOrderBillBackImageButton);
        orderBillItemListView = (ListView) findViewById(R.id.orderBillItemListView);

        orderBillItemList.add(new OrderBillItem("#01253", "Chips", 200, 4, 800));
        orderBillItemList.add(new OrderBillItem("#01254", "Fried Rice", 400, 1, 400));
        orderBillItemList.add(new OrderBillItem("#01255", "Orage Juice", 150, 3, 450));

        orderBillItemAdapter = new OrderBillItemAdapter(orderBillItemList, context);
        orderBillItemListView.setAdapter(orderBillItemAdapter);

        navOrderBillBackImageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
