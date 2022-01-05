package com.android.example.mokletpay.data;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.android.example.mokletpay.R;

import java.util.ArrayList;

public class DataSPP extends AppCompatActivity {
    private RecyclerView rvSpp;
    private ArrayList<Spp> list = new ArrayList<>();

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
