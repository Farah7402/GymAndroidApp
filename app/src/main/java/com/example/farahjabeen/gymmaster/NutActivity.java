package com.example.farahjabeen.gymmaster;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class NutActivity extends AppCompatActivity {

    private Toolbar mToolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nut);

        mToolbar = (Toolbar) findViewById(R.id.atoolbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("GroundNuts");
    }

}
