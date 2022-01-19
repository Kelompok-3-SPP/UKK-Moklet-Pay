package com.android.example.mokletpay.siswa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.android.example.mokletpay.R;

import java.util.ArrayList;

public class HomeSiswaActivity extends AppCompatActivity {

    private RecyclerView rvSiswa;
    private ArrayList<HistorySiswa> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_siswa);

        rvSiswa = findViewById(R.id.rv_History);
        rvSiswa.setHasFixedSize(true);

        list.addAll(HistorySiswaData.getListDataSiswa());
        showRecyclerView();
    }

    private void showRecyclerView() {
        rvSiswa.setLayoutManager(
                new LinearLayoutManager(this));
        ListHistorySiswaAdapter listHistorySiswaAdapter = new ListHistorySiswaAdapter(list);
        rvSiswa.setAdapter(listHistorySiswaAdapter);

    }

}