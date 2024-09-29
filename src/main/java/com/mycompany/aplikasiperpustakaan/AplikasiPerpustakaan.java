/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aplikasiperpustakaan;

/**
 *
 * @author Lenovo GK
 */
import java.util.Scanner;
import model.Buku;
import model.Perpustakaan;

public class AplikasiPerpustakaan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== Aplikasi Perpustakaan ===");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Tampilkan Semua Buku");
            System.out.println("3. Cari Buku");
            System.out.println("4. Hapus Buku");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine(); // Mengonsumsi newline

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan judul buku: ");
                    String judul = input.nextLine();
                    System.out.print("Masukkan nama penulis: ");
                    String penulis = input.nextLine();
                    System.out.print("Masukkan penerbit: ");
                    String penerbit = input.nextLine();

                    Buku bukuBaru = new Buku(judul, penulis, penerbit);
                    Perpustakaan.tambahBuku(bukuBaru);
                    break;

                case 2:
                    Perpustakaan.tampilkanSemuaBuku();
                    break;

                case 3:
                    System.out.print("Masukkan judul buku yang ingin dicari: ");
                    String judulCari = input.nextLine();
                    Perpustakaan.cariBuku(judulCari);
                    break;

                case 4:
                    System.out.print("Masukkan judul buku yang ingin dihapus: ");
                    String judulHapus = input.nextLine();
                    Perpustakaan.hapusBuku(judulHapus);
                    break;

                case 5:
                    System.out.println("Terima kasih telah menggunakan aplikasi perpustakaan.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 5);

        input.close();
    }
}