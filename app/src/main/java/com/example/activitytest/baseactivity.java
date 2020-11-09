package com.example.activitytest;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class baseactivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        Log.d("baseactivity",getClass().getSimpleName());
        activitycollector.addActivity(this);
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        activitycollector.removeActivity(this);
    }
}
