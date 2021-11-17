package org.iesfm.formulariotodoselementos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    protected static final String[] contactos = {"Selecciona", "Móvil", "Email"};
    protected static final String[] deportes = {"Selecciona", "Futbol", "Baloncesto"};

    private TextView tvMovil;
    private TextView tvEmail;

    private EditText etNombre;
    private EditText etApellidos;
    private EditText etMovil;
    private EditText etEmail;

    private RadioGroup contenedor;
    private RadioButton posicion1;
    private RadioButton posicion2;
    private RadioButton posicion3;
    private RadioButton posicion4;

    private Spinner sDeportes;
    private Spinner sContactos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iniciarVariables();
        crearSpinnerContactos();
        crearSpinnerDeportes();


    }

    public void iniciarVariables() {

        etNombre = (EditText) findViewById(R.id.etNombre);
        etApellidos = (EditText) findViewById(R.id.etApellido);
        etMovil = (EditText) findViewById(R.id.etPhone);
        etEmail = (EditText) findViewById(R.id.etEmail);
        tvEmail = (TextView) findViewById(R.id.tvEmail);
        tvMovil = (TextView) findViewById(R.id.tvMovil);

        etEmail.setVisibility(View.GONE);
        etMovil.setVisibility(View.GONE);
        tvMovil.setVisibility(View.GONE);
        tvEmail.setVisibility(View.GONE);

        contenedor = (RadioGroup) findViewById(R.id.contenedor);
        posicion1 = (RadioButton) findViewById(R.id.posicion1);
        posicion2 = (RadioButton) findViewById(R.id.posicion2);
        posicion3 = (RadioButton) findViewById(R.id.posicion3);
        posicion4 = (RadioButton) findViewById(R.id.posicion4);

    }

    public void crearSpinnerContactos() {

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, contactos);
        sContactos = (Spinner) findViewById(R.id.sContacto);
        sContactos.setAdapter(adapter);

        switch (sContactos.getSelectedItemPosition()){
            case 1:
                etMovil.setVisibility(View.VISIBLE);
                tvMovil.setVisibility(View.VISIBLE);
                break;
            case 2:
                etEmail.setVisibility(View.VISIBLE);
                tvEmail.setVisibility(View.VISIBLE);
                break;
        }

    }


    public void crearSpinnerDeportes() {
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, deportes);
        sDeportes = (Spinner) findViewById(R.id.sDeporte);
        sDeportes.setAdapter(adapter);

        int seleccion = sDeportes.getSelectedItemPosition();

        switch (sDeportes.getSelectedItem().toString()){
            case "Futbol":
                posicion1.setText("Portero");
                posicion2.setText("defensa");
                posicion3.setText("lateral");
                posicion4.setText("Extremo");
                break;
            case "Baloncesto":
                posicion1.setText("Pivot");
                posicion2.setText("Base");
                posicion3.setText("Entrenador");
                posicion4.setText("Utillero");
        }

        if (seleccion == 1){
            posicion1.setText("Portero");
            posicion2.setText("defensa");
            posicion3.setText("lateral");
            posicion4.setText("Extremo");


        }

    }


}