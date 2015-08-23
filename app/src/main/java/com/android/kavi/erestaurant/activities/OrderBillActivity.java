package com.android.kavi.erestaurant.activities;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.android.kavi.erestaurant.R;

/**
 * Created by kavi707 on 8/23/15.
 *
 * @author Kavimal Wijewardana <kavi707@gmail.com>
 */
public class OrderBillActivity extends Activity {

    private ImageButton navOrderBillBackImageBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_bill);

        setUpViews();
    }

    private void setUpViews() {

        navOrderBillBackImageBtn = (ImageButton) findViewById(R.id.navOrderBillBackImageButton);

        navOrderBillBackImageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
