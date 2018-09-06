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
public class Pertama {
    static void myMethod() throws
        ClassNotFoundException{
        throw new ClassNotFoundException("Just a Demo");
    }
    }
class ThrowsDemo{
    public static void main(String[] args) {
        try{
            Pertama.myMethod();
            
        }catch(ClassNotFoundException e){
            System.out.println(e);
        }
    }
}

