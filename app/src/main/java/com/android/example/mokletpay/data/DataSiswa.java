package com.android.example.mokletpay.data;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.android.example.mokletpay.R;

import java.util.ArrayList;

public class DataSiswa extends AppCompatActivity {

    private RecyclerView rvSiswa;
    private ArrayList<Siswa> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_siswa);

        rvSiswa = findViewById(R.id.recyclerDatasiswa);
        rvSiswa.setHasFixedSize(true);

        list.addAll(SiswaData.getListDataSiswa());
        showRecyclerView();
    }

    private void showRecyclerView() {
        rvSiswa.setLayoutManager(
                new LinearLayoutManager(this));
        ListSiswaAdapter listSiswaAdapter = new ListSiswaAdapter(list);
        rvSiswa.setAdapter(listSiswaAdapter);


    }
}