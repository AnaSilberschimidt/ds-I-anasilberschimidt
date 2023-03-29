/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios;

/**
 *
 * @author CAMARGO
 */
public class Atividade2 {
    void parimpar(){
       
       int pares = 0; 
       int impares = 0;
         for (int i = 0; i<=100; i++){
            if (i % 2 ==0){
                pares += i;
          
            }else {
                impares += i;
                
            }
         }
        System.out.println("O somatório dos pares: " + pares);
        System.out.println("O somatório dos  impares: " + impares);
        if (pares > impares){
            System.out.println("O somatório dos pares é maior  que o somatório dos impares! Sendo ele: " + pares);
        } else if (impares > pares){
            System.out.println("O somatório dos impares é maior  que o somatório dos pares!Sendo ele: " + impares);
        }else {
            System.out.println("O somatório dos pares e impares são iguais!Sendo ele: " + pares);
        }
    }
    
    int a = 0;
        int[] separar(){
            int[]num =new int[2];
            for (int i = 1; i<= a; i++){
                if(i%2==0){
                    num[0] += i; // soma dos pares
                }else {
                    num[1] += i; // soma dos impares
                }
            }
            return num;
        }
}
        
                   
    

