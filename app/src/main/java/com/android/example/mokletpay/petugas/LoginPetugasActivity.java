package com.android.example.mokletpay.petugas;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.android.example.mokletpay.R;
import com.android.example.mokletpay.siswa.HomeSiswaActivity;
import com.android.example.mokletpay.siswa.LoginSiswaActivity;

public class LoginPetugasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_petugas);

        Button btnLoginPetugas = findViewById(R.id.login_petugas);

        btnLoginPetugas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginPetugasActivity.this, MainNavbarActivity.class));
            }
        });
    }
}