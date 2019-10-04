package com.example.healthblog;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class SliderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_slider);
        ViewPager viewPager = findViewById(R.id.viewPager);
        ImageAdapter adapter= new ImageAdapter(this);
        viewPager.setAdapter(adapter);
    }
}
