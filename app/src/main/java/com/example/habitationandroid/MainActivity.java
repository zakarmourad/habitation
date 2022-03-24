package com.example.habitationandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText nom;
    private EditText surface;
    private EditText adresse;
    private EditText piece;
    private CheckBox piscine;
    private Button calc;
    private TextView base;
    private TextView totale;
    private TextView supplementaire;
    private int bas=0;
    private int sup=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        nom=findViewById(R.id.nom);
        surface=findViewById(R.id.surface);
        adresse=findViewById(R.id.addresse);
        piece=findViewById(R.id.piece);
        piscine = findViewById(R.id.piscine);
        calc = findViewById(R.id.button);
        base= findViewById(R.id.base);
        totale=findViewById(R.id.totale);
        supplementaire =findViewById(R.id.supplementaire);
        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bas=Integer.parseInt(surface.getText().toString())*2;
        base.setText("Impot de base :"+bas);
        if(piscine.isChecked()){
            sup=((Integer.parseInt(piece.getText().toString())*50+100));
            supplementaire.setText("Impot supplementaire :"+sup);
            totale.setText("Impot total :" +(sup+bas));
        }
        else{
            sup=((Integer.parseInt(piece.getText().toString())*50));
            supplementaire.setText("Impot supplementaire :"+sup);
            totale.setText("Impot total :" +(sup+bas));
        }

            }
        });


    }
}