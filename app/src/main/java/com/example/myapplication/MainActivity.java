package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int size=30;

    public void bigger(View w){
           TextView big;
           big=findViewById(R.id.textView2);
           big.setTextSize(++size);
    }
    public void smaller(View w){
        TextView small=findViewById(R.id.textView2);
        small.setTextSize(--size);
    }
}
