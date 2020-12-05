package com.example.diabetes_sispak;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

public class MainQuestion extends AppCompatActivity implements View.OnClickListener {

    private Button button;

    private EditText editUsia;

    private RadioGroup radioKelaminGroup, radioKencingGroup, radioHausGroup, radioBeratGroup,
            radioLemasGroup, radioLaparGroup, radioJamurGroup, radioBuramGroup, radioGatalGroup,
            radioIritasiGroup, radioLukaGroup, radioRasaGroup, radioKakuGroup, radioRontokGroup,
            radioObesitasGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_main);

        button = findViewById(R.id.buttonPrediksi);

        editUsia = findViewById(R.id.editUsia);

        radioKelaminGroup = findViewById(R.id.radioKelaminGroup);
        radioKencingGroup = findViewById(R.id.radioKencingGroup);
        radioHausGroup = findViewById(R.id.radioHausGroup);
        radioBeratGroup = findViewById(R.id.radioBeratGroup);

        radioLemasGroup = findViewById(R.id.radioLemasGroup);
        radioLaparGroup = findViewById(R.id.radioLaparGroup);
        radioJamurGroup = findViewById(R.id.radioJamurGroup);
        radioBuramGroup = findViewById(R.id.radioBuramGroup);
        radioGatalGroup = findViewById(R.id.radioGatalGroup);

        radioIritasiGroup = findViewById(R.id.radioIritasiGroup);
        radioLukaGroup = findViewById(R.id.radioLukaGroup);
        radioRasaGroup = findViewById(R.id.radioRasaGroup);
        radioKakuGroup = findViewById(R.id.radioKakuGroup);
        radioRontokGroup = findViewById(R.id.radioRontokGroup);

        radioObesitasGroup = findViewById(R.id.radioObesitasGroup);


        button.setOnClickListener(this);
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.buttonPrediksi) {

            int hasilUsia = getUsiaTextValue();

            int hasilKelamin = getKelaminRadioValue();
            int hasilKencing = getKencingRadioValue();
            int hasilHaus = getHausRadioValue();
            int hasilBerat = getBeratRadioValue();

            int hasilLemas = getLemasRadioValue();
            int hasilLapar = getLaparRadioValue();
            int hasilJamur = getJamurRadioValue();
            int hasilBuram = getBuramRadioValue();
            int hasilGatal = getGatalRadioValue();

            int hasilIritasi = getIritasiRadioValue();
            int hasilLuka = getLukaRadioValue();
            int hasilRasa = getRasaRadioValue();
            int hasilKaku = getKakuRadioValue();
            int hasilRontok = getRontokRadioValue();

            int hasilObesitas = getObesitasRadioValue();

            int[] dataTesting = {hasilUsia, hasilKelamin, hasilKencing, hasilHaus, hasilBerat, hasilLemas,
                    hasilLapar, hasilJamur, hasilBuram, hasilGatal, hasilIritasi, hasilLuka, hasilRasa,
                    hasilKaku, hasilRontok, hasilObesitas};

            Intent intent = new Intent(this, MainAnswer.class);
            intent.putExtra("dataTesting", dataTesting);
            startActivity(intent);

//            String coba = String.join(" ", Integer.toString(hasilUsia),
//                    Integer.toString(hasilKelamin), Integer.toString(hasilKencing), Integer.toString(hasilHaus),
//                    Integer.toString(hasilBerat),Integer.toString(hasilLemas),
//                    Integer.toString(hasilLapar),Integer.toString(hasilJamur),Integer.toString(hasilBuram),
//                    Integer.toString(hasilGatal),Integer.toString(hasilIritasi),Integer.toString(hasilLuka),
//                    Integer.toString(hasilRasa),Integer.toString(hasilKaku),Integer.toString(hasilRontok),
//                    Integer.toString(hasilObesitas));
//            Toast.makeText(this, String.valueOf(dataTesting), Toast.LENGTH_SHORT).show();
        }
    }

    private int getKelaminRadioValue() {
        int selectedKelamin = radioKelaminGroup.getCheckedRadioButtonId();
        RadioButton selected = (RadioButton) findViewById(selectedKelamin);
        String text = selected.getText().toString();
        int result = (text.equals("Laki - Laki")) ? 1 : 0;
        return result;
    }

    private int getKencingRadioValue() {
        int idKencing = radioKencingGroup.getCheckedRadioButtonId();
        RadioButton selected = (RadioButton) findViewById(idKencing);
        String text = selected.getText().toString();
        int result = (text.equals("Ya")) ? 1 : 0;
        return result;
    }

    private int getHausRadioValue() {
        int idHaus = radioHausGroup.getCheckedRadioButtonId();
        RadioButton selected = (RadioButton) findViewById(idHaus);
        String text = selected.getText().toString();
        int result = (text.equals("Ya")) ? 1 : 0;
        return result;
    }

    private int getBeratRadioValue() {
        int idBerat = radioBeratGroup.getCheckedRadioButtonId();
        RadioButton selected = (RadioButton) findViewById(idBerat);
        String text = selected.getText().toString();
        int result = (text.equals("Ya")) ? 1 : 0;
        return result;
    }

    private int getLemasRadioValue() {
        int idLemas = radioLemasGroup.getCheckedRadioButtonId();
        RadioButton selected = (RadioButton) findViewById(idLemas);
        String text = selected.getText().toString();
        int result = (text.equals("Ya")) ? 1 : 0;
        return result;
    }

    private int getLaparRadioValue() {
        int idLapar = radioLaparGroup.getCheckedRadioButtonId();
        RadioButton selected = (RadioButton) findViewById(idLapar);
        String text = selected.getText().toString();
        int result = (text.equals("Ya")) ? 1 : 0;
        return result;
    }

    private int getJamurRadioValue() {
        int idJamur = radioJamurGroup.getCheckedRadioButtonId();
        RadioButton selected = (RadioButton) findViewById(idJamur);
        String text = selected.getText().toString();
        int result = (text.equals("Ya")) ? 1 : 0;
        return result;
    }

    private int getBuramRadioValue() {
        int idBuram = radioBuramGroup.getCheckedRadioButtonId();
        RadioButton selected = (RadioButton) findViewById(idBuram);
        String text = selected.getText().toString();
        int result = (text.equals("Ya")) ? 1 : 0;
        return result;
    }

    private int getGatalRadioValue() {
        int idGatal = radioGatalGroup.getCheckedRadioButtonId();
        RadioButton selected = (RadioButton) findViewById(idGatal);
        String text = selected.getText().toString();
        int result = (text.equals("Ya")) ? 1 : 0;
        return result;
    }

    private int getIritasiRadioValue() {
        int idIritasi = radioIritasiGroup.getCheckedRadioButtonId();
        RadioButton selected = (RadioButton) findViewById(idIritasi);
        String text = selected.getText().toString();
        int result = (text.equals("Ya")) ? 1 : 0;
        return result;
    }

    private int getLukaRadioValue() {
        int idLuka = radioLukaGroup.getCheckedRadioButtonId();
        RadioButton selected = (RadioButton) findViewById(idLuka);
        String text = selected.getText().toString();
        int result = (text.equals("Ya")) ? 1 : 0;
        return result;
    }

    private int getRasaRadioValue() {
        int idRasa = radioRasaGroup.getCheckedRadioButtonId();
        RadioButton selected = (RadioButton) findViewById(idRasa);
        String text = selected.getText().toString();
        int result = (text.equals("Ya")) ? 1 : 0;
        return result;
    }

    private int getRontokRadioValue() {
        int idRontok = radioRontokGroup.getCheckedRadioButtonId();
        RadioButton selected = (RadioButton) findViewById(idRontok);
        String text = selected.getText().toString();
        int result = (text.equals("Ya")) ? 1 : 0;
        return result;
    }

    private int getKakuRadioValue() {
        int idKaku = radioKakuGroup.getCheckedRadioButtonId();
        RadioButton selected = (RadioButton) findViewById(idKaku);
        String text = selected.getText().toString();
        int result = (text.equals("Ya")) ? 1 : 0;
        return result;
    }

    private int getObesitasRadioValue() {
        int idObesitas = radioObesitasGroup.getCheckedRadioButtonId();
        RadioButton selected = (RadioButton) findViewById(idObesitas);
        String text = selected.getText().toString();
        int result = (text.equals("Ya")) ? 1 : 0;
        return result;
    }

    private int getUsiaTextValue() {
        String text = editUsia.getText().toString();
        int result = Integer.parseInt(text);
        return result;
    }
}
