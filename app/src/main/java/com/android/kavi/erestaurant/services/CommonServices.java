package com.android.kavi.erestaurant.services;

import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import android.view.Display;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by kavi707 on 6/2/15.
 * @author Kavimal Wijewardana <kavi707@gmail.com>
 */
public class CommonServices {

    /**
     * check the internet connection in the device for running application
     * @param context
     * @return boolean
     */
    public boolean isOnline(Context context) {

        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();

        if (networkInfo != null && networkInfo.isConnectedOrConnecting()) {
            return true;
        }

        return false;
    }

    /**
     * return the device screen width and height
     * @param activity
     * @return
     */
    public Map<String, Integer> getDeviceWidthAndHeight(Activity activity) {
        Map<String, Integer> deviceWidthHeight = new HashMap<String, Integer>();

        Display mDisplay = activity.getWindowManager().getDefaultDisplay();
        int width  = mDisplay.getWidth();
        int height = mDisplay.getHeight();

        deviceWidthHeight.put("width", width);
        deviceWidthHeight.put("height", height);

        Log.d("Device width : ", String.valueOf(width));
        Log.d("Device height : ", String.valueOf(height));

        return deviceWidthHeight;
    }
}
