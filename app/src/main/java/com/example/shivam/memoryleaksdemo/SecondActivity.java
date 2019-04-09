package com.example.shivam.memoryleaksdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {


    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        MemoryLeaksApp.getRefWatcher(this).watch(this);

        getSupportActionBar().setTitle("Second Activity");

        mTextView = findViewById(R.id.second_text);

    }
}
