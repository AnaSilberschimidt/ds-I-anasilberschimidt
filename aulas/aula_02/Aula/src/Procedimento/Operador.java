/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Procedimento;

import javax.swing.JOptionPane;

public class Operador {

    void soma() {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor"));
        int soma = a + b;
        JOptionPane.showMessageDialog(null, "O valor da soma é: " + soma);

    }
    
    void subtracao() {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor"));
        int subtracao = a - b;
        JOptionPane.showMessageDialog(null, "O valor da subtração é: " + subtracao);

    }
    
    void divisao() {
        double a = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor"));
        double divisao = a / b;
        JOptionPane.showMessageDialog(null, "O valor da divisão é: " + divisao);

    }
    
     void multi() {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor"));
        int multi = a * b;
        JOptionPane.showMessageDialog(null, "O valor da multiplicação é: " + multi);

    }

}
