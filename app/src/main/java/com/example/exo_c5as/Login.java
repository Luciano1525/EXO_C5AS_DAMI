package com.example.exo_c5as;

import androidx.activity.contextaware.ContextAware;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    private Button btnRegistrar1;
    private Button btnIngresar;
    private EditText txtUsuario;
    private EditText txtContraseña;
    private TextView tvUsuario;
    private TextView tvContraseña;
    private EditText etUsuario;
    private EditText etContraseña;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_main);
        tvUsuario = (TextView) findViewById(R.id.tvUsuario);
        tvContraseña = (TextView) findViewById(R.id.tvContraseña);
        etUsuario = (EditText) findViewById(R.id.etUsuario);
        etContraseña = (EditText) findViewById(R.id.etContraseña);


        SharedPreferences Usuario3 = getSharedPreferences("datos", Context.MODE_PRIVATE);
        SharedPreferences Contraseña3 = getSharedPreferences("datos1", Context.MODE_PRIVATE);
        etUsuario.setText(Usuario3.getString("Usuario", ""));
        etContraseña.setText(Contraseña3.getString("Contraseña", ""));


        btnIngresar = (Button) findViewById(R.id.btnIngresar);
        txtUsuario = (EditText) findViewById(R.id.txtUsuario);
        txtContraseña = (EditText) findViewById(R.id.txtContraseña);
        btnIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GettvUsuario01();
                GettvContraseña01();
                validar2();

            }
        });


        btnRegistrar1 = (Button) findViewById(R.id.btnRegistrar1);
        btnRegistrar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Registro", Toast.LENGTH_SHORT).show();
                Log.i("INFO:", "Menu Principal");
                Intent intent = new Intent(Login.this, Register.class);
                startActivity(intent);
            }
        });

    }

    //Validacion de Login

    public void validar2() {
        String Usuario = txtUsuario.getText().toString();
        String Contraseña = txtContraseña.getText().toString();
        String Usuario1 = tvUsuario.getText().toString();
        String Contraseña1 = tvContraseña.getText().toString();

        if (Usuario.equals(Usuario1)) {
            if (Contraseña.equals(Contraseña1)) {
                shared();
                Toast.makeText(getApplicationContext(), "Sesion Iniciada", Toast.LENGTH_SHORT).show();
                Log.i("INFO:", "Menu Principal");
                String Usuario4 = txtUsuario.getText().toString();
                String Contraseña4 = txtContraseña.getText().toString();
                Intent intent = new Intent(Login.this, MainActivity.class);
                intent.putExtra("informacion3",Usuario4);
                intent.putExtra("informacion25",Contraseña4);
                startActivity(intent);
            } else {
                Toast.makeText(getApplicationContext(), "Las Contraseñas no Coinciden", Toast.LENGTH_SHORT).show();
            }

        } else {
            Toast.makeText(getApplicationContext(), "Usuario no Existe", Toast.LENGTH_SHORT).show();
        }
    }
    public void validar3() {

        String Usuario011 = tvUsuario.getText().toString();
        String Contraseña011 = tvContraseña.getText().toString();

        verificar();
        if (Usuario011.equals("Usuario")) {
            if (Contraseña011.equals("Contraseña")) {
                GettvUsuario01();
                GettvContraseña01();
                verificar();
                Toast.makeText(getApplicationContext(), "Verificado", Toast.LENGTH_SHORT).show();
                //shared();
                validar2();
            } else {
                validar2();
            }
        } else {
            validar2();
        }
    }

    public void shared() {

        SharedPreferences Usuario3 = getSharedPreferences("datos", Context.MODE_PRIVATE);
        SharedPreferences.Editor editorU = Usuario3.edit();
        editorU.putString("Usuario", etUsuario.getText().toString());
        editorU.commit();
        SharedPreferences Contraseña4 = getSharedPreferences("datos1", Context.MODE_PRIVATE);
        SharedPreferences.Editor editorC = Contraseña4.edit();
        editorC.putString("Contraseña", etContraseña.getText().toString());
        editorC.commit();
        }

        public void verificar() {
            String Usuario111 = tvUsuario.getText().toString();
            String Usario222 = etUsuario.getText().toString();
            String Usua1 = txtUsuario.getText().toString();
            String Usua2 = etUsuario.getText().toString();

            if (Usua1.equals(Usua2)) {
                String Usuari12 = etUsuario.getText().toString();
                String Contrase12 = etContraseña.getText().toString();
                tvUsuario.setText(Usuari12);
                tvContraseña.setText(Contrase12);

            } else if (Usuario111.equals("Usuario")){
                String Usuario001 = tvUsuario.getText().toString();
                String Contraseña001 = tvContraseña.getText().toString();
                etUsuario.setText(Usuario001);
                etContraseña.setText(Contraseña001);

            } else {
                String Usuario01 = tvUsuario.getText().toString();
                String Contraseña01 = tvContraseña.getText().toString();
                etUsuario.setText(Usuario01);
                etContraseña.setText(Contraseña01);
            }

        }
    private void GettvUsuario01() {
        Bundle extras = getIntent().getExtras();
        tvUsuario.setText(extras.get("informacion1").toString());
    }
    private void GettvContraseña01() {
        Bundle extras = getIntent().getExtras();
        tvContraseña.setText(extras.get("informacion2").toString());
    }


}



