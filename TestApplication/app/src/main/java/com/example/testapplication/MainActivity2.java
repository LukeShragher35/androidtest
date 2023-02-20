package com.example.testapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity2 extends AppCompatActivity {

    public static final String TAG = MainActivity2.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Log.e("onCreate(): MainActivity2");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("onStart(): MainActivity2");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("onResume(): MainActivity2");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("onPause(): MainActivity2");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("onStop(): MainActivity2");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("onDestroy(): MainActivity2");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("onRestart(): MainActivity2");
    }
}