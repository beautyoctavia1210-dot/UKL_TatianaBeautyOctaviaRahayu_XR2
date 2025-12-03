/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uklsoal5;

/**
 *
 * @author LOQ
 */
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class UKLsoal5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        ArrayList<Integer> riwayatKomputer = new ArrayList<>();
        ArrayList<Integer> riwayatPemain = new ArrayList<>();

        int skorKomputer = 0;
        int skorPemain = 0;

        System.out.println("=== SELAMAT DATANG DIPERMAINAN LEMPAR DADU ===");
        System.out.println("Permainan berakhir jika salah satu mencapai 5 kemenangan.\n");

        while (skorKomputer < 5 && skorPemain < 5) {
            System.out.print("Tekan ENTER untuk melempar dadu...");
            input.nextLine(); 

            int daduKomputer = rand.nextInt(6) + 1;
            int daduPemain = rand.nextInt(6) + 1;

            riwayatKomputer.add(daduKomputer);
            riwayatPemain.add(daduPemain);

            System.out.println("Komputer melempar : " + daduKomputer);
            System.out.println("Pemain melempar : " + daduPemain);

            if (daduKomputer > daduPemain) {
                System.out.println("Komputer menang di ronde ini!");
                skorKomputer++;
            } else if (daduPemain > daduKomputer) {
                System.out.println("Pemain menang di ronde ini!");
                skorPemain++;
            } else {
                System.out.println("Seri!");
            }

            
            System.out.println("Skor sementara -> Komputer: " + skorKomputer + " | Pemain: " + skorPemain);
            System.out.println();
        }

        System.out.println("=== Permainan Selesai ===");
        if (skorKomputer == 5) {
            System.out.println("Pemenangnya adalah Komputer!");
            System.out.println("SEMANGAT TERUS YA!!");
        } else {
            System.out.println("Pemenangnya adalah Pemain!");
            System.out.println("WOW!! KEREN!! SELAMAT YA!!");
        }

        System.out.println("\nRekap semua lemparan:");
        System.out.println("Riwayat lemparan Komputer: " + riwayatKomputer);
        System.out.println("Riwayat lemparan Pemain  : " + riwayatPemain);
        System.out.println("Total kemenangan Komputer: " + skorKomputer);
        System.out.println("Total kemenangan Pemain  : " + skorPemain + "\n");
        System.out.println("Terimakasih sudah bermain >~<");

        input.close();
    }
}