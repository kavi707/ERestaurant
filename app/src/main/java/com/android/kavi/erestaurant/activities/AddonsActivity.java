package com.android.kavi.erestaurant.activities;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.android.kavi.erestaurant.R;

/**
 * Created by kavi707 on 9/14/15.
 *
 * @author Kavimal Wijewardana <kavi707@gmail.com>
 */
public class AddonsActivity extends Activity {

    private Button ingredientNoBtn, ingredientLowBtn, ingredientNormalBtn, ingredientHighBtn, ingredientExtraBtn;
    private Button addonNoBtn, addonLowBtn, addonNormalBtn, addonHighBtn, addonExtraBtn;
    private Button cookingNoBtn, cookingLowBtn, cookingNormalBtn, cookingHighBtn, cookingExtraBtn;

    private ImageButton navAddonsImageButton;

    private ImageButton addIngredientImgBtn;
    private ImageButton addAddonImgBtn;
    private ImageButton addCookingImgBtn;

    private EditText ingredientEditText;
    private EditText addonEditText;
    private EditText cookingEditText;

    private Button addonsCancelBtn;
    private Button addonsOkBtn;

    private LinearLayout ingredientListLinearLayout;
    private LinearLayout addonsListLinearLayout;
    private LinearLayout cookingListLinearLayout;

    private Context context  = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addons);

        setUpViews();
    }

    private void setUpViews() {

        navAddonsImageButton = (ImageButton) findViewById(R.id.navAddonsImageButton);

        addIngredientImgBtn = (ImageButton) findViewById(R.id.ingredientAddImageBtn);
        addAddonImgBtn = (ImageButton) findViewById(R.id.addonAddImageBtn);
        addCookingImgBtn = (ImageButton) findViewById(R.id.cookingAddImageBtn);

        ingredientEditText = (EditText) findViewById(R.id.ingredientNameEditText);
        addonEditText = (EditText) findViewById(R.id.addonNameEditText);
        cookingEditText = (EditText) findViewById(R.id.cookingNameEditText);

        ingredientListLinearLayout = (LinearLayout) findViewById(R.id.ingredientListLinearLayout);
        addonsListLinearLayout = (LinearLayout) findViewById(R.id.addonsListLinearLayout);
        cookingListLinearLayout = (LinearLayout) findViewById(R.id.cookingListLinearLayout);

        addonsCancelBtn = (Button) findViewById(R.id.addonCancelBtn);
        addonsOkBtn = (Button) findViewById(R.id.addonOkBtn);

        navAddonsImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        addIngredientImgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userChoice = ingredientEditText.getText().toString();
                if (!userChoice.equals(null) && !userChoice.equals("")) {
                    LayoutInflater view = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

                    final View customIngredient = view.inflate(R.layout.list_item_addon, null);
                    TextView textView = (TextView) customIngredient.findViewById(R.id.addonItemNameTextView);
                    textView.setText(userChoice);
                    ImageButton imgBtn = (ImageButton) customIngredient.findViewById(R.id.addonItemRemoveImgBtn);
                    imgBtn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            ingredientListLinearLayout.removeView(customIngredient);
                        }
                    });

                    ingredientListLinearLayout.addView(customIngredient);
                }
            }
        });

        addAddonImgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userChoice = addonEditText.getText().toString();
                if (!userChoice.equals(null) && !userChoice.equals("")) {
                    LayoutInflater view = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

                    final View customAddon = view.inflate(R.layout.list_item_addon, null);
                    TextView textView = (TextView) customAddon.findViewById(R.id.addonItemNameTextView);
                    textView.setText(userChoice);
                    ImageButton imgBtn = (ImageButton) customAddon.findViewById(R.id.addonItemRemoveImgBtn);
                    imgBtn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            addonsListLinearLayout.removeView(customAddon);
                        }
                    });

                    addonsListLinearLayout.addView(customAddon);
                }
            }
        });

        addCookingImgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userChoice = cookingEditText.getText().toString();
                if (!userChoice.equals(null) && !userChoice.equals("")) {
                    LayoutInflater view = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

                    final View customCooking = view.inflate(R.layout.list_item_addon, null);
                    TextView textView = (TextView) customCooking.findViewById(R.id.addonItemNameTextView);
                    textView.setText(userChoice);
                    ImageButton imgBtn = (ImageButton) customCooking.findViewById(R.id.addonItemRemoveImgBtn);
                    imgBtn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            cookingListLinearLayout.removeView(customCooking);
                        }
                    });

                    cookingListLinearLayout.addView(customCooking);
                }
            }
        });
    }
}
