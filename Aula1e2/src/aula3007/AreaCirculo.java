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
public class AreaCirculo {
    public static void main(String[] args) {
        // A = PI * R^2
        
        final double PI = 3.14;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o raio do circulo");
        double raio = scan.nextDouble();
        
        double area = PI * (raio*raio);
        
        System.out.println("A area do circulo eh " + area + ".");
        
        /*
        
        final double PI = 3.14;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o raio do circulo");
        String raio = scan.nextLine();
        
        double r = Double.parseDouble(raio);
        
        double area = PI * (r*r);
        
        System.out.println("A area do circulo eh " + area + ".");
        
        */
        
    }
    
}
