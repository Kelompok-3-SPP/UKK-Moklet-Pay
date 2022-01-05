package com.android.example.mokletpay.data;

import java.util.ArrayList;

public class SppData {
    public static String[][] data = new String[][]{
            {"2014", "150.000.000"},
            {"2015", "150.000.000"},
            {"2016", "150.000.000"},
            {"2017", "150.000.000"},
            {"2018", "150.000.000"},
            {"2019", "150.000.000"},
            {"2020", "150.000.000"},
            {"2021", "150.000.000"},
    };

    public static ArrayList<Spp> getListDataSpp(){
        ArrayList<Spp> list = new ArrayList<>();
        for (String[] dataSpp : data){
            Spp spp = new Spp();
            spp.setTahun(dataSpp[0]);
            spp.setNominal(dataSpp[1]);

            list.add(spp);
        }
        return list;
    }
}
