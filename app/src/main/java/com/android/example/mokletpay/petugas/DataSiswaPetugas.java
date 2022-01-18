package com.android.example.mokletpay.petugas;

import java.util.ArrayList;

public class DataSiswaPetugas {
    public static String[][] data = new String[][]{
            {"Rofico Ahmad", "Rp.120000"},
            {"Esther Howard","Rp.450000"},
            {"Guy Hawkins","Rp.350000"},
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
