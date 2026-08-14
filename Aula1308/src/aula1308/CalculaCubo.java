/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula1308;

import java.util.Scanner;
import java.lang.Math;


/**
 *
 * @author ifsp
 */
public class CalculaCubo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean continua = true;
        
        while(continua){

            System.out.println("insira um numero: ");
            double numCubo = scan.nextDouble();
            double resposta = Math.pow(numCubo,3);
            System.out.println(numCubo + " ^ 3 = "+ resposta);
            scan.nextLine();
            
                System.out.println("Deseja informar um novo numero? S-Sim N-Nao");
                String informarNum = scan.nextLine();
                if(informarNum.equalsIgnoreCase("n")){
                    continua = false;
                }
        }
    }
}
