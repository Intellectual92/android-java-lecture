package com.example.intent;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("lifeCycle", "onCreate2");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

//        Intent intent = getIntent();
//        int data = intent.getIntExtra("INTENT_KEY", 0);
//        String StringData = intent.getStringExtra("INTENT_KEY_STRING");
//
//        Log.d("intent_key", "" + data);
//        Log.d("intent_key", "" + StringData);

        // 작업을 마친 후..
        Intent intent = new Intent();
        intent.putExtra("RESULT", "Success");
        setResult(300, intent);
        // second activity 종료
        finish();
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
    }

    @Override
    protected void onStart() {
        Log.d("lifeCycle", "onStart2");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.d("lifeCycle", "onResume2");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.d("lifeCycle", "onPause2");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.d("lifeCycle", "onStop2");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.d("lifeCycle", "onDestroy2");
        super.onDestroy();
    }

    @Override
    protected void onRestart() {
        Log.d("lifeCycle", "onRestart2");
        super.onRestart();
    }

}
