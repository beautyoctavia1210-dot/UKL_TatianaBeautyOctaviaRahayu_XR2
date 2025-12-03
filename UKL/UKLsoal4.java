/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uklsoal4;

/**
 *
 * @author LOQ
 */
import java.util.HashSet;
import java.util.Scanner;
public class UKLsoal4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah elemen array : ");
        int n = input.nextInt();
        
        int[] array = new int[n];
        
         for (int i = 0; i < n; i++) {
            System.out.print("Masukkan elemen ke-" + (i + 1) + " : ");
            array[i] = input.nextInt();
        }
                     
        System.out.print("Array : {");
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i]);
            if (i < array.length - 1) System.out.print(", ");
        }
        System.out.println("}");
        
         HashSet<Integer> set = new HashSet<>();
         HashSet<Integer> Duplikat = new HashSet<>();
        
        
        for(int num : array){
            if (!set.add(num)){
                Duplikat.add(num);
            }
        }       
        if (Duplikat.isEmpty()){    
            System.out.println("Array tidak memiliki elemen duplikat.");
        }else{
            System.out.println("Array yang memiliki elemen duplikat : ");
            for (int d : Duplikat){
                System.out.print(d + " ");
            }
            System.out.println();
        }
       input.close();
    }
}
