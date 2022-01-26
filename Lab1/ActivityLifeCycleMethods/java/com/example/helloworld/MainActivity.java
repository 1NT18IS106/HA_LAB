package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(), "OnCreate was called", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(getApplicationContext(), "OnRestart was called", Toast.LENGTH_SHORT).show();
    }

    protected void onStart(){
        super.onStart();
        Toast.makeText(getApplicationContext(), "OnStart was called", Toast.LENGTH_SHORT).show();
    }

    protected void onStop(){
        super.onStop();
        Toast.makeText(getApplicationContext(), "OnStop was called", Toast.LENGTH_SHORT).show();

    }
    protected void onResume(){
        super.onResume();
        Toast.makeText(getApplicationContext(), "OnResume was called", Toast.LENGTH_SHORT).show();

    }
    protected void onPause(){
        super.onPause();
        Toast.makeText(getApplicationContext(), "OnPause was called", Toast.LENGTH_SHORT).show();
    }

    protected void onDestroy(){
        super.onDestroy();
        Toast.makeText(getApplicationContext(), "OnDestroy was called", Toast.LENGTH_SHORT).show();
        Log.d("MainActivity" , "destroyed! ");
    }
}