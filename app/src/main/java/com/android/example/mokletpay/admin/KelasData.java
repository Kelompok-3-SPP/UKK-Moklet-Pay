package com.android.example.mokletpay.admin;

import java.util.ArrayList;

public class KelasData {
    public static String[][] data = new String[][]{
            {"X RPL"},
            {"X TKJ"},
            {"XI RPL"},
            {"XI TKJ"},
            {"XII RPL"},
            {"XII TKJ"},
            {"X RPL"},
            {"X TKJ"},
            {"XI RPL"},
            {"XI TKJ"},
            {"XII RPL"},
            {"XII TKJ"},
    };

    public static ArrayList<com.android.example.mokletpay.admin.Kelas> getListDataKelas(){
        ArrayList<com.android.example.mokletpay.admin.Kelas> list = new ArrayList<>();
        for (String[] dataKelas : data){
            com.android.example.mokletpay.admin.Kelas kelas = new com.android.example.mokletpay.admin.Kelas();
            kelas.setKelas(dataKelas[0]);

            list.add(kelas);
        }
        return list;
    }
}
