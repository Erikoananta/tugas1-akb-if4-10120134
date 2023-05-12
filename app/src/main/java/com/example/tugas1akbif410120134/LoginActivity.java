//Tanggal Pengerjaan : 12/05/2023
//NIM	: 10120134
//Nama	: Eriko Ananta
//Kelas	: 10120134
package com.example.tugas1akbif410120134;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

import org.w3c.dom.Text;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TextView username = findViewById(R.id.username);
        TextView password = findViewById(R.id.password);

        MaterialButton loginbtn = findViewById(R.id.loginbtn);
        MaterialButton toregisterbtn = findViewById(R.id.toregisterbtn);

        // To Login Button
        toregisterbtn.setOnClickListener(view -> {
            startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
            finish();
        });

        // admin and admin
        loginbtn.setOnClickListener(view -> {
            if (username.getText().toString().equals("admin") && password.getText().toString().equals("admin"))
            {
                Toast.makeText(LoginActivity.this, "LOGIN SUCCESSFUL", Toast.LENGTH_SHORT).show();
                // timer
                new Handler().postDelayed(() -> {
                    startActivity(new Intent(LoginActivity.this, MainActivity.class));
                    finish();
                }, 3000);
            }
            else
            {
                Toast.makeText(LoginActivity.this, "LOGIN FAILED !!!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}