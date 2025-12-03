/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uklsoal7;

/**
 *
 * @author LOQ
 */
import java.util.Scanner;
public class UKLsoal7{
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah jenis cookies yang ingin dihitung: ");
        int n = input.nextInt();
        input.nextLine(); // membersihkan buffer

        // Array untuk menyimpan data
        String[] namaCookies = new String[n];
        int[] hargaProduksi = new int[n];
        int[] hargaJual = new int[n];
        int[] jumlahTerjual = new int[n];
        int[] biayaProduksi = new int[n];
        int[] pendapatan = new int[n];
        int[] labaRugi = new int[n];
        String[] status = new String[n];

        int totalLabaRugi = 0;
        int labaTertinggi = Integer.MIN_VALUE;
        String cookiesLabaTertinggi = "";

        // Input data cookies
        for (int i = 0; i < n; i++) {
            System.out.println("\nData cookies ke-" + (i + 1));
            System.out.print("Nama cookies: ");
            namaCookies[i] = input.nextLine();

            System.out.print("Harga produksi per bungkus: ");
            hargaProduksi[i] = input.nextInt();

            System.out.print("Harga jual per bungkus: ");
            hargaJual[i] = input.nextInt();

            System.out.print("Jumlah terjual: ");
            jumlahTerjual[i] = input.nextInt();
            input.nextLine(); // membersihkan buffer

            // Hitung biaya, pendapatan, laba/rugi
            biayaProduksi[i] = hargaProduksi[i] * jumlahTerjual[i];
            pendapatan[i] = hargaJual[i] * jumlahTerjual[i];
            labaRugi[i] = pendapatan[i] - biayaProduksi[i];

            // Tentukan status
            if (labaRugi[i] > 0) {
                status[i] = "Laba";
            } else if (labaRugi[i] < 0) {
                status[i] = "Rugi";
            } else {
                status[i] = "Impas";
            }

            // Tambahkan ke total
            totalLabaRugi += labaRugi[i];

            // Cek laba tertinggi
            if (labaRugi[i] > labaTertinggi) {
                labaTertinggi = labaRugi[i];
                cookiesLabaTertinggi = namaCookies[i];
            }
        }

        // Output tabel hasil
        System.out.println("\n=== Analisis Laba/Rugi JoyoCookiesBakery ===");
        System.out.printf("%-20s %-15s %-15s %-15s %-15s %-15s %-10s\n",
                "Nama Cookies", "Biaya Produksi", "Pendapatan", "Laba/Rugi", "Status", "Harga Produksi", "Jumlah");
        for (int i = 0; i < n; i++) {
            System.out.printf("%-20s Rp%-14d Rp%-14d Rp%-14d %-15s Rp%-14d %-10d\n",
                    namaCookies[i], biayaProduksi[i], pendapatan[i], labaRugi[i], status[i], hargaProduksi[i], jumlahTerjual[i]);
        }

        // Total keseluruhan
        System.out.println("\nTotal Laba/Rugi Keseluruhan: Rp " + totalLabaRugi);

        // Cookies dengan laba tertinggi
        System.out.println("Cookies dengan laba tertinggi: " + cookiesLabaTertinggi + " (Rp " + labaTertinggi + ")");

        input.close();
    }
}
