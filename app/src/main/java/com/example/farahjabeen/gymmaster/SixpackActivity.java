package com.example.farahjabeen.gymmaster;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class SixpackActivity extends AppCompatActivity {

    ListView listView;
    private Toolbar toolbar;
    String[] exnames = {"Abs Legs" , "Cross Body Crunches" , "JackKnives" ,"Leg Raises" ,"Plank Exercise","Reverse Crunches" ,"Knee Crunches","Mountain Climbers"  ,"Superman" ,"WindShield Wipers"};
    int[] eximg = {R.drawable.right_arrow ,R.drawable.right_arrow ,R.drawable.right_arrow , R.drawable.right_arrow ,R.drawable.right_arrow , R.drawable.right_arrow ,R.drawable.right_arrow ,R.drawable.right_arrow ,R.drawable.right_arrow ,R.drawable.right_arrow};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixpack);

        listView = findViewById(R.id.sixpack);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
//        getSupportActionBar().setTitle("SixPacks");

        final ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setHomeAsUpIndicator(R.drawable.back_arrow);
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setDisplayShowTitleEnabled(true);
            getSupportActionBar().setTitle("SixPacks");

        }


        CustomAdapter customAdapter = new CustomAdapter();
        listView.setAdapter(customAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                Toast.makeText(getApplicationContext(),fruitNames[i],Toast.LENGTH_LONG).show();
                if(i == 0)
                {
                    Intent intent = new Intent(getApplicationContext() , AbsLegRaisesActivity.class);
                    startActivity(intent);
                }

                else if(i == 1)
                {
                    Intent intent = new Intent(getApplicationContext() , CrossBodyCrunchesActivity.class);
                    startActivity(intent);
                }

                else if(i == 2)
                {
                    Intent intent = new Intent(getApplicationContext() , JackKnivesActivity.class);
                    startActivity(intent);
                }

                else if(i == 3)
                {
                    Intent intent = new Intent(getApplicationContext() , LegRaisesActivity.class);
                    startActivity(intent);

                }

                else if(i == 4)
                {
                    Intent intent = new Intent(getApplicationContext() , PlankExerciseActivity.class);
                    startActivity(intent);
                }

                else if(i == 5)
                {

                    Intent intent = new Intent(getApplicationContext() , ReverseCrunchesActivity.class);
                    startActivity(intent);

                }

                else if(i == 6)
                {
                    Intent intent = new Intent(getApplicationContext() , KneeCrunchesActivity.class);
                    startActivity(intent);

                }

                else if(i == 7)
                {
                    Intent intent = new Intent(getApplicationContext() , MountainClimberActivity.class);
                    startActivity(intent);
                }


                else if(i == 8)
                {
                    Intent intent = new Intent(getApplicationContext() , SupermanActivity.class);
                    startActivity(intent);
                }
                else if(i == 9)
                {
                    Intent intent = new Intent(getApplicationContext() , WindShieldWipersActivity.class);
                    startActivity(intent);
                }


            }
        });
    }

    private class CustomAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return eximg.length;
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
            View view1 = getLayoutInflater().inflate(R.layout.six_list,null);

            //getting view in row_data
            TextView name = view1.findViewById(R.id.chest);
            ImageView image = view1.findViewById(R.id.images);


            name.setText(exnames[i]);
            image.setImageResource(eximg[i]);
            return view1;




        }
    }

    }

