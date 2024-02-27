package com.example.imccalculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textResultado;
    private EditText editPeso, editAltura;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textResultado = findViewById(R.id.textResultado);
        editPeso = findViewById(R.id.editPeso);
        editAltura = findViewById(R.id.editAltura);
    }

    public void calcular(View view) {
        double peso = Double.parseDouble(editPeso.getText().toString());
        double altura = Double.parseDouble(editAltura.getText().toString());
        double resultado = peso / (altura * altura);

        if (resultado < 16) {
            textResultado.setText("Magreza Grave: " + String.format("%.3f", resultado));
        } else if (resultado >= 16 && resultado <= 16.9) {
            textResultado.setText("Magreza Moderada: " + String.format("%.3f", resultado));
        } else if (resultado >= 17 && resultado <= 18.5) {
            textResultado.setText("Magreza Leve: " + String.format("%.3f", resultado));
        } else if (resultado >= 18.6 && resultado <= 24.9) {
            textResultado.setText("Peso Ideal: " + String.format("%.3f", resultado));
        } else if (resultado >= 25 && resultado <= 29.9) {
            textResultado.setText("Sobrepeso: " + String.format("%.3f", resultado));
        } else if (resultado >= 30 && resultado <= 34.9) {
            textResultado.setText("Obesidade Grau I: " + String.format("%.3f", resultado));
        } else if (resultado >= 35 && resultado <= 39.9) {
            textResultado.setText("Obesidade Grau II ou Severa: " + String.format("%.3f", resultado));
        } else if (resultado >= 40) {
            textResultado.setText("Obesidade Grau III ou Mórbida: " + String.format("%.3f", resultado));
        }
    }
}