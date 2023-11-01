package com.example.calculator.View;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.calculator.Model.Calculadora;

import com.example.calculator.R;

public class MainActivity extends AppCompatActivity {

    Calculadora visor;

    EditText idCalcView;

    Button idN1;
    Button idN2;
    Button idN3;
    Button idN4;
    Button idN5;
    Button idN6;
    Button idN7;
    Button idN8;
    Button idN9;
    Button idN0;

    Button idAllClear;
    Button idClear;
    Button idParse;
    Button idDiv;
    Button idMult;
    Button idPlus;
    Button idMinus;
    Button idEqual;
    Button idBack;
    Button idPoint;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    idN1 = findViewById(R.id.idN1);
    idN2 = findViewById(R.id.idN2);
    idN3 = findViewById(R.id.idN3);
    idN4 = findViewById(R.id.idN4);
    idN5 = findViewById(R.id.idN5);
    idN6 = findViewById(R.id.idN6);
    idN7 = findViewById(R.id.idN7);
    idN8 = findViewById(R.id.idN8);
    idN9 = findViewById(R.id.idN9);
    idN0 = findViewById(R.id.idN0);

    idAllClear = findViewById(R.id.idAllClear);
    idClear = findViewById(R.id.idClear);
    idParse = findViewById(R.id.idParse);
    idDiv = findViewById(R.id.idDiv);
    idMult = findViewById(R.id.idMult);
    idPlus = findViewById(R.id.idPlus);
    idMinus = findViewById(R.id.idMinus);
    idEqual = findViewById(R.id.idEqual);
    idBack = findViewById(R.id.idBack);
    idPoint = findViewById(R.id.idPoint);

    idCalcView = findViewById(R.id.idCalcView);

    visor = new Calculadora();

    visor.setVisor("0");

    idCalcView.setText(visor.getVisor());

    idAllClear.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            idCalcView.setText("");
        }
    });

    idClear.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            idCalcView.setText("");
        }
    });

    idN1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            idCalcView.setText(idCalcView.getText().append("1"));
        }
    });

    idN2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            idCalcView.setText(idCalcView.getText().append("2"));
        }
    });

    idN3.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            idCalcView.setText(idCalcView.getText().append("3"));
        }
    });

    idN4.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            idCalcView.setText(idCalcView.getText().append("4"));
        }
    });

    idN5.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            idCalcView.setText(idCalcView.getText().append("5"));
        }
    });

    idN6.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            idCalcView.setText(idCalcView.getText().append("6"));
        }
    });

    idN7.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            idCalcView.setText(idCalcView.getText().append("7"));
        }
    });

    idN8.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            idCalcView.setText(idCalcView.getText().append("8"));
        }
    });

    idN9.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            idCalcView.setText(idCalcView.getText().append("9"));
        }
    });

    idN0.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            idCalcView.setText(idCalcView.getText().append("0"));
        }
    });

    }
}