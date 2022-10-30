package com.example.cs5;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText editTextUsername;
    private EditText editTextPassword;
    private Button buttonInit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         initview();
    }

    private void initview() {
        editTextUsername = findViewById(R.id.editTextUsername);
        editTextPassword = findViewById(R.id.editTextPassword);
        buttonInit = findViewById(R.id.buttonInit);

        buttonInit.setOnClickListener(
                new  View.OnClickListener() {

                    @Override
                   public void onClick(View v) {
                      //  Toast.makeText(MainActivity.this,  "Alguien le dio click", Toast.LENGTH_LONG).show();
                        login();
                    }
                }
        );

    }
    private void login(){
        String username = editTextUsername.getText().toString();
        String password = editTextPassword.getText().toString();
        if (username.contentEquals("Mayerlilindateamo" ) && password.contentEquals("Holicaracoli")){
            //mostrar el mensaje de logueo
            editTextUsername.setError(null);
            Toast.makeText(this, "Muy bien, bienvenido", Toast.LENGTH_SHORT).show();
        }
        else {
            editTextUsername.setError("Tu usuario no existe");
            editTextPassword.setError("No es tu contraseña");
        }
    }
}