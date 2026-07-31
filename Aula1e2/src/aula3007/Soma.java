/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula3007;

import java.util.Scanner;

/**
 *
 * @author ifsp
 */
public class Soma {
    public static void main(String[] args) {
     /* Algoritmo para ler 2 números e imprimir soma*/
     
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro numero");
        String numero1 = scan.nextLine();
        
        System.out.println("Digite o segundo numero");
        String numero2 = scan.nextLine();
        
        int n1 = Integer.parseInt(numero1);
        
        int n2 = Integer.parseInt(numero2);
        
        int resultado = n1 + n2;
        
        System.out.println("O resultado da soma eh " + resultado);
        
        String valorDeN1 = String.valueOf(n1);
        
        System.out.println(valorDeN1 + 32);
        
        /*
        Conversores de tipos de dados:
        
        String para int: Integer.parseInt(valor);
        
        String para double: double.parseDouble(valor);
        
        String para boolean: Integer.parseBoolean(valor);
        
        Outro para String: String.valueOf(int/double/etc);
        
        */
     
    }
}
