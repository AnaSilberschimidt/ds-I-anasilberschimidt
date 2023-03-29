/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercícios;
import javax.swing.JOptionPane;

public class exercício03 {
    public static void main(String[] args) {
       
        int a = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um valor: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite outro valor: "));
        int soma = a+b;
        int subtracao = a-b;
        int divisao = a/b;
        int multiplicacao = a*b;
        
        JOptionPane.showMessageDialog(null, "O valor da operação é: "+ soma);
    }
    
}
