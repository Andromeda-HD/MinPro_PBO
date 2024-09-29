/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Lenovo GK
 */
public class Buku {
    // Properties
    private String judul;
    private String penulis;
    private String penerbit;

    // Constructor
    public Buku(String judul, String penulis, String penerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.penerbit = penerbit;
    }

    // Getter methods
    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public String getPenerbit() {
        return penerbit;
    }

    // Method to display book information
    public void tampilkanInformasi() {
        System.out.println("Judul Buku   : " + judul);
        System.out.println("Penulis      : " + penulis);
        System.out.println("Penerbit     : " + penerbit);
        System.out.println("-------------------------");
    }
}
