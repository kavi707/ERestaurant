package com.android.kavi.erestaurant.dataObjs;

import android.graphics.Bitmap;

/**
 * Created by kavi707 on 6/2/15.
 * @author Kavimal Wijewardana <kavi707@gmail.com>
 */
public class GridItem {

    Bitmap image;
    String title;

    public GridItem(Bitmap image, String title) {
        super();
        this.image = image;
        this.title = title;
    }
    public Bitmap getImage() {
        return image;
    }
    public void setImage(Bitmap image) {
        this.image = image;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
}
