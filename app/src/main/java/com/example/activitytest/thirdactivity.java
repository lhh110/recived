package com.example.activitytest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class thirdactivity extends baseactivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("thirdactivity","Task id is"+getTaskId());
        setContentView(R.layout.thirdlayout);
        Button button3 = (Button) findViewById(R.id.button_3);
        button3.setOnClickListener(new View.OnClickListener () {
            @Override
            public void onClick (View v) {
              activitycollector.finishAll();
            }
            });
    }
}