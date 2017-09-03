package com.therock.geometry;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private double Perimetro=0,Area=0, number=0,Volumen;
    private EditText eLado,eRadio,eBase,eAlto;
    private RadioButton rCuadro,rCirculo,rTriangulo,rCubo;
    private TextView tInformacion;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rCuadro = (RadioButton) findViewById(R.id.rCuadro);
        rCirculo = (RadioButton) findViewById(R.id.rCirculo);
        rTriangulo = (RadioButton) findViewById(R.id.rTriangulo);
        rCubo = (RadioButton) findViewById(R.id.rCubo);
        tInformacion = (TextView) findViewById(R.id.tInformacion);
        eLado =  (EditText) findViewById(R.id.eLado);
        eRadio =  (EditText) findViewById(R.id.eRadio);
        eBase =  (EditText) findViewById(R.id.eBase);
        eAlto =  (EditText) findViewById(R.id.eAlto);
    }

    public void onClick(View view) {

        if (rCuadro.isChecked()) {
            number = Double.parseDouble(eLado.getText().toString());
            Area = number*number;
            Perimetro=4*number;
            tInformacion.setText(" Area: " +Area  + "\n Perimetro: " +Perimetro);}
        if (rCirculo.isChecked()) {
            number = Double.parseDouble(eRadio.getText().toString());
            Area = 3.1415926535*number*number;
            Perimetro=2*3.1415926535*number;
            tInformacion.setText(" Area: " +Area  + "\n Perimetro: " +Perimetro);}
        if (rTriangulo.isChecked()) {
            number = Double.parseDouble(eBase.getText().toString());
            Area = (0.43301270189)*number*number;
            Perimetro=3*number;
            tInformacion.setText(" Area: " +Area  + "\n Perimetro: " +Perimetro);}
        if (rCubo.isChecked()) {
            number = Double.parseDouble(eAlto.getText().toString());
            Area = 6*number*number;
            Volumen=number*number*number;
            tInformacion.setText(" Area: " +Area  + "\n Volumen: " +Volumen);}
        }
}
