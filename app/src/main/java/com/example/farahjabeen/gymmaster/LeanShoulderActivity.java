package com.example.farahjabeen.gymmaster;

import android.content.Intent;
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

import java.util.List;

public class LeanShoulderActivity extends AppCompatActivity {


    ListView listView;
    private Toolbar toolbar;

    String[] exleanshl = { "Miltary Press" ,"Dumbbell Press" ,"Seated Military Press Machine" ,"Dumbbell Lateral Raise" ,"Cable Fron Raise" ,"Up Right Rows" ,"Barbbell Squats" ,"Front Barbbell Squats" ,"Calves Legs Press","Sumo Squat","Claf Machine","Calf Raise On Dumbbell","Squats"};
    int[] eximgleshl = {R.drawable.right_arrow ,R.drawable.right_arrow ,R.drawable.right_arrow ,R.drawable.right_arrow ,R.drawable.right_arrow ,R.drawable.right_arrow, R.drawable.right_arrow, R.drawable.right_arrow ,R.drawable.right_arrow,R.drawable.right_arrow,R.drawable.right_arrow,R.drawable.right_arrow,R.drawable.right_arrow};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lean_shoulder);

        listView = findViewById(R.id.leanshoulder);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
      //getSupportActionBar().setTitle("Shoulder and Legs");
        final ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setHomeAsUpIndicator(R.drawable.back_arrow);
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setDisplayShowTitleEnabled(true);
            getSupportActionBar().setTitle("Shoulder and Legs");

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
                    Intent intent = new Intent(getApplicationContext() , DumbellActivity.class);
                    startActivity(intent);
                }

                else if(i == 2)
                {
                    Intent intent = new Intent(getApplicationContext() , SeatedMiltaryPressMachineActivity.class);
                    startActivity(intent);
                }

                else if(i == 3)
                {
                    Intent intent = new Intent(getApplicationContext() , DumbellLateralPraiseActivity.class);
                    startActivity(intent);
                }

                else if(i == 4)
                {
                    Intent intent = new Intent(getApplicationContext() , CableFrontRaiseActivity.class);
                    startActivity(intent);
                }

                else if(i == 5)
                {
                    Intent intent = new Intent(getApplicationContext() , UpRightRowsActivity.class);
                    startActivity(intent);
                }
                else if(i == 6)
                {
                    Intent intent = new Intent(getApplicationContext() ,  BarbellSquatsActivity.class);
                    startActivity(intent);
                }
                else if(i == 7)
                {
                    Intent intent = new Intent(getApplicationContext() , FrontBarbellSquatsActivity.class);
                    startActivity(intent);
                }
                else if(i == 8)
                {
                    Intent intent = new Intent(getApplicationContext() , CalvesLegPressActivity.class);
                    startActivity(intent);
                }
                else if(i == 9)
                {
                    Intent intent = new Intent(getApplicationContext() , SumoSquatActivity.class);
                    startActivity(intent);
                }
                else if(i == 10)
                {
                    Intent intent = new Intent(getApplicationContext() , CalfMachineActivity.class);
                    startActivity(intent);
                }
                else if(i == 11)
                {
                    Intent intent = new Intent(getApplicationContext() , CalfRaiseDumbbellActivity.class);
                    startActivity(intent);
                }
                else if(i == 12)
                {
                    Intent intent = new Intent(getApplicationContext() , SquatsActivity.class);
                    startActivity(intent);
                }


            }
        });
    }

    private class CustomAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return exleanshl.length;
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
            View view1 = getLayoutInflater().inflate(R.layout.lean_shoudler,null);

            //getting view in row_data
            TextView name = view1.findViewById(R.id.chest);
            ImageView image = view1.findViewById(R.id.images);


            name.setText(exleanshl[i]);
            image.setImageResource(eximgleshl[i]);
            return view1;




        }
    }
}
