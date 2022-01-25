package com.android.example.mokletpay.menu;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.ImageButton;

import com.android.example.mokletpay.R;

public class MainActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    ImageButton btnSiswa = findViewById(R.id.bgsiswa);
    ImageButton btnAdmin = findViewById(R.id.bgadmin);
    ImageButton btnPetugas = findViewById(R.id.bgpetugas);


    btnSiswa.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            startActivity(new Intent(MainActivity.this, LoginSiswaActivity.class));
        }
    });
    btnAdmin.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            startActivity(new Intent(MainActivity.this, LoginAdminActivity.class));
        }
    });
    btnPetugas.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            startActivity(new Intent(MainActivity.this, LoginPetugasActivity.class));
        }
    });


}
}