package com.example.activitylifecycleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("ActivitylifecycleApp","OnCreate()");
    }
    @Override
    public void onStart(){
        super.onStart();
        Log.d("ActivitylifecycleApp","OnStart()");
    }
    @Override
    public void onStop(){
        super.onStop();
        Log.d("ActivitylifecycleApp","OnStop()");
    }
    @Override
    public void onPause(){
        super.onPause();
        Log.d("ActivitylifecycleApp","OnPause()");
    }
    @Override
    public void onResume(){
        super.onResume();
        Log.d("ActivitylifecycleApp","OnResume()");
    }
    @Override
    public void onDestroy(){
        super.onDestroy();
        Log.d("ActivitylifecycleApp","OnDestroy()");
    }
}