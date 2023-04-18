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

public class Vestidos extends AppCompatActivity {
    private TextView tvUsuarioName4;
    private TextView tvContraseñaName4;
    private TextView tvNombreV1;
    private TextView tvNombreV2;
    private TextView tvNombreV3;
    private TextView tvPrecioV1;
    private TextView tvPrecioV2;
    private TextView tvPrecioV3;
    private TextView tvCantidadV1;
    private TextView tvCantidadV2;
    private TextView tvCantidadV3;
    private TextView tvPrecioV;
    private Button btnSumarV1;
    private Button btnSumarV2;
    private Button btnSumarV3;
    private Button btnRestarV1;
    private Button btnRestarV2;
    private Button btnRestarV3;
    private Button btnComprarV;
    private Button btnVestidoVMBCRNSMEAVPOCB;
    private Button btnVestidoVTUFM;
    private Button btnVestidoVBb;
    private EditText etV;
    private EditText etPTV;
    private EditText etV1;
    private EditText etPTV1;
    private EditText etV2;
    private EditText etPTV2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vestidos);
        //Convertir Items en Variables
        tvNombreV1 = (TextView)findViewById(R.id.tvNombreV1);
        tvNombreV2 = (TextView)findViewById(R.id.tvNombreV2);
        tvNombreV3 = (TextView)findViewById(R.id.tvNombreV3);

        tvUsuarioName4 = (TextView)findViewById(R.id.tvUsuarioName4);
        tvContraseñaName4 = (TextView)findViewById(R.id.tvContraseñaName4);
        GettvUsuarioName114();
        GettvContraseñaName114();

        tvPrecioV1 = (TextView)findViewById(R.id.tvPrecioV1);
        tvPrecioV2 = (TextView)findViewById(R.id.tvPrecioV2);
        tvPrecioV3 = (TextView)findViewById(R.id.tvPrecioV3);
        etV = (EditText)findViewById(R.id.etV);
        etPTV = (EditText)findViewById(R.id.etPTV);
        etV1 = (EditText)findViewById(R.id.etV1);
        etPTV1 = (EditText)findViewById(R.id.etPTV1);
        etV2 = (EditText)findViewById(R.id.etV2);
        etPTV2 = (EditText)findViewById(R.id.etPTV2);
        tvCantidadV1 = (TextView)findViewById(R.id.tvCantidadV1);
        tvCantidadV2 = (TextView)findViewById(R.id.tvCantidadV2);
        tvCantidadV3 = (TextView)findViewById(R.id.tvCantidadV3);
        tvPrecioV = (TextView)findViewById(R.id.tvPrecioV);

        //Funciones de los Botones

        // Botones de Descrip de Producto

        btnVestidoVMBCRNSMEAVPOCB = (Button) findViewById(R.id.btnVestidoVMBCRNSMEAVPOCB);
        btnVestidoVMBCRNSMEAVPOCB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("INFO:", "Descripcion");
                Intent intent = new Intent(Vestidos.this, Vestido1.class);
                startActivity(intent);
            }
        });

        btnVestidoVTUFM = (Button) findViewById(R.id.btnVestidoVTUFM);
        btnVestidoVTUFM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("INFO:", "Descripcion");
                Intent intent = new Intent(Vestidos.this, Vestido2.class);
                startActivity(intent);
            }
        });

        btnVestidoVBb = (Button) findViewById(R.id.btnVestidoVBb);
        btnVestidoVBb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("INFO:", "Descripcion");
                Intent intent = new Intent(Vestidos.this, Vestido3.class);
                startActivity(intent);
            }
        });

        //Aumentar Productos y Sumar Precios

        btnSumarV1 = (Button) findViewById(R.id.btnSumarV1);
        btnSumarV1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                aumentarV1();
                sumarV1();
            }
        });



        btnSumarV2 = (Button) findViewById(R.id.btnSumarV2);
        btnSumarV2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                aumentarV2();
                sumarV2();
            }
        });

        btnSumarV3 = (Button) findViewById(R.id.btnSumarV3);
        btnSumarV3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                aumentarV3();
                sumarV3();
            }
        });

        //Disminuir Productos y Restar Precios
        btnRestarV1 = (Button) findViewById(R.id.btnRestarV1);
        btnRestarV1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                disminuirV1();
                restarV1();
            }
        });

        btnRestarV2 = (Button) findViewById(R.id.btnRestarV2);
        btnRestarV2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                disminuirV2();
                restarV2();
            }
        });

        btnRestarV3 = (Button) findViewById(R.id.btnRestarV3);
        btnRestarV3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                disminuirV3();
                restarV3();
            }
        });

        //Comprar

        btnComprarV = (Button) findViewById(R.id.btnComprarV);
        btnComprarV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Compra Realizada",Toast.LENGTH_SHORT).show();
                Log.i("INFO:","Compra Exitosa");
                String NV1 = tvNombreV1.getText().toString();
                String CV1 = tvCantidadV1.getText().toString();
                String NV2 = tvNombreV2.getText().toString();
                String CV2 = tvCantidadV2.getText().toString();
                String NV3 = tvNombreV3.getText().toString();
                String CV3 = tvCantidadV3.getText().toString();
                String PV1 = tvPrecioV.getText().toString();
                String usuar16 = tvUsuarioName4.getText().toString();
                String contra16 = tvContraseñaName4.getText().toString();
                Intent intent = new Intent(Vestidos.this,Compra.class);
                intent.putExtra("informacion5",NV1);
                intent.putExtra("informacion6",CV1);
                intent.putExtra("informacion7",NV2);
                intent.putExtra("informacion8",CV2);
                intent.putExtra("informacion9",NV3);
                intent.putExtra("informacion10",CV3);
                intent.putExtra("informacion11",PV1);
                intent.putExtra("informacion113",usuar16);
                intent.putExtra("informacion114",contra16);
                startActivity(intent);
            }
        });
    }

    //Metodos Aumentar Productos
    public void aumentarV1() {
        String CantidadV1 = etV.getText().toString();
        int CV1 = Integer.parseInt(CantidadV1);
        CV1 = CV1 +1;
        String R1 = String.valueOf(CV1);
        tvCantidadV1.setText(R1);
        etV.setText(R1);
    }
    public void aumentarV2() {
        String CantidadV2 = etV1.getText().toString();
        int CV2 = Integer.parseInt(CantidadV2);
        CV2 = CV2 +1;
        String R2 = String.valueOf(CV2);
        tvCantidadV2.setText(R2);
        etV1.setText(R2);
    }
    public void aumentarV3() {
        String CantidadV3 = etV2.getText().toString();
        int CV3 = Integer.parseInt(CantidadV3);
        CV3 = CV3 +1;
        String R3 = String.valueOf(CV3);
        tvCantidadV3.setText(R3);
        etV2.setText(R3);
    }

    //Metodos Sumar Precios de Productos
    public void sumarV1() {
        String PrecioTV1 = etPTV.getText().toString();
        String PrecioV1 = tvPrecioV1.getText().toString();
        double PV1 = Double.parseDouble(PrecioTV1);
        double PVE1 = Double.parseDouble(PrecioV1);
        PV1 = PV1 + PVE1;
        String tvPV2 = tvPrecioV.getText().toString();
        double PVN2 = Double.parseDouble(tvPV2);
        double STV1 = PV1 +PVN2;
        String R1 = String.valueOf(STV1);
        tvPrecioV.setText(R1);
    }
    public void sumarV2() {
        String PrecioTV2 = etPTV1.getText().toString();
        String PrecioV2 = tvPrecioV2.getText().toString();
        double PV2 = Double.parseDouble(PrecioTV2);
        double PVE2 = Double.parseDouble(PrecioV2);
        PV2 = PV2 + PVE2;
        String tvPV2 = tvPrecioV.getText().toString();
        double PVN2 = Double.parseDouble(tvPV2);
        double STV1 = PV2 +PVN2;
        String R11 = String.valueOf(STV1);
        tvPrecioV.setText(R11);
    }
    public void sumarV3() {
        String PrecioTV3 = etPTV2.getText().toString();
        String PrecioV3 = tvPrecioV3.getText().toString();
        double PV3 = Double.parseDouble(PrecioTV3);
        double PVE3 = Double.parseDouble(PrecioV3);
        PV3 = PV3 + PVE3;
        String tvPV2 = tvPrecioV.getText().toString();
        double PVN2 = Double.parseDouble(tvPV2);
        double STV1 = PV3 +PVN2;
        String R12 = String.valueOf(STV1);
        tvPrecioV.setText(R12);
    }

    //Metodos Disminuir Productos
    public void disminuirV1() {
        String CantidadV1 = etV.getText().toString();
        int CV1 = Integer.parseInt(CantidadV1);
        CV1 = CV1 -1;
        String R1 = String.valueOf(CV1);
        tvCantidadV1.setText(R1);
        etV.setText(R1);
    }
    public void disminuirV2() {
        String CantidadV2 = etV1.getText().toString();
        int CV2 = Integer.parseInt(CantidadV2);
        CV2 = CV2 -1;
        String R2 = String.valueOf(CV2);
        tvCantidadV2.setText(R2);
        etV1.setText(R2);
    }
    public void disminuirV3() {
        String CantidadV3 = etV2.getText().toString();
        int CV3 = Integer.parseInt(CantidadV3);
        CV3 = CV3 -1;
        String R3 = String.valueOf(CV3);
        tvCantidadV3.setText(R3);
        etV2.setText(R3);
    }

    //Metodos Restar Precios de Productos
    public void restarV1() {
        String PrecioVE1 = tvPrecioV1.getText().toString();
        String tvPVE2 = tvPrecioV.getText().toString();
        double P1 = Double.parseDouble(tvPVE2);
        double PVE1 = Double.parseDouble(PrecioVE1);
        P1 = P1 - PVE1;
        String R1 = String.valueOf(P1);
        tvPrecioV.setText(R1);
    }
    public void restarV2() {
        String PrecioVE1 = tvPrecioV2.getText().toString();
        String tvPVE2 = tvPrecioV.getText().toString();
        double P1 = Double.parseDouble(tvPVE2);
        double PVE1 = Double.parseDouble(PrecioVE1);
        P1 = P1 - PVE1;
        String R1 = String.valueOf(P1);
        tvPrecioV.setText(R1);
    }
    public void restarV3() {
        String PrecioVE1 = tvPrecioV3.getText().toString();
        String tvPVE2 = tvPrecioV.getText().toString();
        double P1 = Double.parseDouble(tvPVE2);
        double PVE1 = Double.parseDouble(PrecioVE1);
        P1 = P1 - PVE1;
        String R1 = String.valueOf(P1);
        tvPrecioV.setText(R1);
    }



    private void GettvUsuarioName114() {
        Bundle extras = getIntent().getExtras();
        tvUsuarioName4.setText(extras.get("informacion111").toString());
    }
    private void GettvContraseñaName114() {
        Bundle extras = getIntent().getExtras();
        tvContraseñaName4.setText(extras.get("informacion112").toString());
    }
}