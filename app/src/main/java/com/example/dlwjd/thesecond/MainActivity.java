package com.example.dlwjd.thesecond;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import static com.example.dlwjd.thesecond.R.id.view;

public class MainActivity extends AppCompatActivity {


    Adapter adapter;
    ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = (ViewPager) findViewById(view);
        //// je ne sais pas';;;
        adapter = new Adapter(this);
        viewPager.setAdapter(adapter);
        ///after make premier, setting adapter
    }
}
