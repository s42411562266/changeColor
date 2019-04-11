package com.example.myapplication;

import android.graphics.Color;
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
    public void color(View w){
        TextView color=findViewById(R.id.textView2);
        color.setTextColor(Color.argb((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256)));

       /* int r = random.nextInt(256);
        int g = random.nextInt(256);
        int b = random.nextInt(256);
        textView.setTextColor(Color.rgb(r,g,b));*/
    }
}
