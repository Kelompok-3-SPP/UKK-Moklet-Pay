package com.android.example.mokletpay.admin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.android.example.mokletpay.R;
import com.android.example.mokletpay.petugas.KurangBayar;
import com.android.example.mokletpay.petugas.StatusPembayaran;

public class SiswaKurangBayar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statusbayar_admin);

        ImageButton btnEdit = findViewById(R.id.btn_edit);
        ImageButton btnPrint = findViewById(R.id.btn_print);

        btnEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SiswaKurangBayar.this, KurangBayar.class));

            }
        });

        btnPrint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(SiswaKurangBayar.this, "Print...", Toast.LENGTH_SHORT).show();

            }
        });
    }
}
