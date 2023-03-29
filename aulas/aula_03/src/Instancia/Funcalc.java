/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Instancia;
import javax.swing.JOptionPane;

public class Funcalc {
    
    
    void soma (){
        int a = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um valor: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite outro valor: "));
        int soma = a+b;
        
        JOptionPane.showMessageDialog(null, "O valor da soma é: "+ soma); 
    }
    void subtração(){
        int a = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um valor: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite outro valor: "));
        int subtracao = a-b;
        
        JOptionPane.showMessageDialog(null, "O valor da subtração é: "+ subtracao); 
    }
    void divisao (){
        int a = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um valor: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite outro valor: "));
        int divisao = a/b;
        
        JOptionPane.showMessageDialog(null, "O valor da divisão é: "+divisao); 
    }
    void multiplicacao(){
        int a = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um valor: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite outro valor: "));
        int multiplicacao = a*b;
        
        JOptionPane.showMessageDialog(null, "O valor da multiplicação é: "+ multiplicacao); 
    }
}
