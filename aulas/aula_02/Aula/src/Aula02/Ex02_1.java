package Aula02;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author CAMARGO
 */
public class Ex02_1 {
    public static void main(String[] args) {
        Scanner x = new Scanner (System.in);
        
        System.out.println("Digite o valor de A: ");
        int a = x.nextInt ();
        
        System.out.println("Digite o valor de B: ");
        int b = x.nextInt ();
        
        int soma = a / b;
        System.out.println("O valor da soma é: " + soma);
        
        
    }
}
