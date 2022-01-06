package com.android.example.mokletpay.data;

import java.util.ArrayList;

public class KelasData {
    public static String[][] data = new String[][]{
            {"XII RPL 1"},
            {"XII RPL 2"},
            {"XII RPL 3"},
            {"XII RPL 4"},
            {"XII RPL 5"},
            {"XII RPL 6"},
            {"XII TKJ 1"},
            {"XII TKJ 2"},
    };

    public static ArrayList<Kelas> getListDataKelas(){
        ArrayList<Kelas> list = new ArrayList<>();
        for (String[] dataKelas : data){
            Kelas kelas = new Kelas();
            kelas.setKelas(dataKelas[0]);

            list.add(kelas);
        }
        return list;
    }
}
