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

public class LeanChestActivity extends AppCompatActivity {

    ListView listView;
    private Toolbar toolbar;
    String[] exleanchest = {"Push Ups" ,"Pull Ups" , "Flat Bench Press" ,"Decline Press" ,"Incline Bench Dumbbell Press" , "Chest Dips" ,"Dumbbell Bent arm pullover" ,"Lat Pull down's" ,"Seated Cable Row" ,"Close Grip Front Lap Pull Downs" ,"Bent Over Barbbell Row" ,"T Bar Row" ,"Dumbbell Rows"};
    int[] eximgleanchest = {R.drawable.right_arrow ,R.drawable.right_arrow ,R.drawable.right_arrow ,R.drawable.right_arrow ,R.drawable.right_arrow ,R.drawable.right_arrow ,R.drawable.right_arrow ,R.drawable.right_arrow ,R.drawable.right_arrow ,R.drawable.right_arrow ,R.drawable.right_arrow ,R.drawable.right_arrow ,R.drawable.right_arrow};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lean_chest);

        listView = findViewById(R.id.leanchest);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
       // getSupportActionBar().setTitle("Chest and Lats");

        final ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setHomeAsUpIndicator(R.drawable.back_arrow);
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setDisplayShowTitleEnabled(true);
            getSupportActionBar().setTitle("Chest and Lats");

        }


        CustomAdapter customAdapter = new CustomAdapter();
        listView.setAdapter(customAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                Toast.makeText(getApplicationContext(),fruitNames[i],Toast.LENGTH_LONG).show();
                if(i == 0)
                {
                    Intent intent = new Intent(getApplicationContext() ,PushUpActivity.class);
                    startActivity(intent);
                }

                else if(i == 1)
                {
                    Intent intent = new Intent(getApplicationContext() ,PullUpActivity.class);
                    startActivity(intent);
                }

                else if(i == 2)
                {
                    Intent intent = new Intent(getApplicationContext() , FlatBenchPressActivity.class);
                    startActivity(intent);
                }

                else if(i == 3)
                {
                    Intent intent = new Intent(getApplicationContext() ,DeclinePressActivity.class);
                    startActivity(intent);
                }

                else if(i == 4)
                {
                    Intent intent = new Intent(getApplicationContext() ,InclineBenchDumbbellPressActivity.class);
                    startActivity(intent);
                }

                else if(i == 5)
                {
                    Intent intent = new Intent(getApplicationContext() ,ChestDipsPressActivity.class);
                    startActivity(intent);
                }
                else if(i == 6)
                {
                    Intent intent = new Intent(getApplicationContext() ,DumbbellarmbentpulloverActivity.class);
                    startActivity(intent);
                }
                else if(i == 7)
                {
                    Intent intent = new Intent(getApplicationContext() , LatPullDownActivity.class);
                    startActivity(intent);
                }
                else if(i == 8)
                {
                    Intent intent = new Intent(getApplicationContext() , SeatedCableRowActivity.class);
                    startActivity(intent);
                }
                else if(i == 9)
                {
                    Intent intent = new Intent(getApplicationContext() , CloseGripFrontLatPullDownsActivity.class);
                    startActivity(intent);
                }
                else if(i == 10)
                {
                    Intent intent = new Intent(getApplicationContext() , BentOverBarbleRowActivity.class);
                    startActivity(intent);
                }
                else if(i == 11)
                {
                    Intent intent = new Intent(getApplicationContext() , TBarRowActivity.class);
                    startActivity(intent);
                }
                else if(i == 12)
                {
                    Intent intent = new Intent(getApplicationContext() , DumbellActivity.class);
                    startActivity(intent);
                }


            }
        });
    }

    private class CustomAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return eximgleanchest.length;
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
            View view1 = getLayoutInflater().inflate(R.layout.lean_chest,null);

            //getting view in row_data
            TextView name = view1.findViewById(R.id.chest);
            ImageView image = view1.findViewById(R.id.images);


            name.setText(exleanchest[i]);
            image.setImageResource(eximgleanchest[i]);
            return view1;




        }
    }
}
