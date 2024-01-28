package com.mobile_computing;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;

import java.io.Serializable;

public class ResultDisplayActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        Serializable serializeResult = intent.getSerializableExtra("datumApiSearch");
        if (serializeResult instanceof Datum) {
            Datum datumResult = (Datum) serializeResult;
            Log.println(Log.INFO, "------", datumResult.title()+" "+datumResult.date()+" "+datumResult.text()+" "+datumResult.imageUrl());
//            setContentView(R.layout.result_display);
            // todo - set the text views
        } else {
            System.out.println("Error: ResultDisplayActivity received non-Datum object");
//            setContentView(R.layout.error);
        }
    }
}
