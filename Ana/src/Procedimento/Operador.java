/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Procedimento;

import javax.swing.JOptionPane;

public class Operador {
    
    void soma(){
        
      int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o Valor de A: "));
      int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o Valor de B: "));
      int soma = a + b;
      JOptionPane.showMessageDialog(null, "O valor da soma é: " + soma);
    }
    
    void subtracao(){
        
      int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o Valor de A: "));
      int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o Valor de B: "));
      int sub = a - b;
      JOptionPane.showMessageDialog(null, "O valor da subtração é: " + sub);
    }
    
    void multiplicacao(){
        
      double a = Integer.parseInt(JOptionPane.showInputDialog("Digite o Valor de A: "));
      double b = Integer.parseInt(JOptionPane.showInputDialog("Digite o Valor de B: "));
      double mult = a * b;
      JOptionPane.showMessageDialog(null, "O valor da multiplicação é: " + mult);
    }
    
     void divisao(){
        
      double a = Integer.parseInt(JOptionPane.showInputDialog("Digite o Valor de A: "));
      double b = Integer.parseInt(JOptionPane.showInputDialog("Digite o Valor de B: "));
      double div = a / b;
      JOptionPane.showMessageDialog(null, "O valor da divisão é: " + div);
    }
    
}
