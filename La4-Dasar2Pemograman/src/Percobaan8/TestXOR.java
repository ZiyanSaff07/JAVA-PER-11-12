/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan8;

/**
 *
 * @author USER
 */
public class TestXOR {
    public static void main(String[] args) {
       boolean va11 = true;
       boolean va12 = true;
       System.out.println(va11 ^ va12);
       
       va11 = false;
       va12 = true;
       System.out.println(va11 ^ va12);
       
       va11 = false;
       va12 = false;
       System.out.println(va11 ^ va12);
       
       va11 = true;
       va12 = false;
       System.out.println(va11 ^ va12);
    }
}
