/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade;

/**
 *
 * @author CAMARGO
 */
public class Atividade {

      void funcao() {

        int par = 0;
        int im = 0;

        for (int i = 1; i < 101; i++) {
            if (i % 2 == 0) {
                par = i + par;
            } else {
                im = i + im;
            }
        }

        System.out.println("Soma dos numeros pares: " + par);
        System.out.println("Soma dos numeros impares: " + im);

        if (par > im) {
            System.out.println("A soma dos numeros pares é maior");
        } else {
            System.out.println("A soma dos numeros impares é maior");
        }
    }

}
