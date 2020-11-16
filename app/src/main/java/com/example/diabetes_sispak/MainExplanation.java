package com.example.diabetes_sispak;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainExplanation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.explanation_main);
        TextView tv = (TextView) findViewById(R.id.tv_long);
        tv.setMovementMethod(new ScrollingMovementMethod());
    }


}
