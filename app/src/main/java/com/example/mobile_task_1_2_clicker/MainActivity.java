package com.example.mobile_task_1_2_clicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView mainTextView;
    Button btn1;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn);
        btn1.setOnClickListener(this);

        mainTextView = findViewById(R.id.main_textview);
    }



    @Override
    public void onClick (View v){
        mainTextView.setText(String.valueOf(++count));
    }





}

