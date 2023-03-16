/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/*Faça um programa em java utilizando funções para calcular a area do triangulo, retangulo e quadrado;
Crie a class teste e execute as funções;
//Se possivel faça um encadeamento de if else */

package desafio;

import javax.swing.JOptionPane;


public class Desafio {

   
    void triangulo(){
       try{
           
       int b = Integer.parseInt(JOptionPane.showInputDialog("Digite a base do triângulo: "));
       int a = Integer.parseInt(JOptionPane.showInputDialog("Digite a altura do triângulo: "));
       
       
       int triangulo = (b*a)/2;
       
       JOptionPane.showMessageDialog(null, "A area do triângulo é: " + triangulo);

        } catch (Exception e) {
            System.out.println("Caractere inválido digite novamente");
    }
    
}


    void retangulo(){
         try{
           
       int b = Integer.parseInt(JOptionPane.showInputDialog("Digite a base do retângulo: "));
       int a = Integer.parseInt(JOptionPane.showInputDialog("Digite a altura do retângulo: "));
       
       
       int retangulo = b*a;
       
       JOptionPane.showMessageDialog(null, "A area do retângulo é: " + retangulo);

        } catch (Exception e) {
            System.out.println("Caractere inválido digite novamente");
    }
}
    
    void quadrado(){
         try{
           
       int lado = Integer.parseInt(JOptionPane.showInputDialog("Digite o lado do quadrado: "));
 
       
       int quadrado = lado*lado;
       
       JOptionPane.showMessageDialog(null, "A area do quadrado é: " + quadrado);

        } catch (Exception e) {
            System.out.println("Caractere inválido digite novamente");
    }
} 
    
    
}



