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

public class DietLeanSixActivity extends AppCompatActivity {

    ListView listView;
    private Toolbar toolbar;

    String[] dietlsn = {"6 am Warm Water" ,"9 am Eggs" ,"9 am Milk","9 am Oats","11 am Apple,Oranges" ,"1 pm Phulka","4 pm Black Eyed Peas","4 pm Ground Nuts" ,"5 pm Green Tea","6 pm Milk","6 pm Eggs","9 pm Coconut Water" ,"9 pm Phulka"};
    int[] dietimgls = {R.drawable.right_arrow ,R.drawable.right_arrow ,R.drawable.right_arrow ,R.drawable.right_arrow,R.drawable.right_arrow ,R.drawable.right_arrow,R.drawable.right_arrow ,R.drawable.right_arrow,R.drawable.right_arrow ,R.drawable.right_arrow,R.drawable.right_arrow,R.drawable.right_arrow,R.drawable.right_arrow};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diet_lean_six);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        listView = findViewById(R.id.dietleansix);
        setSupportActionBar(toolbar);
       // getSupportActionBar().setTitle("Diet Plan");
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
               if( i == 0)
               {
                   Intent intent = new Intent(getApplicationContext() , WaterActivity.class);
                   startActivity(intent);
               }

               else if(i==1)
                    {
                        Intent intent = new Intent(getApplicationContext() ,EggsActivity.class);
                        startActivity(intent);
                    }
               else if(i==2)
               {
                   Intent intent = new Intent(getApplicationContext() ,MilkActivity.class);
                   startActivity(intent);
               }
               else if(i==3)
               {
                   Intent intent = new Intent(getApplicationContext() ,OatsActivity.class);
                   startActivity(intent);
               }
               else if(i==4)
               {
                   Intent intent = new Intent(getApplicationContext() ,AppleOActivity.class);
                   startActivity(intent);
               }

               else if(i==5)
               {
                   Intent intent = new Intent(getApplicationContext() ,PulkaActivity.class);
                   startActivity(intent);
               }
               else if(i==6)
               {
                   Intent intent = new Intent(getApplicationContext() ,PeasActivity.class);
                   startActivity(intent);
               }
               else if(i==7)
               {
                   Intent intent = new Intent(getApplicationContext() ,NutActivity.class);
                   startActivity(intent);
               }
               else if(i==8)
               {
                   Intent intent = new Intent(getApplicationContext() ,GreenTeaActivity.class);
                   startActivity(intent);
               }
               else if(i==9)
               {
                   Intent intent = new Intent(getApplicationContext() ,MilkActivity.class);
                   startActivity(intent);
               }
               else if(i==10)
               {
                   Intent intent = new Intent(getApplicationContext() ,EggsActivity.class);
                   startActivity(intent);
               }
               else if(i==11)
               {
                   Intent intent = new Intent(getApplicationContext() ,CoconutActivity.class);
                   startActivity(intent);
               }
               else if(i==12)
               {
                   Intent intent = new Intent(getApplicationContext() ,PulkaActivity.class);
                   startActivity(intent);
               }




            }
        });
    }

    private class CustomAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return dietimgls.length;
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
            View view1 = getLayoutInflater().inflate(R.layout.diet_lean_six ,null);

            //getting view in row_data
            TextView name = view1.findViewById(R.id.chest);
            ImageView image = view1.findViewById(R.id.images);


            name.setText(dietlsn[i]);
            image.setImageResource(dietimgls[i]);
            return view1;




        }
    }
}
