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

public class Camisass extends AppCompatActivity {
    private TextView tvUsuarioName1;
    private TextView tvContraseñaName1;
    private TextView tvNombreC1;
    private TextView tvNombreC2;
    private TextView tvNombreC3;
    private TextView tvPrecioC1;
    private TextView tvPrecioC2;
    private TextView tvPrecioC3;
    private TextView tvCantidadC1;
    private TextView tvCantidadC2;
    private TextView tvCantidadC3;
    private TextView tvPrecioC;
    private Button btnSumarC1;
    private Button btnSumarC2;
    private Button btnSumarC3;
    private Button btnRestarC1;
    private Button btnRestarC2;
    private Button btnRestarC3;
    private Button btnComprarC;
    private Button btnCamisaCGML;
    private Button btnCamisaCMHSC;
    private Button btnCamisaCKC;
    private EditText etC;
    private EditText etPT;
    private EditText etC1;
    private EditText etPT1;
    private EditText etC2;
    private EditText etPT2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camisass);

        //Convertir Items en Variables
        tvNombreC1 = (TextView)findViewById(R.id.tvNombreC1);
        tvNombreC2 = (TextView)findViewById(R.id.tvNombreC2);
        tvNombreC3 = (TextView)findViewById(R.id.tvNombreC3);

        tvUsuarioName1 = (TextView)findViewById(R.id.tvUsuarioName1);
        tvContraseñaName1 = (TextView)findViewById(R.id.tvContraseñaName1);
        GettvUsuarioName111();
        GettvContraseñaName111();

        tvPrecioC1 = (TextView)findViewById(R.id.tvPrecioC1);
        tvPrecioC2 = (TextView)findViewById(R.id.tvPrecioC2);
        tvPrecioC3 = (TextView)findViewById(R.id.tvPrecioC3);
        etC = (EditText)findViewById(R.id.etC);
        etPT = (EditText)findViewById(R.id.etPT);
        etC1 = (EditText)findViewById(R.id.etC1);
        etPT1 = (EditText)findViewById(R.id.etPT1);
        etC2 = (EditText)findViewById(R.id.etC2);
        etPT2 = (EditText)findViewById(R.id.etPT2);
        tvCantidadC1 = (TextView)findViewById(R.id.tvCantidadC1);
        tvCantidadC2 = (TextView)findViewById(R.id.tvCantidadC2);
        tvCantidadC3 = (TextView)findViewById(R.id.tvCantidadC3);
        tvPrecioC = (TextView)findViewById(R.id.tvPrecioC);




        //Funciones de los Botones

        // Botones de Descrip de Producto

        btnCamisaCGML = (Button) findViewById(R.id.btnCamisaCGML);
        btnCamisaCGML.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("INFO:", "Descripcion");
                Intent intent = new Intent(Camisass.this, Camisa1.class);
                startActivity(intent);
            }
        });

        btnCamisaCMHSC = (Button) findViewById(R.id.btnCamisaCMHSC);
        btnCamisaCMHSC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("INFO:", "Descripcion");
                Intent intent = new Intent(Camisass.this, Camisa2.class);
                startActivity(intent);
            }
        });

        btnCamisaCKC = (Button) findViewById(R.id.btnCamisaCKC);
        btnCamisaCKC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("INFO:", "Descripcion");
                Intent intent = new Intent(Camisass.this, Camisa3.class);
                startActivity(intent);
            }
        });


        //Aumentar Productos y Sumar Precios

        btnSumarC1 = (Button) findViewById(R.id.btnSumarC1);
        btnSumarC1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                aumentarP1();
                sumarP1();
            }
        });



        btnSumarC2 = (Button) findViewById(R.id.btnSumarC2);
        btnSumarC2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                aumentarP2();
                sumarP2();
            }
        });



        btnSumarC3 = (Button) findViewById(R.id.btnSumarC3);
        btnSumarC3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                aumentarP3();
                sumarP3();
            }
        });


        //Disminuir Productos y Restar Precios
        btnRestarC1 = (Button) findViewById(R.id.btnRestarC1);
        btnRestarC1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                disminuirP1();
                restarP1();
            }
        });



        btnRestarC2 = (Button) findViewById(R.id.btnRestarC2);
        btnRestarC2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                disminuirP2();
                restarP2();
            }
        });




        btnRestarC3 = (Button) findViewById(R.id.btnRestarC3);
        btnRestarC3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                disminuirP3();
                restarP3();
            }
        });


        //Comprar

        btnComprarC = (Button) findViewById(R.id.btnComprarC);
        btnComprarC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Compra Realizada",Toast.LENGTH_SHORT).show();
                Log.i("INFO:","Compra Exitosa");
                String NC1 = tvNombreC1.getText().toString();
                String CC1 = tvCantidadC1.getText().toString();
                String NC2 = tvNombreC2.getText().toString();
                String CC2 = tvCantidadC2.getText().toString();
                String NC3 = tvNombreC3.getText().toString();
                String CC3 = tvCantidadC3.getText().toString();
                String PC1 = tvPrecioC.getText().toString();
                String usuar12 = tvUsuarioName1.getText().toString();
                String contra12 = tvContraseñaName1.getText().toString();
                Intent intent = new Intent(Camisass.this,Compra.class);
                intent.putExtra("informacion5",NC1);
                intent.putExtra("informacion6",CC1);
                intent.putExtra("informacion7",NC2);
                intent.putExtra("informacion8",CC2);
                intent.putExtra("informacion9",NC3);
                intent.putExtra("informacion10",CC3);
                intent.putExtra("informacion11",PC1);
                intent.putExtra("informacion113",usuar12);
                intent.putExtra("informacion114",contra12);
                startActivity(intent);
            }
        });

    }




    //Metodos Aumentar Productos
    public void aumentarP1() {
        String CantidadC1 = etC.getText().toString();
        int C1 = Integer.parseInt(CantidadC1);
        C1 = C1 +1;
        String R1 = String.valueOf(C1);
        tvCantidadC1.setText(R1);
        etC.setText(R1);
    }
    public void aumentarP2() {
        String CantidadC2 = etC1.getText().toString();
        int C2 = Integer.parseInt(CantidadC2);
        C2 = C2 +1;
        String R2 = String.valueOf(C2);
        tvCantidadC2.setText(R2);
        etC1.setText(R2);
    }
    public void aumentarP3() {
        String CantidadC3 = etC2.getText().toString();
        int C3 = Integer.parseInt(CantidadC3);
        C3 = C3 +1;
        String R3 = String.valueOf(C3);
        tvCantidadC3.setText(R3);
        etC2.setText(R3);
    }


    //Metodos Disminuir Productos
    public void disminuirP1() {
        String Cantidad2 = etC.getText().toString();
        int C1 = Integer.parseInt(Cantidad2);
        C1 = C1 -1;
        String R1 = String.valueOf(C1);
        tvCantidadC1.setText(R1);
        etC.setText(R1);
    }

    public void disminuirP2() {
    String CantidadC2 = etC1.getText().toString();
    int C2 = Integer.parseInt(CantidadC2);
    C2 = C2 -1;
    String R2 = String.valueOf(C2);
    tvCantidadC2.setText(R2);
    etC1.setText(R2);
    }

    public void disminuirP3() {
        String CantidadC3 = etC2.getText().toString();
        int C3 = Integer.parseInt(CantidadC3);
        C3 = C3 -1;
        String R3 = String.valueOf(C3);
        tvCantidadC3.setText(R3);
        etC2.setText(R3);
    }

    //Metodos Sumar Precios de Productos
    public void sumarP1() {
        String PrecioT1 = etPT.getText().toString();
        String PrecioC1 = tvPrecioC1.getText().toString();
        double P1 = Double.parseDouble(PrecioT1);
        double PC1 = Double.parseDouble(PrecioC1);
        P1 = P1 + PC1;
        String tvPC2 = tvPrecioC.getText().toString();
        double PCN2 = Double.parseDouble(tvPC2);
        double STC1 = P1 +PCN2;
        String R1 = String.valueOf(STC1);
        tvPrecioC.setText(R1);
    }

    public void sumarP2() {
        String PrecioT2 = etPT1.getText().toString();
        String PrecioC2 = tvPrecioC2.getText().toString();
        double P2 = Double.parseDouble(PrecioT2);
        double PC2 = Double.parseDouble(PrecioC2);
        P2 = P2 + PC2;
        String tvPC2 = tvPrecioC.getText().toString();
        double PCN2 = Double.parseDouble(tvPC2);
        double STC1 = P2 +PCN2;
        String R5 = String.valueOf(STC1);
        tvPrecioC.setText(R5);
    }

    public void sumarP3() {
        String PrecioT3 = etPT2.getText().toString();
        String PrecioC3 = tvPrecioC3.getText().toString();
        double P3 = Double.parseDouble(PrecioT3);
        double PC1 = Double.parseDouble(PrecioC3);
        P3 = P3 + PC1;
        String tvPC2 = tvPrecioC.getText().toString();
        double PCN2 = Double.parseDouble(tvPC2);
        double STC1 = P3 +PCN2;
        String R6 = String.valueOf(STC1);
        tvPrecioC.setText(R6);
    }

    //Metodos Restar Precios de Productos
    public void restarP1() {
        String PrecioC1 = tvPrecioC1.getText().toString();
        String tvPC2 = tvPrecioC.getText().toString();
        double P1 = Double.parseDouble(tvPC2);
        double PC1 = Double.parseDouble(PrecioC1);
        P1 = P1 - PC1;
        String R1 = String.valueOf(P1);
        tvPrecioC.setText(R1);
    }

    public void restarP2() {
        String PrecioC1 = tvPrecioC2.getText().toString();
        String tvPC2 = tvPrecioC.getText().toString();
        double P1 = Double.parseDouble(tvPC2);
        double PC1 = Double.parseDouble(PrecioC1);
        P1 = P1 - PC1;
        String R1 = String.valueOf(P1);
        tvPrecioC.setText(R1);
    }

    public void restarP3() {
        String PrecioC1 = tvPrecioC3.getText().toString();
        String tvPC2 = tvPrecioC.getText().toString();
        double P1 = Double.parseDouble(tvPC2);
        double PC1 = Double.parseDouble(PrecioC1);
        P1 = P1 - PC1;
        String R1 = String.valueOf(P1);
        tvPrecioC.setText(R1);
    }



    //Recuperar Informacion

    private void GettvUsuarioName111() {
        Bundle extras = getIntent().getExtras();
        tvUsuarioName1.setText(extras.get("informacion111").toString());
    }
    private void GettvContraseñaName111() {
        Bundle extras = getIntent().getExtras();
        tvContraseñaName1.setText(extras.get("informacion112").toString());
    }
}