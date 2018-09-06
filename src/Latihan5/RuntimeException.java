/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan5;

/**
 *
 * @author Fareladzin Wibi
 */
public class RuntimeException {
    public static void main(String[] args) {
        int a = 35;
        int b = 0;
        try{
            int x = a/b;
            System.out.println("hasil : "+x);
            int[] angka = {1,2,3,4,5};
            angka[24] = 72;
            int y = x/0;
        }catch(Exception e){
            System.out.println("Salah");
            System.out.println(e);
        }
        System.out.println("Selesai");
    }
}
