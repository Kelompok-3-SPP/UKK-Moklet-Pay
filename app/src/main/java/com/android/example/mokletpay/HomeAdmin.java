package com.android.example.mokletpay;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.android.example.mokletpay.data.DataKelas;
import com.android.example.mokletpay.data.DataPetugas;
import com.android.example.mokletpay.data.DataSPP;
import com.android.example.mokletpay.data.DataSiswa;

public class HomeAdmin extends AppCompatActivity {

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
                startActivity(new Intent(HomeAdmin.this, DataSiswa.class));
            }
        });
        cardKelas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeAdmin.this, DataKelas.class));
            }
        });
        cardSPP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeAdmin.this, DataSPP.class));
            }
        });cardPetugas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeAdmin.this, DataPetugas.class));
            }
        });



    }
}