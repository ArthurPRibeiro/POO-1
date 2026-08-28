/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula2708;

public class Pessoa {
    //atributos
    public String nome;
    public double peso;
    public double altura;
    private int idade = 0;
    
        public Pessoa(
            
            String nome, 
            double peso, 
            double altura
    )
    {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }
    
    //métodos
    
    public void quemEh(){
        System.out.println("O nome dessa pessoa eh "+nome+ ", Pesa " + peso+ ", tem " + altura + " M de altura e " + idade + " anos de idade.");
    }
    
    public void definirIdade(int idade){
        if(this.idade == 0){
            this.idade = idade;
        } else{          
            System.out.println("Não pode definir a idade mais de uma vez");
        }
    }
    
    public int pegarIdade(){
        return idade;
    }
    
    public void aniversario(){        
        idade++;
        System.out.println(nome + " fez aniversario!!");
    }
    
    public void falar(String mensagem){
        System.out.println(nome + ": " + mensagem);
    }
}
