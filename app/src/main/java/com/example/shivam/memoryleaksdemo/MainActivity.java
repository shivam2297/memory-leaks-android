package com.example.shivam.memoryleaksdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTextView;
    private Button mPressMeBtn;
    private boolean clickable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Main Activity");

        mTextView = findViewById(R.id.textview);
        mPressMeBtn = findViewById(R.id.press_me_btn);
    }

    @Override
    protected void onResume() {
        super.onResume();

        clickable = true;

        mPressMeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!clickable)
                    return;
                else {
                    clickable = false;
                    Intent secondActivityIntent = new Intent(MainActivity.this, SecondActivity.class);
                    startActivity(secondActivityIntent);
                }
            }
        });
    }
}
