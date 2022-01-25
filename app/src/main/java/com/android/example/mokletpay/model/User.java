package com.android.example.mokletpay.model;

public class User {

    private int id;
    private String username, nama, level;

    public User(int id, String username, String nama, String level) {
        this.id = id;
        this.username = username;
        this.nama = nama;
        this.level = level;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getNama() {
        return nama;
    }

    public String getLevel() {
        return level;
    }
}