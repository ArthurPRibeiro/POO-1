/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula1308;

import java.util.Scanner;

/**
 *
 * @author ifsp
 */
public class Aula1308 {

    public static void main(String[] args) {
        // Imprimir todos os números de 0 a 10
//        for (int i = 0; i <= 10; i++) {
//            System.out.println("resultado: "+i + " Resultado - 10: " + (i-10));
//        }
//        int j;
//        System.out.println(8+9);
//        
//        int i = 0;
//        do {      
//            System.out.println(i + " do");
//            i++;
//        } while (i<=10);

    //imprimir todos os numeros pares de 0 ate o numero informado
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Escolha um numero para que seja listado todos os numeros pares ate ele ");
        int numeroEscolhido = scan.nextInt();
        
        for (int i = 0; i < numeroEscolhido; i+=2) {
                System.out.println(i);
        }
    }
}
