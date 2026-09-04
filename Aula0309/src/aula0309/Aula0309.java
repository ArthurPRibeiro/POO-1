/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula0309;

/**
 *
 * @author ifsp
 */
public class Aula0309 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lampada lampadaSala = new Lampada();
        lampadaSala.marca = "Phillips";
        lampadaSala.potencia = 30;
        
        lampadaSala.statusLampada();
        lampadaSala.ligar();
        lampadaSala.statusLampada();
        lampadaSala.desligar();
        lampadaSala.statusLampada();
        
        Pessoa pessoa1 = new Pessoa("Julia");
        
        pessoa1.imprimirNome();
        
        Carro carro1 = new Carro("Volkswagen", "Polo");
        
        carro1.visualizarOdometro();
        carro1.andar(50);
        carro1.andar(50);
        carro1.visualizarOdometro();
        carro1.andar(-5);
        carro1.visualizarOdometro();

    }
    
}
