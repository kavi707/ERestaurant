package com.android.kavi.erestaurant.fragments;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import com.android.kavi.erestaurant.R;
import com.android.kavi.erestaurant.activities.SelectedItemsActivity;
import com.android.kavi.erestaurant.adapters.CustomGridViewAdapter;
import com.android.kavi.erestaurant.dataObjs.GridItem;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kavi707 on 5/27/15.
 * @author Kavimal Wijewardana <kavi707@gmail.com>
 */
public class MenuItemsFragment extends Fragment {

    private View menuItemFragmentView;

    private GridView menuItemGridView;
    private CustomGridViewAdapter customGridViewAdapter;
    private List<GridItem> gridViewItems = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        menuItemFragmentView = inflater.inflate(R.layout.fragment_menu_items, container, false);
        setUpViews();

        return menuItemFragmentView;
    }

    private void setUpViews() {

        Bitmap riceIcon = BitmapFactory.decodeResource(this.getResources(), R.drawable.rice_image);
        Bitmap noodlesIcon = BitmapFactory.decodeResource(this.getResources(), R.drawable.noodles_image);
        Bitmap chopcyIcon = BitmapFactory.decodeResource(this.getResources(), R.drawable.chopcy_image);

        gridViewItems.add(new GridItem(riceIcon, "Rice"));
        gridViewItems.add(new GridItem(noodlesIcon, "Noodles"));
        gridViewItems.add(new GridItem(chopcyIcon, "Chopcy"));

        menuItemGridView = (GridView) menuItemFragmentView.findViewById(R.id.menuItemGridView);
        customGridViewAdapter = new CustomGridViewAdapter(getActivity(), R.layout.grid_item, gridViewItems);
        menuItemGridView.setAdapter(customGridViewAdapter);

        menuItemGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.d("Grid Item pos: ", ">>>>>>>>>>>>>>>>>>>>>> " + position);
                Intent selectedItemIntent = new Intent(getActivity(), SelectedItemsActivity.class);
                startActivity(selectedItemIntent);
            }
        });
        // End of loading data to grid view
    }
}
