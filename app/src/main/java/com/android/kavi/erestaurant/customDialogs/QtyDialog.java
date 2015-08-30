package com.android.kavi.erestaurant.customDialogs;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;

import com.android.kavi.erestaurant.R;

/**
 * Created by kavi707 on 8/30/15.
 *
 * @author Kavimal Wijewardana <kavi707@gmail.com>
 */
public class QtyDialog extends Dialog {

    public QtyDialog(Context context) {
        super(context);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.popup_qty_select);

        setUpViews();
    }

    private void setUpViews() {
        ImageButton btnOne = (ImageButton) findViewById(R.id.oneImageBtn);
        ImageButton btnTwo = (ImageButton) findViewById(R.id.twoImageBtn);
        ImageButton btnThree = (ImageButton) findViewById(R.id.threeImageBtn);
        ImageButton btnFour = (ImageButton) findViewById(R.id.fourImageBtn);
        ImageButton btnFive = (ImageButton) findViewById(R.id.fiveImageBtn);
        ImageButton btnSix = (ImageButton) findViewById(R.id.sixImageBtn);
        ImageButton btnSeven = (ImageButton) findViewById(R.id.sevenImageBtn);
        ImageButton btnEight = (ImageButton) findViewById(R.id.eightImageBtn);
        ImageButton btnNice = (ImageButton) findViewById(R.id.nineImageBtn);
        ImageButton btnTen = (ImageButton) findViewById(R.id.tenImageBtn);

        Button qtyOkBtn = (Button) findViewById(R.id.qtyOkBtn);
        Button qtyCancelBtn = (Button) findViewById(R.id.qtyCancelBtn);
        Button qtyOptionsBtn = (Button) findViewById(R.id.qtyOptionsBtn);

        qtyCancelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });
    }
}
