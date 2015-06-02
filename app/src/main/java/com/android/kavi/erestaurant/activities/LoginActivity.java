package com.android.kavi.erestaurant.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.android.kavi.erestaurant.R;

/**
 * Created by kavi707 on 6/2/15.
 */
public class LoginActivity extends Activity {

    private Button loginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        setUpViews();
    }

    private void setUpViews() {
        loginBtn = (Button) findViewById(R.id.loginButton);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tabsIntent = new Intent(LoginActivity.this, TabsActivity.class);
                startActivity(tabsIntent);
                finish();
            }
        });
    }
}