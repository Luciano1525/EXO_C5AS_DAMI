package com.example.exo_c5as;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Pantalones extends AppCompatActivity {
    private TextView tvUsuarioName3;
    private TextView tvContraseñaName3;
    private TextView tvNombreP1;
    private TextView tvNombreP2;
    private TextView tvNombreP3;
    private TextView tvPrecioP1;
    private TextView tvPrecioP2;
    private TextView tvPrecioP3;
    private TextView tvCantidadP1;
    private TextView tvCantidadP2;
    private TextView tvCantidadP3;
    private TextView tvPrecioP;
    private Button btnSumarP1;
    private Button btnSumarP2;
    private Button btnSumarP3;
    private Button btnRestarP1;
    private Button btnRestarP2;
    private Button btnRestarP3;
    private Button btnComprarPN;
    private Button btnPantalonOSJH;
    private Button btnPantalonPAU;
    private Button btnPantalonPMM;
    private EditText etP;
    private EditText etPTP;
    private EditText etP1;
    private EditText etPTP1;
    private EditText etP2;
    private EditText etPTP2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalones);
        //Convertir Items en Variables
        tvNombreP1 = (TextView)findViewById(R.id.tvNombreP1);
        tvNombreP2 = (TextView)findViewById(R.id.tvNombreP2);
        tvNombreP3 = (TextView)findViewById(R.id.tvNombreP3);

        tvUsuarioName3 = (TextView)findViewById(R.id.tvUsuarioName3);
        tvContraseñaName3 = (TextView)findViewById(R.id.tvContraseñaName3);
        GettvUsuarioName113();
        GettvContraseñaName113();

        tvPrecioP1 = (TextView)findViewById(R.id.tvPrecioP1);
        tvPrecioP2 = (TextView)findViewById(R.id.tvPrecioP2);
        tvPrecioP3 = (TextView)findViewById(R.id.tvPrecioP3);
        etP = (EditText)findViewById(R.id.etP);
        etPTP = (EditText)findViewById(R.id.etPTP);
        etP1 = (EditText)findViewById(R.id.etP1);
        etPTP1 = (EditText)findViewById(R.id.etPTP1);
        etP2 = (EditText)findViewById(R.id.etP2);
        etPTP2 = (EditText)findViewById(R.id.etPTP2);
        tvCantidadP1 = (TextView)findViewById(R.id.tvCantidadP1);
        tvCantidadP2 = (TextView)findViewById(R.id.tvCantidadP2);
        tvCantidadP3 = (TextView)findViewById(R.id.tvCantidadP3);
        tvPrecioP = (TextView)findViewById(R.id.tvPrecioP);

        //Funciones de los Botones

        // Botones de Descrip de Producto

        btnPantalonOSJH = (Button) findViewById(R.id.btnPantalonOSJH);
        btnPantalonOSJH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("INFO:", "Descripcion");
                Intent intent = new Intent(Pantalones.this, Pantalon1.class);
                startActivity(intent);
            }
        });

        btnPantalonPAU = (Button) findViewById(R.id.btnPantalonPAU);
        btnPantalonPAU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("INFO:", "Descripcion");
                Intent intent = new Intent(Pantalones.this, Pantalon2.class);
                startActivity(intent);
            }
        });

        btnPantalonPMM = (Button) findViewById(R.id.btnPantalonPMM);
        btnPantalonPMM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("INFO:", "Descripcion");
                Intent intent = new Intent(Pantalones.this, Pantalon3.class);
                startActivity(intent);
            }
        });

        //Aumentar Productos y Sumar Precios

        btnSumarP1 = (Button) findViewById(R.id.btnSumarP1);
        btnSumarP1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                aumentarP1();
                sumarP1();
            }
        });

        btnSumarP2 = (Button) findViewById(R.id.btnSumarP2);
        btnSumarP2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                aumentarP2();
                sumarP2();
            }
        });

        btnSumarP3 = (Button) findViewById(R.id.btnSumarP3);
        btnSumarP3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                aumentarP3();
                sumarP3();
            }
        });

        //Disminuir Productos y Restar Precios
        btnRestarP1 = (Button) findViewById(R.id.btnRestarP1);
        btnRestarP1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                disminuirP1();
                restarP1();
            }
        });

        btnRestarP2 = (Button) findViewById(R.id.btnRestarP2);
        btnRestarP2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                disminuirP2();
                restarP2();
            }
        });

        btnRestarP3 = (Button) findViewById(R.id.btnRestarP3);
        btnRestarP3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                disminuirP3();
                restarP3();
            }
        });

        //Comprar
        btnComprarPN = (Button) findViewById(R.id.btnComprarPN);
        btnComprarPN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Compra Realizada",Toast.LENGTH_SHORT).show();
                Log.i("INFO:","Compra Exitosa");
                String NP1 = tvNombreP1.getText().toString();
                String CP1 = tvCantidadP1.getText().toString();
                String NP2 = tvNombreP2.getText().toString();
                String CP2 = tvCantidadP2.getText().toString();
                String NP3 = tvNombreP3.getText().toString();
                String CP3 = tvCantidadP3.getText().toString();
                String PP1 = tvPrecioP.getText().toString();
                String usuar14 = tvUsuarioName3.getText().toString();
                String contra14 = tvContraseñaName3.getText().toString();
                Intent intent = new Intent(Pantalones.this,Compra.class);
                intent.putExtra("informacion5",NP1);
                intent.putExtra("informacion6",CP1);
                intent.putExtra("informacion7",NP2);
                intent.putExtra("informacion8",CP2);
                intent.putExtra("informacion9",NP3);
                intent.putExtra("informacion10",CP3);
                intent.putExtra("informacion11",PP1);
                intent.putExtra("informacion113",usuar14);
                intent.putExtra("informacion114",contra14);
                startActivity(intent);
            }
        });

    }
    //Metodos Aumentar Productos
    public void aumentarP1() {
        String CantidadPN1 = etP.getText().toString();
        int CP1 = Integer.parseInt(CantidadPN1);
        CP1 = CP1 +1;
        String R1 = String.valueOf(CP1);
        tvCantidadP1.setText(R1);
        etP.setText(R1);
    }
    public void aumentarP2() {
        String CantidadPN2 = etP1.getText().toString();
        int CP2 = Integer.parseInt(CantidadPN2);
        CP2 = CP2 +1;
        String R2 = String.valueOf(CP2);
        tvCantidadP2.setText(R2);
        etP1.setText(R2);
    }
    public void aumentarP3() {
        String CantidadPN3 = etP2.getText().toString();
        int CP3 = Integer.parseInt(CantidadPN3);
        CP3 = CP3 +1;
        String R3 = String.valueOf(CP3);
        tvCantidadP3.setText(R3);
        etP2.setText(R3);
    }

    //Metodos Sumar Precios de Productos
    public void sumarP1() {
        String PrecioTP1 = etPTP.getText().toString();
        String PrecioP1 = tvPrecioP1.getText().toString();
        double PP1 = Double.parseDouble(PrecioTP1);
        double PPE1 = Double.parseDouble(PrecioP1);
        PP1 = PP1 + PPE1;
        String tvPP2 = tvPrecioP.getText().toString();
        double PPN2 = Double.parseDouble(tvPP2);
        double STP1 = PP1 +PPN2;
        String R1 = String.valueOf(STP1);
        tvPrecioP.setText(R1);
    }
    public void sumarP2() {
        String PrecioTP2 = etPTP1.getText().toString();
        String PrecioP2 = tvPrecioP2.getText().toString();
        double PP2 = Double.parseDouble(PrecioTP2);
        double PPE2 = Double.parseDouble(PrecioP2);
        PP2 = PP2 + PPE2;
        String tvPP2 = tvPrecioP.getText().toString();
        double PPN2 = Double.parseDouble(tvPP2);
        double STP1 = PP2 +PPN2;
        String R1 = String.valueOf(STP1);
        tvPrecioP.setText(R1);
    }
    public void sumarP3() {
        String PrecioTP3 = etPTP2.getText().toString();
        String PrecioP3 = tvPrecioP3.getText().toString();
        double PP3 = Double.parseDouble(PrecioTP3);
        double PPE3 = Double.parseDouble(PrecioP3);
        PP3 = PP3 + PPE3;
        String tvPP2 = tvPrecioP.getText().toString();
        double PPN2 = Double.parseDouble(tvPP2);
        double STP1 = PP3 +PPN2;
        String R1 = String.valueOf(STP1);
        tvPrecioP.setText(R1);
    }

    //Metodos Disminuir Productos
    public void disminuirP1() {
        String CantidadPN1 = etP.getText().toString();
        int CP1 = Integer.parseInt(CantidadPN1);
        CP1 = CP1 -1;
        String R1 = String.valueOf(CP1);
        tvCantidadP1.setText(R1);
        etP.setText(R1);
    }
    public void disminuirP2() {
        String CantidadPN2 = etP1.getText().toString();
        int CP2 = Integer.parseInt(CantidadPN2);
        CP2 = CP2 -1;
        String R2 = String.valueOf(CP2);
        tvCantidadP2.setText(R2);
        etP1.setText(R2);
    }
    public void disminuirP3() {
        String CantidadPN3 = etP2.getText().toString();
        int CP3 = Integer.parseInt(CantidadPN3);
        CP3 = CP3 -1;
        String R3 = String.valueOf(CP3);
        tvCantidadP3.setText(R3);
        etP2.setText(R3);
    }

    //Metodos Restar Precios de Productos
    public void restarP1() {
        String PrecioPA1 = tvPrecioP1.getText().toString();
        String tvPPA2 = tvPrecioP.getText().toString();
        double P1 = Double.parseDouble(tvPPA2);
        double PPA1 = Double.parseDouble(PrecioPA1);
        P1 = P1 - PPA1;
        String R1 = String.valueOf(P1);
        tvPrecioP.setText(R1);
    }
    public void restarP2() {
        String PrecioPA1 = tvPrecioP2.getText().toString();
        String tvPPA2 = tvPrecioP.getText().toString();
        double P1 = Double.parseDouble(tvPPA2);
        double PPA1 = Double.parseDouble(PrecioPA1);
        P1 = P1 - PPA1;
        String R1 = String.valueOf(P1);
        tvPrecioP.setText(R1);
    }
    public void restarP3() {
        String PrecioPA1 = tvPrecioP3.getText().toString();
        String tvPPA2 = tvPrecioP.getText().toString();
        double P1 = Double.parseDouble(tvPPA2);
        double PPA1 = Double.parseDouble(PrecioPA1);
        P1 = P1 - PPA1;
        String R1 = String.valueOf(P1);
        tvPrecioP.setText(R1);
    }

    private void GettvUsuarioName113() {
        Bundle extras = getIntent().getExtras();
        tvUsuarioName3.setText(extras.get("informacion111").toString());
    }
    private void GettvContraseñaName113() {
        Bundle extras = getIntent().getExtras();
        tvContraseñaName3.setText(extras.get("informacion112").toString());
    }
}