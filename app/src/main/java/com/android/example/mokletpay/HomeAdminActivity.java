package com.android.example.mokletpay;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.android.example.mokletpay.data.DataKelasActivity;
import com.android.example.mokletpay.data.DataPetugasActivity;
import com.android.example.mokletpay.data.DataSPPActivity;
import com.android.example.mokletpay.data.DataSiswaAdminActivity;

public class HomeAdminActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_admin);

        CardView cardSiswa = findViewById(R.id.datasiswa);
        CardView cardKelas = findViewById(R.id.datakelas);
        CardView cardSPP = findViewById(R.id.dataspp);
        CardView cardPetugas = findViewById(R.id.datapetugas);

        cardSiswa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeAdminActivity.this, DataSiswaAdminActivity.class));
            }
        });
        cardKelas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeAdminActivity.this, DataKelasActivity.class));
            }
        });
        cardSPP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeAdminActivity.this, DataSPPActivity.class));
            }
        });cardPetugas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeAdminActivity.this, DataPetugasActivity.class));
            }
        });



    }
}