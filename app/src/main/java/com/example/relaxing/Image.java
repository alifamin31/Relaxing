package com.example.relaxing;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import java.util.List;

public class Image extends AppCompatActivity {
    ViewPager mPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);

        mPager = findViewById(R.id.pager);
        List<Integer> images = getIntent().getExtras().getIntegerArrayList("images");
        int currentImage = getIntent().getExtras().getInt("current");

        ImageFragmentAdapter adapter = new ImageFragmentAdapter(getSupportFragmentManager(),images);
        mPager.setAdapter(adapter);
        mPager.setCurrentItem(currentImage);
    }
}