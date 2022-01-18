package com.android.example.mokletpay.petugas;

import java.util.ArrayList;

public class DataSiswaP {
    public static String[][] data = new String[][]{
            {"Rofico Ahmad", "Rp.120000", "01/06/2021"},
            {"Esther Howard","Rp.450000","01/06/2021"},
            {"Guy Hawkins","Rp.350000","01/06/2021"},
    };

    public static ArrayList<SiswaP> getListDataSiswaP(){
        ArrayList<SiswaP> list = new ArrayList<>();
        for (String[] dataSiswaP : data){
            SiswaP siswap = new SiswaP();
            siswap.setNamaP(dataSiswaP[0]);
            siswap.setNominalP(dataSiswaP[1]);
            siswap.setTanggalP(dataSiswaP[2]);

            list.add(siswap);
        }
        return list;
    }
}
