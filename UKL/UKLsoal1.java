/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uklsoal1;

/**
 *
 * @author LOQ
 */
import java.util.Scanner;

public class UKLsoal1 {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);

        System.out.println("Masukan bilangan : ");
        int bilangan1 = masukan.nextInt();

        boolean prima = true;

       
        if (bilangan1 <= 1) {
            prima = false;
        } else {
            for (int i = 2; i < bilangan1; i++) {
                if (bilangan1 % i == 0) {
                    prima = false;
                    break;
                }
            }
        }

        
        String[] namaAngka = {
            "Nol", "Satu", "Dua", "Tiga", "Empat",
            "Lima", "Enam", "Tujuh", "Delapan", "Sembilan"
        };

        
        String outputBilangan;
        if (bilangan1 < 10 && bilangan1 >= 0) {
            outputBilangan = namaAngka[bilangan1]; 
        } else {
            outputBilangan = String.valueOf(bilangan1); 
        }

        
        if (prima) {
            System.out.println(outputBilangan + " : Bilangan tersebut adalah bilangan Prima");
        } else {
            System.out.println(outputBilangan + " : Bilangan tersebut bukan bilangan Prima");
        }

        masukan.close();
    }
}

  
