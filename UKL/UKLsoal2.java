/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uklsoal2;

/**
 *
 * @author LOQ
 */
import java.util.Scanner;

public class UKLsoal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] pecahan = {100000, 50000, 20000, 10000, 5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};

        System.out.print("Masukkan jumlah uang : ");
        int jumlah = input.nextInt();

        System.out.println("jumlah lembar per uang :");

        for (int p : pecahan) {
            int lembar = jumlah / p;   
            if (lembar > 0) {
                if (p > 500) {
                    System.out.println(lembar + " Lembar " + p);
                } else {
                    System.out.println(lembar + " Koin " + p);
                }
            }

            jumlah = jumlah % p;      
        }

        input.close();
    }
}