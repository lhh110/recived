package com.example.activitytest;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.concurrent.atomic.AtomicBoolean;

import static com.example.activitytest.R.id;
import static com.example.activitytest.R.layout;

public class firstActivity extends baseactivity {

    @Override
    protected void onActivityResult (int requestCode, int resultCode,  Intent data) {
        switch (requestCode) {
            case 1:
                if (resultCode==RESULT_OK) {
                    String returnedData = data.getStringExtra("data_return");
                    Log.d("firstActivity",returnedData);
                }
                break;
            default:
        }
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case id.add_item:
                Toast.makeText(this ,"you clicked add",Toast.LENGTH_SHORT).show();
                 break;
            case id.remove_item:
                Toast.makeText(this ,"you click remove",Toast.LENGTH_SHORT).show();
                break;
            default:
        }
        return true;
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("firstActivity","onRestart");
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("firstActivity","Task id is"+getTaskId());
     setContentView(layout.first_layout);
     Button button1 = (Button) findViewById(id.button_1);
     button1.setOnClickListener(new View.OnClickListener () {
         @Override
         public void onClick (View v) {
                 Intent intent = new Intent(firstActivity.this, secondActivity.class);
                 startActivity(intent);
             }


        });
       }
     }
