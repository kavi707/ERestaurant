package com.android.kavi.erestaurant.customDialogs;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.android.kavi.erestaurant.R;

/**
 * Created by kavi707 on 8/30/15.
 *
 * @author Kavimal Wijewardana <kavi707@gmail.com>
 */
public class QtyDialog extends Dialog {

    private int qty;
    private String itemName;
    private OnDialogResult mDialogResult; // the callback

    public QtyDialog(Context context, String itemName) {
        super(context);
        this.itemName = itemName;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.dialog_qty_select);

        setUpViews();
    }

    private void setUpViews() {

        TextView itemNameTextView = (TextView) findViewById(R.id.popQtyTitleTextView);

        final ImageButton btnOne = (ImageButton) findViewById(R.id.oneImageBtn);
        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qty = 1;
                btnOne.setAlpha((float) 0.5);
            }
        });
        final ImageButton btnTwo = (ImageButton) findViewById(R.id.twoImageBtn);
        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qty = 2;
                btnTwo.setAlpha((float) 0.5);
            }
        });
        final ImageButton btnThree = (ImageButton) findViewById(R.id.threeImageBtn);
        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qty = 3;
                btnThree.setAlpha((float) 0.5);
            }
        });
        ImageButton btnFour = (ImageButton) findViewById(R.id.fourImageBtn);
        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qty = 4;
            }
        });
        ImageButton btnFive = (ImageButton) findViewById(R.id.fiveImageBtn);
        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qty = 5;
            }
        });
        ImageButton btnSix = (ImageButton) findViewById(R.id.sixImageBtn);
        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qty = 6;
            }
        });
        ImageButton btnSeven = (ImageButton) findViewById(R.id.sevenImageBtn);
        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qty = 7;
            }
        });
        ImageButton btnEight = (ImageButton) findViewById(R.id.eightImageBtn);
        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qty = 8;
            }
        });
        ImageButton btnNice = (ImageButton) findViewById(R.id.nineImageBtn);
        btnNice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qty = 9;
            }
        });
        ImageButton btnTen = (ImageButton) findViewById(R.id.tenImageBtn);
        btnTen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qty = 10;
            }
        });

        Button qtyOkBtn = (Button) findViewById(R.id.qtyOkBtn);
        Button qtyCancelBtn = (Button) findViewById(R.id.qtyCancelBtn);
        Button qtyOptionsBtn = (Button) findViewById(R.id.qtyOptionsBtn);

        itemNameTextView.setText(itemName);

        qtyCancelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mDialogResult != null) {
                    mDialogResult.finish(1);
                }
                dismiss();
            }
        });

        qtyOkBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mDialogResult != null) {
                    mDialogResult.finish(qty);
                }
                dismiss();
            }
        });

        qtyOptionsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    public void setDialogResult(OnDialogResult dialogResult){
        mDialogResult = dialogResult;
    }

    public interface OnDialogResult{
        void finish(int result);
    }
}
