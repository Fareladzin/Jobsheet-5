/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

/**
 *
 * @author Fareladzin Wibi
 */
public class Kedua {
    static void myMethod() throws
        NumberFormatExpection{
        throw new UnsupportedOperationException("Not supported yet.");
    }
    public static void main(String[] args) throws Exception {
        try{
            String s = "WIBI";
            int i = Integer.parseInt(s);
            System.out.println("int Value "+i);
        }catch(NumberFormatException nfe){
            nfe.printStackTrace();
        }
        
    }
}
