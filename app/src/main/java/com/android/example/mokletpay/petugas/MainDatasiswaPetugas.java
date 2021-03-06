package com.android.example.mokletpay.petugas;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.android.example.mokletpay.R;

import java.util.ArrayList;

public class MainDatasiswaPetugas extends Fragment {
    private RecyclerView recyclerDataSiswa;
    private ArrayList<SiswaPetugas> list = new ArrayList<>();

    private Button recyclerDatasiswa;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public MainDatasiswaPetugas() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment DataFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static MainDatasiswaPetugas newInstance(String param1, String param2) {
        MainDatasiswaPetugas fragment = new MainDatasiswaPetugas();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.activity_datasiswa_petugas, container, false);

        recyclerDataSiswa = view.findViewById(R.id.recyclerDatasiswa);
        recyclerDataSiswa.setHasFixedSize(true);

        list.addAll(DataSiswaPetugas.getListDataSiswaPetugas());

        recyclerDataSiswa.setLayoutManager(new LinearLayoutManager(view.getContext()));
        recyclerDataSiswa.setAdapter(new ListSiswaAdapterPetugas(list));

        return view;
    }
}
