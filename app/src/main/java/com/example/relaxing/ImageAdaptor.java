package com.example.relaxing;

import android.content.Context;
import android.media.Image;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ImageView;

import java.util.List;

public class ImageAdaptor extends BaseAdapter {

    List<Integer> imageIds;
    Context mContext;

    public ImageAdaptor(List<Integer> imageIds, Context mContext) {
        this.imageIds = imageIds;
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return imageIds.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ImageView imageView = (ImageView) convertView;

        if (imageView == null){
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(350, 450));
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        }
        imageView.setImageResource(imageIds.get(position));


        return imageView;
    }
}
