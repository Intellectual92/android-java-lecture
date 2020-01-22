package com.example.intent;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    int REQEUST_CODE = 1000;

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("lifeCycle", "onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1. 명시적 INTENT!!
        // 여기서 this = 메인 엑티비티
        Intent intent = new Intent(this, SecondActivity.class);
        // putExtra로 값을 intent에 넣는다.
        intent.putExtra("INTENT_KEY", 5);
        intent.putExtra("INTENT_KEY_STRING", "STRING");
        startActivityForResult(intent, REQEUST_CODE);

        // 2. 암시적 INTENT!!
        // 보통 앱 밖의 기능들을 사용할 때 사용
        // Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://google.com"));
        // startActivity(intent);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (requestCode == REQEUST_CODE) {
            if (resultCode == 200) {
                String result = data.getStringExtra("RESULT");
                Log.d("onActivityResult", "result : " + result);
            } else if (resultCode == 300) {
                Log.d("onActivityResult", "Fail");
            }
        }
    }


    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
    }

    @Override
    protected void onStart() {
        Log.d("lifeCycle", "onStart");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.d("lifeCycle", "onResume");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.d("lifeCycle", "onPause");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.d("lifeCycle", "onStop");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.d("lifeCycle", "onDestroy");
        super.onDestroy();
    }

    @Override
    protected void onRestart() {
        Log.d("lifeCycle", "onRestart");
        super.onRestart();
    }


}
