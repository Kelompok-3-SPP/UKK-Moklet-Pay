package com.android.example.mokletpay.petugas;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.android.example.mokletpay.R;

import java.util.ArrayList;

public class MainPetugasActivity extends Fragment {

    private RecyclerView recyclerSiswa;
    private ArrayList<SiswaHomePetugas> list = new ArrayList<>();

    public MainPetugasActivity() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.activity_main_petugas, container, false);

        recyclerSiswa = view.findViewById(R.id.recyclerHistory);
        recyclerSiswa.setHasFixedSize(true);

        list.addAll(DataSiswaHome.getListDataSiswaP());

        recyclerSiswa.setLayoutManager(new LinearLayoutManager(view.getContext()));
        recyclerSiswa.setAdapter(new ListSiswaAdapterHome(list));

        return view;
    }

}
