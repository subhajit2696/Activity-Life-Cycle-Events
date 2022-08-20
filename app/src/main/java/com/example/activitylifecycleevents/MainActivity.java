package com.example.activitylifecycleevents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override // 1
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Life Cycle Events: ","inside onCreate()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Life Cycle Events: ","inside onRestart()");
    }

    @Override //6
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Life Cycle Events: ","inside onDestroy()");
    }

    @Override //5
    protected void onStop() {
        super.onStop();
        Log.d("Life Cycle Events: ","inside onStop()");
    }

    @Override //3
    protected void onResume() {
        super.onResume();
        Log.d("Life Cycle Events: ","inside onResume()");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d("Life Cycle Events: ","inside onPostResume()");
    }

    @Override //4
    protected void onPause() {
        super.onPause();
        Log.d("Life Cycle Events: ","inside onPause()");
    }

    @Override // 2
    protected void onStart() {
        super.onStart();
        Log.d("Life Cycle Events: ","inside onStart()");
    }

}