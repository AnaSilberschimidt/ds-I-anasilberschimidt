/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;


public class desafio {
    public static void main(String[] args) {
         int a = 0, b = 1, c = 1;
        
        System.out.print(a + "\n " + b + "\n " + c);
        
        while (c < 144) {
            a = b;
            b = c;
            c = a + b;
            System.out.print("\n " + c);
        }
        
        System.out.println(".");
    }
}
