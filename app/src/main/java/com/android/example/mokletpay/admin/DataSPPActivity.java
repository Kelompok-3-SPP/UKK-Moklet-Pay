package com.android.example.mokletpay.admin;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.android.example.mokletpay.R;

import java.util.ArrayList;

public class DataSPPActivity extends AppCompatActivity {
    private RecyclerView rvSpp;
    private ArrayList<com.android.example.mokletpay.admin.Spp> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_spp);

        rvSpp = findViewById(R.id.rv_spp);
        rvSpp.setHasFixedSize(true);

        list.addAll(SppData.getListDataSpp());
        showRecyclerView();
    }

    private void showRecyclerView() {
        rvSpp.setLayoutManager(
                new LinearLayoutManager(this));
        ListSppAdapter listSppAdapter = new ListSppAdapter(list);
        rvSpp.setAdapter(listSppAdapter);

    }

}
