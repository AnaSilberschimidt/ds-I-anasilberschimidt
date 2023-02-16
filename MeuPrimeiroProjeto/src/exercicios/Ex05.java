/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;

/*Faça um algoritmo que calcule a area de um triangulo
 */
import java.util.Scanner;

public class Ex05 {
   public static void main (String[] args){
        
     Scanner x = new Scanner(System.in);
     
     double b, h;
     
     System.out.println("Digite o valor da base do triângulo: ");
     b = x.nextDouble();
     
     
     System.out.println("Digite o valor da altura do triângulo: ");
     h = x.nextDouble();
     
     double area = (b*h)/2;
  
     System.out.println("O valor da área do triângulo é :  " + area);
   }
}
