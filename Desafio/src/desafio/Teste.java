/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafio;

import javax.swing.JOptionPane;

public class Teste {
    public static void main (String[] args){
        Desafio x = new Desafio();
        

    int escolha = Integer.parseInt(JOptionPane.showInputDialog( "Digite 1 para triângulo, 2 para retângulo ou 3 para quadrado: "));
    
   

            if (escolha == 1) {
                x.triangulo();
            }else if ( escolha == 2){
                x.retangulo();
            }else{
                x.quadrado();
        }
   
    
}
}

