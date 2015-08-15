package com.android.kavi.erestaurant.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.android.kavi.erestaurant.R;
import com.android.kavi.erestaurant.dataObjs.GridItem;

/**
 * Created by kavi707 on 8/16/15.
 *
 * @author Kavimal Wijewardana <kavi707@gmail.com>
 */
public class GridItemView extends RelativeLayout {

    private TextView gridItemNameTextView;

    private GridItem gridItem;

    public GridItemView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();

        gridItemNameTextView = (TextView) findViewById(R.id.gridItemTextView);
    }

    public GridItem getGridItem() {
        return gridItem;
    }

    public void setGridItem(GridItem gridItem) {
        this.gridItem = gridItem;

        gridItemNameTextView.setText(gridItem.getTitle());
    }
}
