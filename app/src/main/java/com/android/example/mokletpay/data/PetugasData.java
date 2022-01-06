package com.android.example.mokletpay.data;

import java.util.ArrayList;

public class PetugasData {
    public static String[][] data = new String[][]{
            {"XII RPL 1","Senin"},
            {"XII RPL 2","Selasa"},
            {"XII RPL 3","Rabu"},
            {"XII RPL 4","Kamis"},
            {"XII RPL 2","Jumat"},
            {"XII RPL 3","Sabtu"},
            {"XII RPL 4","Minggu"},
    };

    public static ArrayList<Petugas> getListDataPetugas(){
        ArrayList<Petugas> list = new ArrayList<>();
        for (String[] dataPetugas : data){
           Petugas petugas= new Petugas();
           petugas.setNamaPetugas(dataPetugas[0]);
            petugas.setHari(dataPetugas[1]);

            list.add(petugas);
        }
        return list;
    }
}
