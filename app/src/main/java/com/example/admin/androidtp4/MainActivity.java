package com.example.admin.androidtp4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("formation","première Log !");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
