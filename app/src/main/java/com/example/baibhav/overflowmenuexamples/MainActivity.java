package com.example.baibhav.overflowmenuexamples;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

    public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            //return super.onCreateOptionsMenu(menu);
            getMenuInflater().inflate(R.menu.main_menu,menu);
            return true;
        }


        @Override
        public boolean onOptionsItemSelected(MenuItem item) {
            // return super.onOptionsItemSelected(item);

            ConstraintLayout main_view=(ConstraintLayout) findViewById(R.id.main_view);

            switch (item.getItemId()){

                case R.id.menu_red:
                    if(item.isChecked())
                        item.setChecked(false);
                    else
                        item.setChecked(true);
                        main_view.setBackgroundColor(Color.RED);
                        return true;



                case R.id.menu_blue:
                    if(item.isChecked())
                        item.setChecked(false);
                    else
                        item.setChecked(true);
                    main_view.setBackgroundColor(Color.BLUE);
                    return true;


                case R.id.menu_green:
                    if(item.isChecked())
                        item.setChecked(false);
                    else
                        item.setChecked(true);
                    main_view.setBackgroundColor(Color.GREEN);
                    return true;

                default:
                        return super.onOptionsItemSelected(item);
            }

        }
    }
