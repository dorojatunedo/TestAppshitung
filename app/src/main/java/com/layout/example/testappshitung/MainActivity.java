package com.layout.example.testappshitung;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

     TextView Sisi;
     EditText editpanjang;
     Button hitung;
     TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Sisi=(TextView)findViewById(R.id.txtsisi);
        editpanjang=(EditText)findViewById(R.id.edit_panjang);
        hitung=(Button)findViewById(R.id.hitung_btn);
        hasil=(TextView)findViewById(R.id.hasil_txt);

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String panjangsisi = editpanjang.getText().toString().trim();

                if(TextUtils.isEmpty(editpanjang.getText())){

                        Toast.makeText(MainActivity.this, "Masukan Angka!", Toast.LENGTH_SHORT).show();


                }
                 else {
                    try {
                    double s = Double.parseDouble(panjangsisi);
                    double volume = s * s * s;

                    hasil.setText("hasil : " + volume);
                    }
                        catch (NumberFormatException e){
                            Toast.makeText(MainActivity.this, "Format Salah", Toast.LENGTH_SHORT).show();
                        }
                }
            }
        });

    }
}