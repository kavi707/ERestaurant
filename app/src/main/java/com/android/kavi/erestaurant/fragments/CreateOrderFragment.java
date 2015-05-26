package com.android.kavi.erestaurant.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.kavi.erestaurant.R;

/**
 * Created by kavi707 on 5/27/15.
 */
public class CreateOrderFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_create_order, container, false);

        return rootView;
    }
}
