package com.android.kavi.erestaurant.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.android.kavi.erestaurant.R;

/**
 * Created by kavi707 on 6/2/15.
 * @author Kavimal Wijewardana <kavi707@gmail.com>
 */
public class LoadingActivity extends Activity {

    private TextView loadingTitleTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading);

        setUpView();
    }

    private void setUpView() {
        loadingTitleTextView = (TextView) findViewById(R.id.loadingTitleTextView);

        loadingTitleTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginIntent = new Intent(LoadingActivity.this, LoginActivity.class);
                startActivity(loginIntent);
                finish();
            }
        });
    }
}
