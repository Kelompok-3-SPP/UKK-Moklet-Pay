package com.android.example.mokletpay;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class HomeSiswa extends AppCompatActivity {
    private RecyclerView rvSiswa;
    private ArrayList<Siswa> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_siswa);

        rvSiswa = findViewById(R.id.rv_History);
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