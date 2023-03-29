/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafio;

import javax.swing.JOptionPane;

public class teste {
    public static void main(String[] args) {
        try{
            funcoes chamar = new funcoes();
       
            Integer forma = Integer.parseInt(JOptionPane.showInputDialog("Selecione a forma que quer calcular\n(1 - Quadrado | 2 - Retângulo | 3 - Triângulo)"));

            if(forma == 1){
                chamar.calc_area1();
            }else if(forma == 2){
                chamar.calc_area2();
            }else if(forma == 3){
                chamar.calc_area3();
            }else {
                JOptionPane.showMessageDialog(null, "Valor inválido!");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Valor inválido!");
        }
    }
}
