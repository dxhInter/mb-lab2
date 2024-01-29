package com.mobile_computing;


import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import java.io.Serializable;


/**
 * This activity displays the result of a book
 * @author dxh
 * @date 1/27/24
 */
public class ResultDisplayActivity extends AppCompatActivity {

    private static ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);
        Intent intent = getIntent();
        Serializable serializeResult = intent.getSerializableExtra("datumApiSearch");
        if (!(serializeResult instanceof Datum)) {
            Log.println(Log.ERROR, "ResultDisplayActivity", "not a datum");
        } else {
            // todo - set the result views
            Datum datumResult = (Datum) serializeResult;
            Log.println(Log.DEBUG, "datumResult:", datumResult.title()+" "+datumResult.date()+" "+datumResult.text()+" "+datumResult.imageUrl());
            int id = datumResult.id();
            String date = datumResult.date();
            String title = datumResult.title();
            String text = datumResult.text();
            String imageUrl = datumResult.imageUrl();

            // Setting up the action bar
            actionBar = getSupportActionBar();
            if(actionBar != null) {
                // 1. Enabling the back button
                actionBar.setDisplayHomeAsUpEnabled(true);
                // 2. Enabling the title and setting it.
                actionBar.setDisplayShowTitleEnabled(true);
                actionBar.setTitle(title);
            }

            TextView titleView = (TextView) findViewById(R.id.res_title);
            TextView dataView = (TextView) findViewById(R.id.res_date);
            TextView idView = (TextView) findViewById(R.id.res_id);
            TextView textView = (TextView) findViewById(R.id.res_description);
            ImageView imageView = (ImageView) findViewById(R.id.res_image);
            titleView.setText(title);
            dataView.setText(date);
            textView.setText(text);
            idView.setText(String.valueOf(id));
            // todo - set the image view
        }
    }

    /**
     * This method is called when the back button is pressed.
     * @param item the menu item that was selected.
     * @return true if the back button is pressed, false otherwise.
     */
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                finish();
                break;
            default:
        }
        return true;
    }
}
