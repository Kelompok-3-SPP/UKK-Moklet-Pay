package com.android.example.mokletpay.admin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.android.example.mokletpay.R;

import java.util.ArrayList;

public class DataDetailSiswaActivity extends AppCompatActivity {


    private RecyclerView rvSiswa;
    private ArrayList<com.android.example.mokletpay.admin.DetailSiswaAdmin> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_detail_siswa);

        rvSiswa = findViewById(R.id.recyclerDetailDatasiswa);
        rvSiswa.setHasFixedSize(true);

        list.addAll(DetailSiswaData.getListDetailDataSiswa());
        showRecyclerView();

    }

    private void showRecyclerView() {
        rvSiswa.setLayoutManager(
                new LinearLayoutManager(this));
        ListDetailSiswaAdapter listDetailSiswaAdapter = new ListDetailSiswaAdapter(list);
        rvSiswa.setAdapter(listDetailSiswaAdapter);

    }


}