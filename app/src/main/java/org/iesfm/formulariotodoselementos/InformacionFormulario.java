package org.iesfm.formulariotodoselementos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class InformacionFormulario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacion_formulario);
        getInfo();
    }

    public void getInfo() {
        Intent main = getIntent();
        String datos = main.getStringExtra(MainActivity.INFORMACION_FORMULARIO);

        TextView infoRecibida = (TextView) findViewById(R.id.tvdatosRecibidos);
        infoRecibida.setText(datos);
    }

    public void volver(View v){
        Intent main = new Intent(this, MainActivity.class);
        startActivity(main);
    }
}