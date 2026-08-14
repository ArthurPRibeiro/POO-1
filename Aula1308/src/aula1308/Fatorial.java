/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula1308;

import java.util.Scanner;

/**
 *
 * @author ifsp
 */
public class Fatorial {
    
    public static void main(String[] args) {
        /*
            Fazer um algoritmo para receber um numero e imprimir o fatorial
        desse numero.
        */
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Escreva o numero que deseja saber o fatorial");
        int numFatorial = scan.nextInt();
        int resultado = 1;
        
        for (int i = numFatorial; i >= 1; i--) {
            resultado *= i;
        }
        
        System.out.println("Resultado: " + resultado);
                
        
        
    }
}
