package com.android.example.mokletpay.admin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.android.example.mokletpay.MainActivity;
import com.android.example.mokletpay.R;

import java.util.ArrayList;

public class DataSiswaAdminActivity extends AppCompatActivity implements View.OnClickListener {

    private RecyclerView rvSiswa;
    private ArrayList<com.android.example.mokletpay.admin.SiswaAdmin> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_siswaadmin);

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


        RecyclerView recyclerSiswa = findViewById(R.id.recyclerDatasiswa);
        recyclerSiswa.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.recyclerDatasiswa) {
            Intent i = new Intent(DataSiswaAdminActivity.this, SiswaKurangBayar.class);
            startActivity(i);
        }
    }
}