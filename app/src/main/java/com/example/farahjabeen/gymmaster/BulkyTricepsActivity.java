package com.example.farahjabeen.gymmaster;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.support.v7.widget.Toolbar;

public class BulkyTricepsActivity extends AppCompatActivity {

    ListView listView;
    private Toolbar toolbar;




    String[] exnamet = {"Dumbbell Extension" ,"Incline Triceps Extension" ,"Cable Triceps Extension" ,"Close Grip Bench Press" ,"Narrow grip Push Ups" ,"Machine Triceps Extension"};
    int[] eximgt ={R.drawable.right_arrow ,R.drawable.right_arrow ,R.drawable.right_arrow, R.drawable.right_arrow, R.drawable.right_arrow, R.drawable.right_arrow};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bulky_triceps);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        listView = findViewById(R.id.bulkytriceps);
        setSupportActionBar(toolbar);
        //getSupportActionBar().setTitle("Triceps Exercises");


        final ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setHomeAsUpIndicator(R.drawable.back_arrow);
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setDisplayShowTitleEnabled(true);
            getSupportActionBar().setTitle("Triceps Exercises");

        }
        CustomAdapter customAdapter = new CustomAdapter();
        listView.setAdapter(customAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                Toast.makeText(getApplicationContext(),fruitNames[i],Toast.LENGTH_LONG).show();
                if(i==0)
                {
                    Intent intent = new Intent(getApplicationContext() ,DumbbellExtensionActivity.class );
                    startActivity(intent);

                }

                else if(i==1)
                {
                    Intent intent = new Intent(getApplicationContext() ,InclineTricepsExtensionActivity.class );
                    startActivity(intent);

                }
                else if(i==2)
                {
                    Intent intent = new Intent(getApplicationContext() ,CableTricepsExtensionActivity.class );
                    startActivity(intent);
                }
                else if(i==3)
                {
                    Intent intent = new Intent(getApplicationContext() ,CloseGripBenchPressActivity.class );
                    startActivity(intent);

                }

                else if(i==4)
                {
                    Intent intent = new Intent(getApplicationContext() ,NarrowgripPushUpsActivity.class );
                    startActivity(intent);
                }
                else if(i==5)
                {
                    Intent intent = new Intent(getApplicationContext() , MachineTricepsExtensionActivity.class );
                    startActivity(intent);
                }
            }
        });
    }

    private class CustomAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return eximgt.length;
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
            View view1 = getLayoutInflater().inflate(R.layout.bulky_triceps,null);

            //getting view in row_data
            TextView name = view1.findViewById(R.id.chest);
            ImageView image = view1.findViewById(R.id.images);


            name.setText(exnamet[i]);
            image.setImageResource(eximgt[i]);
            return view1;




        }
    }
}
