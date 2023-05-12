//Tanggal Pengerjaan : 12/05/2023
//NIM	: 10120134
//Nama	: Eriko Ananta
//Kelas	: 10120134
package com.example.tugas1akbif410120134;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.os.Handler;
import android.view.View;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        // inisialisasi view
        View decorView = getWindow().getDecorView();
        // Hide the status bar.
        decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_FULLSCREEN);
        // Hide ActionBar
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        // timer
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashScreenActivity.this, LoginActivity.class));
                finish();
            }
        }, 6000);
    }
}