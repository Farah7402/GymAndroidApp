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

public class LeanActivity extends AppCompatActivity {

    ListView listView;
    private Toolbar toolbar;

    String[] exerciseNames = {"Chest,Lats(Monday) 12 exercises" , " Shoulder,Legs(Tuesday) 12 exercise " , "Biceps,Triceps(Wednesday) 12 exercises" , "Chest Lats (Thursday) 13 exercises " , " Shoulder,Legs(Tuesday) 13 exercise " , "Biceps,Triceps(Wednesday) 12 exercises" ,"Six Packs"};
    //int[] fruitImages = {R.drawable.apple,R.drawable.banana,R.drawable.kiwi,R.drawable.oranges};
    int[] Images = {R.drawable.right_arrow , R.drawable.right_arrow , R.drawable.right_arrow ,R.drawable.right_arrow ,R.drawable.right_arrow , R.drawable.right_arrow ,R.drawable.right_arrow };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lean);


        //finding listview
        listView = findViewById(R.id.lean_list);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        //getSupportActionBar().setTitle("Schedule Of Week");

        final ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setHomeAsUpIndicator(R.drawable.back_arrow);
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setDisplayShowTitleEnabled(true);
            getSupportActionBar().setTitle("Schedule Of Week");

        }






        CustomAdapter customAdapter = new CustomAdapter();
        listView.setAdapter(customAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//

                if (i == 0) {

                    Intent intent = new Intent(getApplicationContext() , LeanChestActivity.class);
                    startActivity(intent);
                }

               else if (i == 1)
              {
                  Intent intent = new Intent(getApplicationContext() , LeanShoulderActivity.class);
                  startActivity(intent);
              }

                else if (i == 2)
                {
                    Intent intent = new Intent(getApplicationContext() , LeanBicepsActivity.class);
                    startActivity(intent);
                }

                else if (i == 3)
                {
                    Intent intent = new Intent(getApplicationContext() , LeanChestActivity.class);
                    startActivity(intent);
                }

                else if (i == 4)
                {
                    Intent intent = new Intent(getApplicationContext() , LeanShoulderActivity.class);
                    startActivity(intent);
                }
                else if (i == 5)
                {
                    Intent intent = new Intent(getApplicationContext() , LeanBicepsActivity.class);
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
            View view1 = getLayoutInflater().inflate(R.layout.leanlist,null);

            //getting view in row_data
            TextView name = view1.findViewById(R.id.chest);
            ImageView image = view1.findViewById(R.id.images);


            name.setText(exerciseNames[i]);
            image.setImageResource(Images[i]);
            return view1;




        }
    }
}
