/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Lenovo GK
 */

import java.util.ArrayList;

public class Perpustakaan {
    // Properties
    private static ArrayList<Buku> koleksiBuku = new ArrayList<>();

    // Method to add a book
    public static void tambahBuku(Buku buku) {
        koleksiBuku.add(buku);
        System.out.println("Buku berhasil ditambahkan!");
    }

    // Method to display all books
    public static void tampilkanSemuaBuku() {
        if (koleksiBuku.isEmpty()) {
            System.out.println("Belum ada buku di perpustakaan.");
        } else {
            System.out.println("Daftar Buku di Perpustakaan:");
            for (Buku buku : koleksiBuku) {
                buku.tampilkanInformasi();
            }
        }
    }

    // Method to remove a book by title
    public static void hapusBuku(String judul) {
        boolean ditemukan = false;
        for (Buku buku : koleksiBuku) {
            if (buku.getJudul().equalsIgnoreCase(judul)) {
                koleksiBuku.remove(buku);
                System.out.println("Buku dengan judul \"" + judul + "\" berhasil dihapus.");
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Buku dengan judul \"" + judul + "\" tidak ditemukan.");
        }
    }

    // Method to search for a book by title
    public static void cariBuku(String judul) {
        boolean ditemukan = false;
        for (Buku buku : koleksiBuku) {
            if (buku.getJudul().equalsIgnoreCase(judul)) {
                System.out.println("Buku ditemukan:");
                buku.tampilkanInformasi();
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Buku dengan judul \"" + judul + "\" tidak ditemukan.");
        }
    }
}
