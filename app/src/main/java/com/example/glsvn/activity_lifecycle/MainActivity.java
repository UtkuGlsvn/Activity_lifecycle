package com.example.glsvn.activity_lifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //called when activity is in resume
    @Override
    protected void onPostResume() {
        super.onPostResume();
        Toast.makeText(this,"onResume event",Toast.LENGTH_SHORT).show();

    }
    //called when activity is in start
    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this,"onStart event",Toast.LENGTH_SHORT).show();

    }
    //called when activity is in pause

    protected void onPause() {
        super.onPause();
        Toast.makeText(this,"onPause event",Toast.LENGTH_SHORT).show();
    }

    //called when activity is in stop
    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this,"onStop event",Toast.LENGTH_SHORT).show();
    }

    //called when activity is in Destroy
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this,"onDestroy event",Toast.LENGTH_SHORT).show();
    }

    //called when activity is in create
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,"OnCreate event",Toast.LENGTH_SHORT).show();

    }
}
