package com.android.example.mokletpay.data;

import java.util.ArrayList;

public class KelasData {
    public static String[][] data = new String[][]{
            {"X RPL"},
            {"X TKJ"},
            {"XI RPL"},
            {"XI TKJ"},
            {"XII RPL"},
            {"XII TKJ"},
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
