/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Instancia;
import javax.swing.JOptionPane;

public class teste {
    public static void main(String[] args) {
        try{
            Funcalc chamar = new Funcalc();
       
            Integer op = Integer.parseInt(JOptionPane.showInputDialog("Digite o operador do cálculo:"));

            if(op == 1){
                chamar.soma();
            }else if(op == 2){
                chamar.subtração();
            }else if(op == 3){
                chamar.multiplicacao();
            }else if(op == 4){
                chamar.divisao();
            }else {
                JOptionPane.showMessageDialog(null, "Valor inválido!");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Valor inválido!");
        }
    }
}