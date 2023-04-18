package com.example.exo_c5as;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Compra extends AppCompatActivity {
    private TextView tvUsuarioName2;
    private TextView tvContraseñaName2;
    private TextView tvR1;
    private TextView tvCA1;
    private TextView tvR2;
    private TextView tvCA2;
    private TextView tvR3;
    private TextView tvCA3;
    private TextView tvPTP;
    private Button btnSeguirComprando;
    private Button btnFinalizarCompra;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compra);

        tvR1 = (TextView) findViewById(R.id.tvR1);
        tvCA1 = (TextView) findViewById(R.id.tvCA1);
        tvR2 = (TextView) findViewById(R.id.tvR2);
        tvCA2 = (TextView) findViewById(R.id.tvCA2);
        tvR3 = (TextView) findViewById(R.id.tvR3);
        tvCA3 = (TextView) findViewById(R.id.tvCA3);
        tvPTP = (TextView) findViewById(R.id.tvPTP);
        Producto1();
        Producto2();
        Producto3();
        Cantidad1();
        Cantidad2();
        Cantidad3();
        PrecioTotal();


        tvUsuarioName2 = (TextView)findViewById(R.id.tvUsuarioName2);
        tvContraseñaName2 = (TextView)findViewById(R.id.tvContraseñaName2);
        GettvUsuarioName112();
        GettvContraseñaName112();


        btnFinalizarCompra = (Button) findViewById(R.id.btnFinalizarCompra);
        btnFinalizarCompra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Compra Finalizada",Toast.LENGTH_SHORT).show();
                Log.i("INFO:","Sesion Cerrada");
                String SCU1 = tvUsuarioName2.getText().toString();
                String SCC1 = tvContraseñaName2.getText().toString();
                Intent intent = new Intent(Compra.this,Login.class);
                intent.putExtra("informacion1",SCU1);
                intent.putExtra("informacion2",SCC1);
                startActivity(intent);
            }
        });

        btnSeguirComprando = (Button) findViewById(R.id.btnSeguirComprando);
        btnSeguirComprando.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Compra Finalizada",Toast.LENGTH_SHORT).show();
                Log.i("INFO:","Menu Principal");
                String usu12 = tvUsuarioName2.getText().toString();
                String con12 = tvContraseñaName2.getText().toString();
                Intent intent = new Intent(Compra.this,MainActivity.class);
                intent.putExtra("informacion3",usu12);
                intent.putExtra("informacion25",con12);
                startActivity(intent);
            }
        });

    }

    //Productos
    private void Producto1() {
        Bundle extras=getIntent().getExtras();
        tvR1.setText(extras.get("informacion5").toString());
    }
    private void Producto2() {
        Bundle extras=getIntent().getExtras();
        tvR2.setText(extras.get("informacion7").toString());
    }
    private void Producto3() {
        Bundle extras=getIntent().getExtras();
        tvR3.setText(extras.get("informacion9").toString());
    }

    //Cantidades
    private void Cantidad1() {
        Bundle extras=getIntent().getExtras();
        tvCA1.setText(extras.get("informacion6").toString());
    }
    private void Cantidad2() {
        Bundle extras=getIntent().getExtras();
        tvCA2.setText(extras.get("informacion8").toString());
    }
    private void Cantidad3() {
        Bundle extras=getIntent().getExtras();
        tvCA3.setText(extras.get("informacion10").toString());
    }

    //Precio
    private void PrecioTotal() {
        Bundle extras=getIntent().getExtras();
        tvPTP.setText(extras.get("informacion11").toString());
    }

    private void GettvUsuarioName112() {
        Bundle extras = getIntent().getExtras();
        tvUsuarioName2.setText(extras.get("informacion113").toString());
    }
    private void GettvContraseñaName112() {
        Bundle extras = getIntent().getExtras();
        tvContraseñaName2.setText(extras.get("informacion114").toString());
    }

}