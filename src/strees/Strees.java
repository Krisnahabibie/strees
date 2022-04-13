/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package strees;

import java.util.Scanner;

/**
 *
 * @author krisn
 */
public class Strees {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int no1,no2;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("akan di berikan dua angka,silahkan tentukan angka mana yang lebih besar");
        //System.out.println("masukkan angka pertama");
        no1= input.nextInt();
        System.out.println("masukkan angka kedua");
        no2 = input.nextInt();
        
        if (no1>no2 ){
            System.out.println(no1);
        } else if (no2>no1){
            System.out.println(no2);
        
        }
            
    }

}
