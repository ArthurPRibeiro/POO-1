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
public class Entrada {
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe seu nome:");
        String nome = scan.nextLine();
        System.out.println("Seja bem vindo, " + nome + "!");
        
    }
}
