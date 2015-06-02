package com.android.kavi.erestaurant.activities;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.android.kavi.erestaurant.R;


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
