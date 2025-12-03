/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uklsoal6;

/**
 *
 * @author LOQ
 */
import java.util.Scanner;

public class UKLsoal6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input data peminjam
        System.out.print("Masukkan nama peminjam: ");
        String nama = input.nextLine();

        System.out.print("Masukkan judul buku: ");
        String judul = input.nextLine();

        // Validasi kategori
        char kategori;
        while (true) {
            System.out.println("Pilihlah kategori sesuai dengan buku yang kalian pinjam!");
            System.out.println("o Kategori A (Buku Pelajaran / Referensi)"+ "\n" + "o Kategori B (Novel / Komik)\n" + "o Kategori C (Majalah / Buku Umum)");
            System.out.print("Masukkan kategori buku (A/B/C): ");
            kategori = input.next().charAt(0);
            kategori = Character.toUpperCase(kategori); // biar tidak case-sensitive
            if (kategori == 'A' || kategori == 'B' || kategori == 'C') {
                break; // keluar loop jika valid
            } else {
                System.out.println("Kategori tidak valid! Silakan masukkan A, B, atau C.");
            }
        }

        System.out.print("Masukkan lama peminjaman (hari): ");
        int lama = input.nextInt();

        // Tentukan tarif per hari berdasarkan kategori
        int tarifPerHari = 0;
        switch (kategori) {
            case 'A':
                tarifPerHari = 2000;
                break;
            case 'B':
                tarifPerHari = 1500;
                break;
            case 'C':
                tarifPerHari = 1000;
                break;
        }

        // Hitung biaya awal
        int biayaAwal = tarifPerHari * lama;

        // Hitung denda jika lebih dari 7 hari
        int denda = 0;
        if (lama > 7) {
            denda = (lama - 7) * 500;
        }

        // Hitung total biaya
        int totalBiaya = biayaAwal + denda;

        // Output hasil
        System.out.println("\n=== Rincian Peminjaman Buku ===");
        System.out.println("Nama Peminjam       : " + nama);
        System.out.println("Judul Buku          : " + judul);
        System.out.println("Kategori Buku       : " + kategori);
        System.out.println("Lama Peminjaman     : " + lama + " hari");
        System.out.println("Biaya Peminjaman    : Rp " + biayaAwal);
        System.out.println("Denda Keterlambatan : Rp " + denda);
        System.out.println("Total Biaya Akhir   : Rp " + totalBiaya);

        input.close();
    }
}
