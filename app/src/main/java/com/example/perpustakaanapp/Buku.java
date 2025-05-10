package com.example.perpustakaanapp;

public class Buku {
    private int gambar;
    private String judul, penulis, genre, tahun, penerbit;

    public Buku(int gambar, String judul, String penulis, String genre, String tahun, String penerbit) {
        this.gambar = gambar;
        this.judul = judul;
        this.penulis = penulis;
        this.genre = genre;
        this.tahun = tahun;
        this.penerbit = penerbit;
    }

    public int getGambar() { return gambar; }
    public String getJudul() { return judul; }
    public String getPenulis() { return penulis; }
    public String getGenre() { return genre; }
    public String getTahun() { return tahun; }
    public String getPenerbit() { return penerbit; }
}
