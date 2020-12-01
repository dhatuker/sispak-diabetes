package com.example.diabetes_sispak;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.chaquo.python.PyObject;
import com.chaquo.python.Python;
import com.chaquo.python.android.AndroidPlatform;

public class MainQuestion extends AppCompatActivity implements View.OnClickListener {

    private Button button;
    int kelamin, kencing, haus, bbturun, lelah, lapar, jamur, buram, gatal, iritasi, luka, matiRasa, kaku, obesitas;

    private RadioGroup radioKelaminGroup, radioKencingGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_main);

        button = findViewById(R.id.buttonPrediksi);
        radioKelaminGroup = findViewById(R.id.radioKelaminGroup);

        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.buttonPrediksi) {

            //kencing
            int idKencing = radioKencingGroup.getCheckedRadioButtonId();
            RadioButton selectedKencing = (RadioButton) findViewById(idKencing);
            String text = selectedKencing.getText().toString();

            int hasilKelamin = getKelaminRadioValue();
            int hasilKencing = getYesNoRadioValue(text);
            String coba = String.join(" ", Integer.toString(hasilKelamin), Integer.toString(hasilKencing));
            Toast.makeText(this, String.valueOf(coba), Toast.LENGTH_SHORT).show();
        }
    }

    private int getKelaminRadioValue() {
        int selectedKelamin = radioKelaminGroup.getCheckedRadioButtonId();
        RadioButton selected = (RadioButton) findViewById(selectedKelamin);
        String text = selected.getText().toString();
        int result = (text.equals("Laki - Laki")) ? 1 : 0;
        return result;
    }

    private int getYesNoRadioValue(String text) {
//        int selectedKelamin = radioKelaminGroup.getCheckedRadioButtonId();
//        RadioButton selected = (RadioButton) findViewById(selectedKelamin);
        int result = (text.equals("Ya")) ? 1 : 0;
        return result;
    }
//        button = (Button)findViewById(R.id.buttonPrediksi);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                openPrediksi();
//            }
//        });
//    }
//    public void openPrediksi(){
//
//        Intent intent = new Intent(this, MainAnswer.class);
//        startActivity(intent);
//    }
}
