/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula0309;

/**
 *
 * @author ifsp
 */
public class Carro {
    public String marca;
    public String modelo;
    public int odometro;
    
    public Carro(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
        odometro = 0;
    }
    
    public void andar( int distancia){
        this.odometro += distancia;
    }
    
    public void visualizarOdometro(){
        System.out.println("A quilometragem atual do carro eh " + odometro + " Km");
    }
}
