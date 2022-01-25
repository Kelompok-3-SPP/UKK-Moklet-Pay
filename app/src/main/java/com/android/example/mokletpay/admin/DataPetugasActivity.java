package com.android.example.mokletpay.admin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.android.example.mokletpay.R;

import java.util.ArrayList;

public class DataPetugasActivity extends AppCompatActivity {

    private RecyclerView rvPetugas;
    private ArrayList<Petugas> list = new ArrayList<>();
    private ImageButton btn_Add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_petugas);

        rvPetugas = findViewById(R.id.recycler_petugas);
        rvPetugas.setHasFixedSize(true);
        btn_Add = findViewById(R.id.btn_add_petugas);

        btn_Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DataPetugasActivity.this, RegisterActivity.class));
            }
        });


        list.addAll(PetugasData.getListDataPetugas());
        showRecyclerView();
    }

    private void showRecyclerView() {
        rvPetugas.setLayoutManager(
                new LinearLayoutManager(this));
        com.android.example.mokletpay.admin.ListPetugasAdapter listPetugasAdapter = new com.android.example.mokletpay.admin.ListPetugasAdapter(list);
        rvPetugas.setAdapter(listPetugasAdapter);

    }
}