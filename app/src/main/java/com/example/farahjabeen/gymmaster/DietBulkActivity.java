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

public class DietBulkActivity extends AppCompatActivity {


    ListView listView;
    private Toolbar toolbar;


    String[] dietname = {"7 am Banana" ,"8 am Eggs" ,"9 am Breakfast","11 am Fruits","1 pm Lunch","3 pm Fruits","4 pm Green Tea","5 pm Banana","9 pm Eggs","9 pm Phulka with Chicken"};
    int[] dietbimg={R.drawable.right_arrow ,R.drawable.right_arrow,R.drawable.right_arrow ,R.drawable.right_arrow,R.drawable.right_arrow,R.drawable.right_arrow ,R.drawable.right_arrow,R.drawable.right_arrow,R.drawable.right_arrow,R.drawable.right_arrow};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diet_bulk);


        toolbar = (Toolbar) findViewById(R.id.toolbar);
        listView = findViewById(R.id.dietbulk);
        setSupportActionBar(toolbar);
        //getSupportActionBar().setTitle("Diet Plan");

        final ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setHomeAsUpIndicator(R.drawable.back_arrow);
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setDisplayShowTitleEnabled(true);
            getSupportActionBar().setTitle("Diet Plan");

        }

        CustomAdapter customAdapter = new CustomAdapter();
        listView.setAdapter(customAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                Toast.makeText(getApplicationContext(),fruitNames[i],Toast.LENGTH_LONG).show();
                if (i == 0)
                {
                    Intent intent = new Intent(getApplicationContext() ,BananaActivity.class);
                    startActivity(intent);
                }
                else if (i ==1 )
                {
                    Intent intent = new Intent(getApplicationContext() , EggsActivity.class);
                    startActivity(intent);
                }

                else if (i==2)
                {
                    Intent intent = new Intent(getApplicationContext() ,BreakfastActivity.class);
                    startActivity(intent);
                }
                else if (i== 3)
                {
                    Intent intent = new Intent(getApplicationContext() ,FruitsActivity.class);
                    startActivity(intent);
                }

                else if (i==4 )
                {
                    Intent intent = new Intent(getApplicationContext() , LunchActivity.class);
                    startActivity(intent);
                }
                else if (i== 5)
                {
                    Intent intent = new Intent(getApplicationContext() ,FruitsActivity.class);
                    startActivity(intent);
                }
                else if (i== 6)
                {
                    Intent intent = new Intent(getApplicationContext() ,GreenTeaActivity.class);
                    startActivity(intent);
                }
                else if (i== 7)
                {
                    Intent intent = new Intent(getApplicationContext() ,BananaActivity.class);
                    startActivity(intent);
                }
                else if (i== 8)
                {
                    Intent intent = new Intent(getApplicationContext() ,EggsActivity.class);
                    startActivity(intent);
                }
                else if (i== 9)
                {
                    Intent intent = new Intent(getApplicationContext() ,PulkyChickenActivity.class);
                    startActivity(intent);
                }

            }
        });
    }

    private class CustomAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return dietbimg.length;
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
            View view1 = getLayoutInflater().inflate(R.layout.diet_bulk,null);

            //getting view in row_data
            TextView name = view1.findViewById(R.id.chest);
            ImageView image = view1.findViewById(R.id.images);


            name.setText(dietname[i]);
            image.setImageResource(dietbimg[i]);
            return view1;




        }
    }
}
