package com.android.example.mokletpay;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class HomePetugas extends Fragment {

    private RecyclerView recyclerSiswa;
    private ArrayList<Siswa> list = new ArrayList<>();

    public HomePetugas() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.activity_home_petugas, container, false);

        recyclerSiswa = view.findViewById(R.id.recyclerHistory);
        recyclerSiswa.setHasFixedSize(true);

        list.addAll(DataSiswa.getListDataSiswaP());

        recyclerSiswa.setLayoutManager(new LinearLayoutManager(view.getContext()));
        recyclerSiswa.setAdapter(new ListSiswaAdapterP(list));

        return view;
    }
}