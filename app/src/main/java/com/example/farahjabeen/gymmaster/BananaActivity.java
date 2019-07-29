package com.example.farahjabeen.gymmaster;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import  android.support.v7.widget.Toolbar;

public class BananaActivity extends AppCompatActivity {

    private android.support.v7.widget.Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banana);


        mToolbar = (android.support.v7.widget.Toolbar) findViewById(R.id.atoolbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("Banana");

    }
}
