package com.android.example.mokletpay;

import java.util.ArrayList;

public class SiswaData {
    public static String[][] data = new String[][]{
            {"Januari", "Rp200.000"},
            {"Januari", "Rp500.000"},
            {"Januari", "Rp200.000"},
            {"Januari", "Rp600.000"},

    };

    public static ArrayList<Siswa> getListDataSiswa(){
        ArrayList<Siswa> list = new ArrayList<>();
        for (String[] dataSiswa : data){
            Siswa siswa = new Siswa();
            siswa.setBulan(dataSiswa[0]);
            siswa.setTanggal(dataSiswa[1]);

            list.add(siswa);
        }
        return list;
    }


}
