/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */



package aula2708;

public class Aula2708 {
    public static void main(String[] args) {
       
        Pessoa p1 = new Pessoa("Pedro", 90.24, 1.72);
        Pessoa p2 = new Pessoa("Julia", 80.5, 1.62);
        
        p1.quemEh();   
        p1.definirIdade(55);
        System.out.println(p1.pegarIdade());
        p1.aniversario();
        System.out.println(p1.pegarIdade());
        
        System.out.println("\n");
        
        p1.falar("Opa!");
        p2.falar("epa!");
        
        System.out.println("\n");

    }
    
}
