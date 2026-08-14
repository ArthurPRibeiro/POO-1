/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula1308;

/**
 *
 * @author ifsp
 */
public class Primo {
    
    public static void main(String[] args) {
        int num = 4;
        
        boolean primo = true;
        for (int i = 2; i < num; i++) {
            if(num%i == 0){
                primo = false;
            }
        }
        
        if(primo){
            System.out.println("O numero eh primo");
        }else{
            System.out.println("O numero nao eh primo");
        }
    }
}
