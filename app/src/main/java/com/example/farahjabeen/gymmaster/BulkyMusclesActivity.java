package com.example.farahjabeen.gymmaster;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
//import android.support.v7.widget.Toolbar;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class BulkyMusclesActivity extends AppCompatActivity {
    ListView listView;
    private Toolbar toolbar;

    String[] exerciseNames = {"Chest(Monday) 12 exercises" , "Shoulder(Tuesday) 6 exercise " , "Lat(Wednesday) 6 exercises" , "Biceps(Thursday) 6 exercises " , "Triceps(Friday)6 exercises " ,"Squats(Saturday) 7 exercises " , "Sixpack 6 exercises "};
    //int[] fruitImages = {R.drawable.apple,R.drawable.banana,R.drawable.kiwi,R.drawable.oranges};
    int[] Images = {R.drawable.right_arrow , R.drawable.right_arrow , R.drawable.right_arrow ,R.drawable.right_arrow ,R.drawable.right_arrow , R.drawable.right_arrow ,R.drawable.right_arrow };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bulky_muscles);


        //finding listview
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
       // getSupportActionBar().setTitle("Schedule Of Week");

        final ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setHomeAsUpIndicator(R.drawable.back_arrow);
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setDisplayShowTitleEnabled(true);
            getSupportActionBar().setTitle("Schedule Of Week");

        }


        listView = findViewById(R.id.bulkylist);

        CustomAdapter customAdapter = new CustomAdapter();
        listView.setAdapter(customAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//

                if (i == 0) {

                    Intent intent = new Intent(getApplicationContext() , BulkyChestActivity.class);
                    startActivity(intent);
                }

                else if (i == 1)
                {
                    Intent intent = new Intent(getApplicationContext() , BulkyBackActivity.class);
                    startActivity(intent);
                }

                else if (i == 2)
                {
                    Intent intent = new Intent(getApplicationContext() , BulkyLegsActivity.class);
                    startActivity(intent);
                }

                else if (i == 3)
                {
                    Intent intent = new Intent(getApplicationContext() , BulkyBicepsActivity.class);
                    startActivity(intent);
                }

                else if (i == 4)
                {
                    Intent intent = new Intent(getApplicationContext() , BulkyTricepsActivity.class);
                    startActivity(intent);
                }
                else if (i == 5)
                {
                    Intent intent = new Intent(getApplicationContext() , BulkySquatsActivity.class);
                    startActivity(intent);
                }
                else if(i==6)
                {
                    Intent intent = new Intent(getApplicationContext() , BulkySixActivity.class);
                    startActivity(intent);
                }


            }

        });
    }

    private class CustomAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return Images.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            View view1 = getLayoutInflater().inflate(R.layout.bulky_list,null);

            //getting view in row_data
            TextView name = view1.findViewById(R.id.chest);
            ImageView image = view1.findViewById(R.id.images);


            name.setText(exerciseNames[i]);
            image.setImageResource(Images[i]);
            return view1;




        }
    }
}
