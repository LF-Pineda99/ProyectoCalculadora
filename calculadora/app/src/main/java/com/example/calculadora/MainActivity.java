package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private TextView resultado,resultado2,signoOperacion;
    private Button bt;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultado = findViewById(R.id.txtResultado);
        resultado2 = findViewById(R.id.txtResultado2);
        signoOperacion = findViewById(R.id.txtSignoOp);
        bt = findViewById(R.id.btDos);
    }


    public void escribeUno(View view){
        resultado.setText(resultado.getText() + "1");
    }
    public void escribeDos(View view){
        resultado.setText(resultado.getText()  + "2");
    }
    public void escribeTres(View view){
        resultado.setText(resultado.getText() + "3");
    }
    public void escribeCuatro(View view){
        resultado.setText(resultado.getText()  + "4");
    }
    public void escribeCinco(View view){
        resultado.setText(resultado.getText()  + "5");
    }
    public void escribeSeis(View view){
        resultado.setText(resultado.getText() + "6");
    }

    public void escribeSiete(View view){
        resultado.setText(resultado.getText() + "7");
    }
    public void escribeOcho(View view){
        resultado.setText(resultado.getText() + "8");
    }
    public void escribeNueve(View view){
        resultado.setText(resultado.getText() + "9");
    }
    public void escribePunto(View view){
        resultado.setText(resultado.getText() + ".");
    }
    public void escribeCero(View view){
        resultado.setText(resultado.getText() + "0");
    }

    public void suma(View view){
        signoOperacion.setText("+");
        resultado2.setText(resultado.getText().toString());
        resultado.setText("");
    }

    public void menos(View view){
        signoOperacion.setText("-");
        resultado2.setText(resultado.getText().toString());
        resultado.setText("");
    }

    public void multiplicacion(View view){
        signoOperacion.setText("x");
        resultado2.setText(resultado.getText().toString());
        resultado.setText("");
    }

    public void division(View view){
        signoOperacion.setText("÷");
        resultado2.setText(resultado.getText().toString());
        resultado.setText("");
    }

    public void borrador(View view){
        signoOperacion.setText("");
        resultado2.setText("");
        resultado.setText("");
    }

    public void cambiarSigno(View view){
        if (resultado.getText().toString().contains("-")){
            String nuevoResultado = resultado.getText().toString().substring(1);
            resultado.setText(nuevoResultado);
        }else{
            resultado.setText("-" + resultado.getText().toString());
        }
    }

    public void igual(View view) {

        Double valor1, valor2, total;
        String tipoSigno = signoOperacion.getText().toString();
        switch (tipoSigno){

            case "+":
                valor1 = Double.parseDouble(resultado2.getText().toString());
                valor2 = Double.parseDouble(resultado.getText().toString());
                total = valor1 + valor2;
                resultado.setText(total.toString());
                break;
            case  "-":
                valor1 = Double.parseDouble(resultado2.getText().toString());
                valor2 = Double.parseDouble(resultado.getText().toString());
                total = valor1 - valor2;
                resultado.setText(total.toString());
                break;
            case "x":
                valor1 = Double.parseDouble(resultado2.getText().toString());
                valor2 = Double.parseDouble(resultado.getText().toString());
                total = valor1 * valor2;
                resultado.setText(total.toString());
                break;
            case "÷":
                valor1 = Double.parseDouble(resultado2.getText().toString());
                valor2 = Double.parseDouble(resultado.getText().toString());
                total = valor1 / valor2;
                resultado.setText(total.toString());
                break;
            default:
                break;
        }

        resultado2.setText("");
        signoOperacion.setText("");

    }
}