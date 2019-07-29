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


public class BulkyBackActivity extends AppCompatActivity {

    ListView listView;
    private Toolbar toolbar;


    String[] exnames = {"Miltary Press" , "Dumbell Press" ,"Seated Miltary Press Machine" , "Dumbell Lateral Praise" ,"Cable Front Raise" ," Up Right Rows"};
    int[] eximgs = {R.drawable.right_arrow ,R.drawable.right_arrow ,R.drawable.right_arrow ,R.drawable.right_arrow ,R.drawable.right_arrow ,R.drawable.right_arrow};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bulky_back);


        toolbar = (Toolbar) findViewById(R.id.toolbar);
        listView = findViewById(R.id.bulkyback);
        setSupportActionBar(toolbar);
        //getSupportActionBar().setTitle("Shoulder Exercises");


        final ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setHomeAsUpIndicator(R.drawable.back_arrow);
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setDisplayShowTitleEnabled(true);
            getSupportActionBar().setTitle("Shoulder Exercises");

        }





        CustomAdapter customAdapter = new CustomAdapter();
        listView.setAdapter(customAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                Toast.makeText(getApplicationContext(),fruitNames[i],Toast.LENGTH_LONG).show();
                if(i == 0)
                {
                    Intent intent = new Intent(getApplicationContext() ,MiltaryActivity.class);
                    startActivity(intent);
                }

               else if(i == 1)
                {
                    Intent intent = new Intent(getApplicationContext() ,DumbellActivity.class);
                    startActivity(intent);
                }

                else if(i == 2)
                {
                    Intent intent = new Intent(getApplicationContext() ,SeatedMiltaryPressMachineActivity.class);
                    startActivity(intent);
                }

                else if(i == 3)
                {
                    Intent intent = new Intent(getApplicationContext() ,DumbellLateralPraiseActivity.class);
                    startActivity(intent);
                }

                else if(i == 4)
                {
                    Intent intent = new Intent(getApplicationContext() ,CableFrontRaiseActivity.class);
                    startActivity(intent);
                }

                else if(i == 5)
                {
                    Intent intent = new Intent(getApplicationContext() ,UpRightRowsActivity.class);
                    startActivity(intent);
                }
            }
        });
    }

    private class CustomAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return eximgs.length;
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
            View view1 = getLayoutInflater().inflate(R.layout.bulky_back,null);

            //getting view in row_data
            TextView name = view1.findViewById(R.id.chest);
            ImageView image = view1.findViewById(R.id.images);


            name.setText(exnames[i]);
            image.setImageResource(eximgs[i]);
            return view1;




        }
    }
    }
