package com.android.example.mokletpay.admin;

import java.util.ArrayList;

public class SppData {
    public static String[][] data = new String[][]{
            {"2021", "150.000.000"},
            {"2020", "150.000.000"},
            {"2019", "150.000.000"},
            {"2018", "150.000.000"},
            {"2017", "150.000.000"},
            {"2016", "150.000.000"},
            {"2015", "150.000.000"},
            {"2014", "150.000.000"},
    };

    public static ArrayList<com.android.example.mokletpay.admin.Spp> getListDataSpp(){
        ArrayList<com.android.example.mokletpay.admin.Spp> list = new ArrayList<>();
        for (String[] dataSpp : data){
            com.android.example.mokletpay.admin.Spp spp = new com.android.example.mokletpay.admin.Spp();
            spp.setTahun(dataSpp[0]);
            spp.setNominal(dataSpp[1]);

            list.add(spp);
        }
        return list;
    }
}
