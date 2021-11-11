package org.iesfm.formulariotodoselementos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    protected static final String[] contactos = {"Selecciona", "Móvil", "Email"};
    protected static final String[] deportes = {"Selecciona", "Futbol", "Baloncesto"};

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
        crearSpinerContactos();
    }

    public void iniciarVariables() {

        etNombre = (EditText) findViewById(R.id.etNombre);
        etApellidos = (EditText) findViewById(R.id.etApellido);
        etMovil = (EditText) findViewById(R.id.etPhone);
        etEmail = (EditText) findViewById(R.id.etEmail);

        contenedor = (RadioGroup) findViewById(R.id.contenedor);
        posicion1 = (RadioButton) findViewById(R.id.posicion1);
        posicion2 = (RadioButton) findViewById(R.id.posicion2);
        posicion3 = (RadioButton) findViewById(R.id.posicion3);
        posicion4 = (RadioButton) findViewById(R.id.posicion4);

    }

    public void crearSpinerContactos(){

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item,contactos);
        sContactos = (Spinner) findViewById(R.id.sContacto);

        sContactos.setAdapter(adapter);
    }



}