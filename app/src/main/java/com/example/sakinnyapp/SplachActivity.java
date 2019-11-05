package com.example.sakinnyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class SplachActivity extends AppCompatActivity {
    Timer timer ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splach);
        timer = new Timer() ;
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(SplachActivity.this , LoginActivity.class) ;
                startActivity(intent);
                finish();

            }
        },2000);
    }
}
