package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LogCallActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_call);

        //get intent and extract phone number from call
        Intent intent = getIntent();
        //String phoneNum = intent.getStringExtra(mainActivity.PHONE_NUM); //mainactivity=placeholder
    }

    public void logYes(View view){
        //sql update to increment answered calls by 1
    }

    public void logNo(View view){
        //sql update to increment rejected calls by 1
    }

    public void cancel(View view){
        //close activity
    }
}