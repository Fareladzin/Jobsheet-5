/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan4;

import java.util.Scanner;

/**
 *
 * @author Fareladzin Wibi
 */
public class InputMismatchException {
    public static void main(String[] args) {
        //int a = 100;
        System.out.println("Masukan Nilai A ");
        Scanner masukan = new Scanner(System.in);
        int a = masukan.nextInt();
        
        System.out.println("Masukan Nilai B ");
        int c = masukan.nextInt();
        double res = b/c;
        System.out.println("Hasilnyna Adalah "+res);
    }
}
