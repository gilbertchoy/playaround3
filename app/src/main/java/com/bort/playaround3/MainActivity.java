package com.bort.playaround3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private int[] arr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        long x = 33*24*60*60*1000L;

        Date date = new Date(x);
        Log.d("test","result" + date.getMonth());
    }

}