//Tanggal Pengerjaan : 12/05/2023
//NIM	: 10120134
//Nama	: Eriko Ananta
//Kelas	: 10120134
package com.example.tugas1akbif410120134;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        MaterialButton registerbtn = findViewById(R.id.btnregister);
        MaterialButton ToLoginbtn = findViewById(R.id.btngologin);

        // To Login Button
        ToLoginbtn.setOnClickListener(view -> {
            startActivity(new Intent(RegisterActivity.this, LoginActivity.class));
            finish();
        });

        // Register Button
        registerbtn.setOnClickListener(view -> {
            startActivity(new Intent(RegisterActivity.this, LoginActivity.class));
            finish();
        });
    }
}