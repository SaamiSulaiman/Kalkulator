package com.app.saamisulaiman.kalkulator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText nilai1 , nilai2;
    TextView hasil;
    Button tambah , kurang , kali , bagi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        nilai1 = findViewById(R.id.nilai1);
        nilai2 = findViewById(R.id.nilai2);
        hasil = findViewById(R.id.hasil);
        tambah = findViewById(R.id.tambah);
        kurang = findViewById(R.id.kurang);
        kali = findViewById(R.id.kali);
        bagi = findViewById(R.id.bagi);

        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (nilai1.getText().toString().isEmpty()|| nilai2.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Isi dulu goblok!", Toast.LENGTH_SHORT).show();
                }else{
                    tambah();
                }

            }
        });

        kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (nilai1.getText().toString().isEmpty()|| nilai2.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Isi dulu goblok!", Toast.LENGTH_SHORT).show();
                }else{
                    kurang();
                }
            }
        });

        kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (nilai1.getText().toString().isEmpty()|| nilai2.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Isi dulu goblok!", Toast.LENGTH_SHORT).show();
                }else{
                    kali();
                }

            }
        });

        bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (nilai1.getText().toString().isEmpty()|| nilai2.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Isi dulu goblok!", Toast.LENGTH_SHORT).show();
                }else{
                    bagi();
                }
                
            }
        });
        }

        //Yang dibawah namanya method

        void tambah(){
            int angka1 = Integer.parseInt(nilai1.getText().toString());
            int angka2 = Integer.parseInt(nilai2.getText().toString());

            int total = angka1 + angka2;
            hasil.setText(String.valueOf(total));
        }

        void kurang(){
            int angka1 = Integer.parseInt(nilai1.getText().toString());
            int angka2 = Integer.parseInt(nilai2.getText().toString());

            int total = angka1 - angka2;
            hasil.setText(String.valueOf(total));
        }

        void kali(){
            int angka1 = Integer.parseInt(nilai1.getText().toString());
            int angka2 = Integer.parseInt(nilai2.getText().toString());

            int total = angka1 * angka2;
            hasil.setText(String.valueOf(total));
        }

        void bagi(){
            int angka1 = Integer.parseInt(nilai1.getText().toString());
            int angka2 = Integer.parseInt(nilai2.getText().toString());

            int total = angka1 / angka2;
            hasil.setText(String.valueOf(total));
        }

        void hapus(){
            nilai1.setText("");
            nilai2.setText("");
        }

}
