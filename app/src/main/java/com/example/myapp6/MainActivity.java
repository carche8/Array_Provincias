package com.example.myapp6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv1, tv2;
    private Spinner sp1, sp2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = (TextView) findViewById(R.id.tv_resultado1);
        tv2 = (TextView) findViewById(R.id.tv_resultado2);
        sp1 = (Spinner) findViewById(R.id.spinner1);
        sp2 = (Spinner) findViewById(R.id.spinner2);

        String[] opciones1 = {"Albacete", "Ciudad Real", "Cuenca", "Guadalajara", "Toledo"};
        ArrayAdapter< String > adapter1 = new ArrayAdapter<String>(this, R.layout.spinner_provincias, opciones1);
        sp1.setAdapter(adapter1);

        String[] opciones2 = {"Talavera de la Reina", "Cebolla", "Alberche", "Cazalegas", "Velada"};
        ArrayAdapter< String > adapter2 = new ArrayAdapter<String>(this, R.layout.spinner_localidades, opciones2);
        sp1.setAdapter(adapter2);

    }

    public void Provincias (View view) {

        String resultado1 = sp1.getSelectedItem().toString();
        tv1.setText(resultado1);
        String resultado2 = sp2.getSelectedItem().toString();
        tv2.setText(resultado2);






        }
    }

