package com.example.activitytest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class secondActivity extends baseactivity {

    @Override
    public void onBackPressed() {
        Intent intent= new Intent();
        intent.putExtra("data_return","hello firstActivity");
        setResult(RESULT_OK,intent);
        finish();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("secondactivity","onDestory");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("secondActivity","Task id is"+getTaskId());
        setContentView(R.layout.second_layout);
        Button button2=(Button) findViewById(R.id.button_2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)  {
                Intent intent= new Intent(secondActivity.this,thirdactivity.class);
               startActivity(intent);

            }

        });

    }
}