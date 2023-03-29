/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade;

import javax.swing.JOptionPane;

/**
 *
 * @author CAMARGO
 */
public class atividade {
    public static void main(String[] args) {
        Integer lado1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a medida do primeiro lado do triângulo:"));
        Integer lado2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a medida do segundo lado do triângulo:"));
        Integer lado3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a medida do terceiro lado do triângulo:"));
        
        if(lado1 == 0 || lado2 == 0 || lado3 == 0){
            JOptionPane.showMessageDialog(null, "Nenhum dos valores pode ser menor que zero!");
        } else{
            if(lado1 == lado2){
                if(lado2 == lado3){
                    JOptionPane.showMessageDialog(null, "O triângulo é EQUILÁTERO");
                } else{
                    JOptionPane.showMessageDialog(null, "O triângulo é ISÓSCELES");
                }
            } else if (lado1 == lado3){
                JOptionPane.showMessageDialog(null, "O triângulo é ISÓSCELES");
            } else if (lado2 != lado3){
                JOptionPane.showMessageDialog(null, "O triângulo é ESCALENO");
            } else{
                JOptionPane.showMessageDialog(null, "O triângulo é ISÓSCELES");
            }
        }
    }
}
