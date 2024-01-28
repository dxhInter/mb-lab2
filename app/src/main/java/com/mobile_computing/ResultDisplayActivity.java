package com.mobile_computing;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.Serializable;


/**
 * This activity displays the result of a book
 * @author dxh
 * @date 1/27/24
 */
public class ResultDisplayActivity extends Activity {
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
}
