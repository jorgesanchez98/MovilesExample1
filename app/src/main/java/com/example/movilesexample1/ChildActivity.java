package com.example.movilesexample1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ChildActivity extends AppCompatActivity {

    String anyString;
    TextView myTxtViewMng;
    Intent  intentReceiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);

        myTxtViewMng = findViewById(R.id.textView2);
        intentReceiver = getIntent();
        myTxtViewMng.setText(intentReceiver.getStringExtra("myExtra"));
    }


}