package com.android.example.mokletpay.data;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.android.example.mokletpay.R;

import java.util.ArrayList;

public class DataPetugas extends AppCompatActivity {

    private RecyclerView rvPetugas;
    private ArrayList<Petugas> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_petugas);

        rvPetugas = findViewById(R.id.recycler_petugas);
        rvPetugas.setHasFixedSize(true);

        list.addAll(PetugasData.getListDataPetugas());
        showRecyclerView();
    }

    private void showRecyclerView() {
        rvPetugas.setLayoutManager(
                new LinearLayoutManager(this));
        ListPetugasAdapter listPetugasAdapter = new ListPetugasAdapter(list);
        rvPetugas.setAdapter(listPetugasAdapter);

    }
}