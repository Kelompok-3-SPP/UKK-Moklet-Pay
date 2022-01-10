package com.android.example.mokletpay.data;

import java.util.ArrayList;

public class PetugasData {
    public static String[][] data = new String[][]{
            {"Guy Hawkins","Senin"},
            {"Guy Hawkins","Selasa"},
            {"Guy Hawkins","Rabu"},
            {"Guy Hawkins","Kamis"},
            {"Guy Hawkins","Jumat"},
            {"Guy Hawkins","Sabtu"},
            {"Guy Hawkins","Minggu"},
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
