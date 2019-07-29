package com.example.farahjabeen.gymmaster;

import android.support.v7.app.ActionBar;
import android.content.Intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

   // ListView listView;
    private Toolbar toolbar;
    private ListView listView;



    int[] exerciseImages = {R.drawable.bulky, R.drawable.lean, R.drawable.sixpack, R.drawable.diet};


     @Override
    protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_main);

         toolbar = (Toolbar) findViewById(R.id.toolbar);
         listView = (ListView) findViewById(R.id.listview);
         setSupportActionBar(toolbar);

         final ActionBar actionBar = getSupportActionBar();
         if (actionBar != null) {
             actionBar.setHomeAsUpIndicator(R.drawable.icongym);
             actionBar.setDisplayHomeAsUpEnabled(true);
             actionBar.setDisplayShowTitleEnabled(true);
             getSupportActionBar().setTitle("Gym Master");

         }


         CustomAdapter customAdapter = new CustomAdapter();
         listView.setAdapter(customAdapter);


         listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
             public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                 if (i == 0) {
                     Intent intent = new Intent(getApplicationContext(), BulkyMusclesActivity.class);
                     startActivity(intent);


                 } else if (i == 1) {


                     Intent intent = new Intent(getApplicationContext(), LeanActivity.class);
                     startActivity(intent);

                 } else if (i == 2) {


                     Intent intent = new Intent(getApplicationContext(), SixpackActivity.class);
                     startActivity(intent);


                 } else if (i == 3)

                 {


                     Intent intent = new Intent(getApplicationContext(), DietActivity.class);
                     startActivity(intent);

                 }
             }
         });
     }

    private class CustomAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return exerciseImages.length;
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


            View view1 = getLayoutInflater().inflate(R.layout.main_list, null);
            //getting view in row_data

            ImageView image = view1.findViewById(R.id.images);


            image.setImageResource(exerciseImages[i]);
            return view1;



        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_activity_main ,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {


         if(item.getItemId() == R.id.about_id)
         {
             Intent aboutintent = new Intent(getApplicationContext() , AboutActivity.class);
             startActivity(aboutintent);
         }

         else if(item.getItemId() == R.id.contact_id)
         {
             Intent aboutintent = new Intent(getApplicationContext() , ContactActivity.class);
             startActivity(aboutintent);
         }

         return super.onOptionsItemSelected(item);
    }
}
