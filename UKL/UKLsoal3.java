/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uklsoal3;

/**
 *
 * @author LOQ
 */
import java.util.Scanner;
import java.util.Random;
public class UKLsoal3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        
        char[] operators = {'*', '/', '%'};
        boolean lanjut = true;
        while (lanjut){
            int bil1 = rand.nextInt(20) + 1;
            int bil2 = rand.nextInt(19) + 1;
            char op = operators[rand.nextInt(operators.length)];
            
        int jawabanBenar = 0;
        switch (op){
            case '*':
                jawabanBenar = bil1 * bil2;
                break;
            case '/':
                jawabanBenar = bil1 / bil2;
                break;
            case '%':
                jawabanBenar = bil1 % bil2;
                break;
        }
        System.out.print(bil1 + " " + op + " " + bil2 + " = ");
        int jawabanUser = input.nextInt();
        if (jawabanUser == jawabanBenar){
            System.out.println("Benar!!");
        }else{
            System.out.println("Salah! Jawaban yang benar adalah : " + jawabanBenar);
        }
        System.out.print("Mau lanjut kuis? (yes/no) : ");
        String pilihan = input.next();
        if(pilihan.equals("no")){
            lanjut = false;
            System.out.println("Kuis telah selesai!!");
            System.out.println("Terima kasih sudah bermain");
        }
        }
        input.close();
    }
}
