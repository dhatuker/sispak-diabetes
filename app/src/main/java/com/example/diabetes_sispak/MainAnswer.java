package com.example.diabetes_sispak;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.chaquo.python.PyObject;
import com.chaquo.python.Python;
import com.chaquo.python.android.AndroidPlatform;

public class MainAnswer extends AppCompatActivity {

    private Button button;
    private TextView teksHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.answer_main);

        button = (Button)findViewById(R.id.buttonGejala);
        teksHasil = (TextView)findViewById(R.id.teksHasil);

        Bundle extras = getIntent().getExtras();

        int[] dataTesting = extras.getIntArray("dataTesting");

        if(!Python.isStarted())
            Python.start(new AndroidPlatform(this));

        Python py = Python.getInstance();
        final PyObject pyobj = py.getModule("randomForest");

        PyObject obj = pyobj.callAttr("random_forest", dataTesting);

        teksHasil.setText(obj.toString());

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGejala();
            }
        });
    }

    public void openGejala(){
        Intent intent = new Intent(this, MainExplanation.class);
        startActivity(intent);
    }
}