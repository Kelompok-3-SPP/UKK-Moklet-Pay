package com.android.example.mokletpay;

import java.util.ArrayList;

public class DataSiswa {
    public static String[][] data = new String[][]{
            {"Rofico Ahmad", "Rp.120000", "01/06/2021"},
            {"Esther Howard","Rp.450000","01/06/2021"},
            {"Guy Hawkins","Rp.350000","01/06/2021"},
    };

    public static ArrayList<Siswa> getListDataSiswaP(){
        ArrayList<Siswa> list = new ArrayList<>();
        for (String[] dataSiswaP : data){
            Siswa siswap = new Siswa();
            siswap.setNamaP(dataSiswaP[0]);
            siswap.setNominalP(dataSiswaP[1]);
            siswap.setTanggalP(dataSiswaP[2]);

            list.add(siswap);
        }
        return list;
    }
}
