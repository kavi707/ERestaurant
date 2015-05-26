package com.android.kavi.erestaurant.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.android.kavi.erestaurant.fragments.CreateOrderFragment;
import com.android.kavi.erestaurant.fragments.OrdersFragment;

/**
 * Created by kavi707 on 5/27/15.
 */
public class TabsPagerAdapter extends FragmentPagerAdapter {

    public TabsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int index) {

        switch (index) {
            case 0:
                // Orders fragment activity
                return new OrdersFragment();
            case 1:
                // Create Order fragment activity
                return new CreateOrderFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 2;
    }
}
