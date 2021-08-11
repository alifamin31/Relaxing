package com.example.relaxing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.Arrays;

public class Photo extends AppCompatActivity {
    GridView gridView;
    ArrayList<Integer> images = new ArrayList<>(Arrays.asList(
            R.drawable.img1, R.drawable.img2, R.drawable.img3, R.drawable.img4,
            R.drawable.img5, R.drawable.img6, R.drawable.img7, R.drawable.img8,
            R.drawable.img9, R.drawable.img10, R.drawable.img11, R.drawable.img12
    ));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo);

        gridView = findViewById(R.id.imageGrid);
        ImageAdaptor imageAdaptor = new ImageAdaptor(images, this);
        gridView.setAdapter(imageAdaptor);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(Photo.this, Image.class);
                i.putExtra("images", images);
                i.putExtra("current", position);
                startActivity(i);
            }
        });
    }
}