package com.android.example.mokletpay.admin;

import java.util.ArrayList;

public class DetailSiswaData {
    public static String[][] data = new String[][]{
            {"Rofico Ahmad", "XII RPL 3"},
            {"Esther Howard","XII RPL 2"},
            {"Guy Hawkins","XII RPL 3"},
    };

    public static ArrayList<DetailSiswaAdmin> getListDetailDataSiswa(){
        ArrayList<com.android.example.mokletpay.admin.DetailSiswaAdmin> list = new ArrayList<>();
        for (String[] dataSiswa : data){
            com.android.example.mokletpay.admin.DetailSiswaAdmin siswa = new com.android.example.mokletpay.admin.DetailSiswaAdmin();
            siswa.setNamaSiswa(dataSiswa[0]);
            siswa.setKelasSiswa(dataSiswa[1]);

            list.add(siswa);
        }
        return list;
    }
}
