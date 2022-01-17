package com.android.example.mokletpay.siswa;

import com.android.example.mokletpay.siswa.HistorySiswa;

import java.util.ArrayList;

public class HistorySiswaData {
    public static String[][] data = new String[][]{
            {"Januari", "Rp200.000"},
            {"Januari", "Rp500.000"},
            {"Januari", "Rp200.000"},
            {"Januari", "Rp600.000"},

    };

    public static ArrayList<HistorySiswa> getListDataSiswa(){
        ArrayList<HistorySiswa> list = new ArrayList<>();
        for (String[] dataSiswa : data){
            HistorySiswa siswa = new HistorySiswa();
            siswa.setBulan(dataSiswa[0]);
            siswa.setTanggal(dataSiswa[1]);

            list.add(siswa);
        }
        return list;
    }


}