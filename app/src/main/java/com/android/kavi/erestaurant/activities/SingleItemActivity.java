package com.android.kavi.erestaurant.activities;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.kavi.erestaurant.R;

/**
 * Created by kavi707 on 8/21/15.
 *
 * @author Kavimal Wijewardana <kavi707@gmail.com>
 */
public class SingleItemActivity extends Activity {

    private ImageButton navSingleItemBackImageButton;
    private ImageView singleItemImageView;
    private TextView singleItemCodeTextView;
    private TextView singleItemNameTextView;
    private TextView singleItemDescTextView;
    private TextView singleItemPriceTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_item);

        setUpViews();
    }

    private void setUpViews() {

        navSingleItemBackImageButton = (ImageButton) findViewById(R.id.navSingleItemBackImageButton);
        singleItemImageView = (ImageView) findViewById(R.id.singleItemImageView);
        singleItemCodeTextView = (TextView) findViewById(R.id.singleItemCodeTextView);
        singleItemNameTextView = (TextView) findViewById(R.id.singleItemNameTextView);
        singleItemDescTextView = (TextView) findViewById(R.id.singleItemDescTextView);
        singleItemPriceTextView = (TextView) findViewById(R.id.singleItemPriceTextView);

        navSingleItemBackImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
