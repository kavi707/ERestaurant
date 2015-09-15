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

    String ingredientOption = "";
    String addonsOption = "";
    String cookingOption = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addons);

        setUpViews();
    }

    private void setUpViews() {
        
        navAddonsImageButton = (ImageButton) findViewById(R.id.navAddonsImageButton);

        ingredientNoBtn = (Button) findViewById(R.id.ingredientNoBtn);
        ingredientLowBtn = (Button) findViewById(R.id.ingredientLowBtn);
        ingredientNormalBtn = (Button) findViewById(R.id.ingredientNormalBtn);
        ingredientHighBtn = (Button) findViewById(R.id.ingredientHighBtn);
        ingredientExtraBtn = (Button) findViewById(R.id.ingredientExtraBtn);

        addonNoBtn = (Button) findViewById(R.id.addonsNoBtn);
        addonLowBtn = (Button) findViewById(R.id.addonsLowBtn);
        addonNormalBtn = (Button) findViewById(R.id.addonsNormalBtn);
        addonHighBtn = (Button) findViewById(R.id.addonsHighBtn);
        addonExtraBtn = (Button) findViewById(R.id.addonsExtraBtn);

        cookingNoBtn = (Button) findViewById(R.id.cookingNoBtn);
        cookingLowBtn = (Button) findViewById(R.id.cookingLowBtn);
        cookingNormalBtn = (Button) findViewById(R.id.cookingNormalBtn);
        cookingHighBtn = (Button) findViewById(R.id.cookingHighBtn);
        cookingExtraBtn = (Button) findViewById(R.id.cookingExtraBtn);

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

        // Selected ingredient item set
        ingredientNoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ingredientOption = "";
                ingredientNoBtn.setAlpha((float) .5);
                ingredientLowBtn.setAlpha((float) 1);
                ingredientNormalBtn.setAlpha((float) 1);
                ingredientHighBtn.setAlpha((float) 1);
                ingredientExtraBtn.setAlpha((float) 1);
            }
        });
        ingredientLowBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ingredientOption = " / Low";
                ingredientNoBtn.setAlpha((float) 1);
                ingredientLowBtn.setAlpha((float) .5);
                ingredientNormalBtn.setAlpha((float) 1);
                ingredientHighBtn.setAlpha((float) 1);
                ingredientExtraBtn.setAlpha((float) 1);
            }
        });
        ingredientNormalBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ingredientOption = " / Normal";
                ingredientNoBtn.setAlpha((float) 1);
                ingredientLowBtn.setAlpha((float) 1);
                ingredientNormalBtn.setAlpha((float) .5);
                ingredientHighBtn.setAlpha((float) 1);
                ingredientExtraBtn.setAlpha((float) 1);
            }
        });
        ingredientHighBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ingredientOption = " / High";
                ingredientNoBtn.setAlpha((float) 1);
                ingredientLowBtn.setAlpha((float) 1);
                ingredientNormalBtn.setAlpha((float) 1);
                ingredientHighBtn.setAlpha((float) .5);
                ingredientExtraBtn.setAlpha((float) 1);
            }
        });
        ingredientExtraBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ingredientOption = " / Extra";
                ingredientNoBtn.setAlpha((float) 1);
                ingredientLowBtn.setAlpha((float) 1);
                ingredientNormalBtn.setAlpha((float) 1);
                ingredientHighBtn.setAlpha((float) 1);
                ingredientExtraBtn.setAlpha((float) .5);
            }
        });

        // Selected addons item set
        addonNoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addonsOption = "";
                addonNoBtn.setAlpha((float) .5);
                addonLowBtn.setAlpha((float) 1);
                addonNormalBtn.setAlpha((float) 1);
                addonHighBtn.setAlpha((float) 1);
                addonExtraBtn.setAlpha((float) 1);
            }
        });
        addonLowBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addonsOption = " / Low";
                addonNoBtn.setAlpha((float) 1);
                addonLowBtn.setAlpha((float) .5);
                addonNormalBtn.setAlpha((float) 1);
                addonHighBtn.setAlpha((float) 1);
                addonExtraBtn.setAlpha((float) 1);
            }
        });
        addonNormalBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addonsOption = " / Normal";
                addonNoBtn.setAlpha((float) 1);
                addonLowBtn.setAlpha((float) 1);
                addonNormalBtn.setAlpha((float) .5);
                addonHighBtn.setAlpha((float) 1);
                addonExtraBtn.setAlpha((float) 1);
            }
        });
        addonHighBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addonsOption = " / High";
                addonNoBtn.setAlpha((float) 1);
                addonLowBtn.setAlpha((float) 1);
                addonNormalBtn.setAlpha((float) 1);
                addonHighBtn.setAlpha((float) .5);
                addonExtraBtn.setAlpha((float) 1);
            }
        });
        addonExtraBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addonsOption = " / Extra";
                addonNoBtn.setAlpha((float) 1);
                addonLowBtn.setAlpha((float) 1);
                addonNormalBtn.setAlpha((float) 1);
                addonHighBtn.setAlpha((float) 1);
                addonExtraBtn.setAlpha((float) .5);
            }
        });

        // Selected cooking item set
        cookingNoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cookingOption = "";
                cookingNoBtn.setAlpha((float) .5);
                cookingLowBtn.setAlpha((float) 1);
                cookingNormalBtn.setAlpha((float) 1);
                cookingHighBtn.setAlpha((float) 1);
                cookingExtraBtn.setAlpha((float) 1);
            }
        });
        cookingLowBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cookingOption = " / Low";
                cookingNoBtn.setAlpha((float) 1);
                cookingLowBtn.setAlpha((float) .5);
                cookingNormalBtn.setAlpha((float) 1);
                cookingHighBtn.setAlpha((float) 1);
                cookingExtraBtn.setAlpha((float) 1);
            }
        });
        cookingNormalBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cookingOption = " / Normal";
                cookingNoBtn.setAlpha((float) 1);
                cookingLowBtn.setAlpha((float) 1);
                cookingNormalBtn.setAlpha((float) .5);
                cookingHighBtn.setAlpha((float) 1);
                cookingExtraBtn.setAlpha((float) 1);
            }
        });
        cookingHighBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cookingOption = " / High";
                cookingNoBtn.setAlpha((float) 1);
                cookingLowBtn.setAlpha((float) 1);
                cookingNormalBtn.setAlpha((float) 1);
                cookingHighBtn.setAlpha((float) .5);
                cookingExtraBtn.setAlpha((float) 1);
            }
        });
        cookingExtraBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cookingOption = " / Extra";
                cookingNoBtn.setAlpha((float) 1);
                cookingLowBtn.setAlpha((float) 1);
                cookingNormalBtn.setAlpha((float) 1);
                cookingHighBtn.setAlpha((float) 1);
                cookingExtraBtn.setAlpha((float) .5);
            }
        });

        navAddonsImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        addonsCancelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        addonsOkBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO - Need to implement the functionality
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
                    textView.setText(userChoice + ingredientOption);
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
                    textView.setText(userChoice + addonsOption);
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
                    textView.setText(userChoice + cookingOption);
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
