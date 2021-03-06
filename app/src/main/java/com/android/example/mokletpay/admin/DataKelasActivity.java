package com.android.example.mokletpay.admin;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.android.example.mokletpay.R;

import java.util.ArrayList;

public class DataKelasActivity extends AppCompatActivity {


    private RecyclerView rvKelas;
    private ArrayList<com.android.example.mokletpay.admin.Kelas> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_kelas);

        rvKelas = findViewById(R.id.recyclerHistory);
        rvKelas.setHasFixedSize(true);

        list.addAll(KelasData.getListDataKelas());
        showRecyclerView();
    }

    private void showRecyclerView() {
        rvKelas.setLayoutManager(
                new LinearLayoutManager(this));
        ListKelasAdapter listKelasAdapter = new ListKelasAdapter(list);
        rvKelas.setAdapter(listKelasAdapter);

    }

}