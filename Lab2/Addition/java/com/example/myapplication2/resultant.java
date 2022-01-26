package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class resultant extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultant);
        TextView num3 = (TextView) findViewById(R.id.resultantsum);
        Bundle bundle = getIntent().getExtras();
        num3.setText(bundle.getString("key", "No value from the MainActivity"));
    }
    }
