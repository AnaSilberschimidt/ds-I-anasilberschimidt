/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafio;

import javax.swing.JOptionPane;

public class funcoes {
    
    void calc_area1 (){
        double altura = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor da altura:"));
        if(altura<=0){
            JOptionPane.showMessageDialog(null, "Valor de altura inválido!");
            return;
        }
        
        double area = altura*altura;
        
        JOptionPane.showMessageDialog(null, "O valor da área do quadrado é: "+ area); 
    }
    
    void calc_area2 (){
        double altura = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor da altura:"));
        if(altura<=0){
            JOptionPane.showMessageDialog(null, "Valor de altura inválido!");
            return;
        }
        
        double base = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor da base:"));
        if(base<=0){
            JOptionPane.showMessageDialog(null, "Valor de base inválido!");
            return;
        }
        double area = altura*base;
        
        JOptionPane.showMessageDialog(null, "O valor da área do retângulo é: "+ area); 
    }
    
    void calc_area3 (){
        double altura = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor da altura:"));
        if(altura<=0){
            JOptionPane.showMessageDialog(null, "Valor de altura inválido!");
            return;
        }
        
        double base = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor da base:"));
        if(base<=0){
            JOptionPane.showMessageDialog(null, "Valor de base inválido!");
            return;
        }
        
        double area = (altura*base)/2;
        
        JOptionPane.showMessageDialog(null, "O valor da área do triângulo é: "+ area); 
    }
    
}
