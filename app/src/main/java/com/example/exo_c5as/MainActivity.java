package com.example.exo_c5as;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView tvUsuarioName;
    private TextView tvContraseñaName;
    private Button btnComprarC;
    private Button btnComprarV;
    private Button btnComprarP;
    private Button btnCerrarSesion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvUsuarioName = (TextView) findViewById(R.id.tvUsuarioName);
        tvContraseñaName = (TextView) findViewById(R.id.tvContraseñaName);
        GettvUsuarioName01();
        GettvContraseñaName01();

        btnComprarC = (Button) findViewById(R.id.btnComprarC);
        btnComprarC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Menu Camisas", Toast.LENGTH_SHORT).show();
                Log.i("INFO:", "Menu de Camisas");
                String usuario12 = tvUsuarioName.getText().toString();
                String contraseña12 = tvContraseñaName.getText().toString();
                Intent intent = new Intent(MainActivity.this, Camisass.class);
                intent.putExtra("informacion111",usuario12);
                intent.putExtra("informacion112",contraseña12);
                startActivity(intent);
            }
        });

        btnComprarV = (Button) findViewById(R.id.btnComprarV);
        btnComprarV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Menu Vestidos", Toast.LENGTH_SHORT).show();
                Log.i("INFO:", "Menu de Vestidos");
                String usuario12 = tvUsuarioName.getText().toString();
                String contraseña12 = tvContraseñaName.getText().toString();
                Intent intent = new Intent(MainActivity.this, Vestidos.class);
                intent.putExtra("informacion111",usuario12);
                intent.putExtra("informacion112",contraseña12);
                startActivity(intent);
            }
        });

        btnComprarP = (Button) findViewById(R.id.btnComprarP);
        btnComprarP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Menu Pantalones", Toast.LENGTH_SHORT).show();
                Log.i("INFO:", "Menu de Pantalones");
                String usuario12 = tvUsuarioName.getText().toString();
                String contraseña12 = tvContraseñaName.getText().toString();
                Intent intent = new Intent(MainActivity.this, Pantalones.class);
                intent.putExtra("informacion111",usuario12);
                intent.putExtra("informacion112",contraseña12);
                startActivity(intent);
            }
        });

        btnCerrarSesion = (Button) findViewById(R.id.btnCerrarSesion);
        btnCerrarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Sesion Cerrada", Toast.LENGTH_SHORT).show();
                Log.i("INFO:", "Login");
                String SCU = tvUsuarioName.getText().toString();
                String SCC = tvContraseñaName.getText().toString();
                Intent intent = new Intent(MainActivity.this, Login.class);
                intent.putExtra("informacion1",SCU);
                intent.putExtra("informacion2",SCC);
                startActivity(intent);
            }
        });




    }

    private void GettvUsuarioName01() {
        Bundle extras = getIntent().getExtras();
        tvUsuarioName.setText(extras.get("informacion3").toString());
    }
    private void GettvContraseñaName01() {
        Bundle extras = getIntent().getExtras();
        tvContraseñaName.setText(extras.get("informacion25").toString());
    }
}