package com.android.example.mokletpay;

import java.util.ArrayList;

public class DataSiswaPetugas {
    public static String[][] data = new String[][]{
            {"Rofico Ahmad", "XII RPL 3"},
            {"Esther Howard","XII RPL 2"},
            {"Guy Hawkins","XII RPL 3"},
    };

    public static ArrayList<SiswaPetugas> getListDataSiswaPetugas(){
        ArrayList<SiswaPetugas> list = new ArrayList<>();
        for (String[] dataSiswaPetugas : data){
            SiswaPetugas siswapetugas = new SiswaPetugas();
            siswapetugas.setNamaPetugas(dataSiswaPetugas[0]);
            siswapetugas.setKelasPetugas(dataSiswaPetugas[1]);

            list.add(siswapetugas);
        }
        return list;
    }
}
