package com.android.example.mokletpay.data;

import java.util.ArrayList;

public class SiswaData {
    public static String[][] data = new String[][]{
            {"Rofico Ahmad", "XII RPL 3"},
            {"Esther Howard","XII RPL 2"},
            {"Guy Hawkins","XII RPL 3"},
    };

    public static ArrayList<Siswa> getListDataSiswa(){
        ArrayList<Siswa> list = new ArrayList<>();
        for (String[] dataSiswa : data){
            Siswa siswa = new Siswa();
            siswa.setNamaSiswa(dataSiswa[0]);
            siswa.setKelasSiswa(dataSiswa[1]);

            list.add(siswa);
        }
        return list;
    }
}
