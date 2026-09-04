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
    private String marca;
    private String modelo;
    private int odometro;
    
    public Carro(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
        this.odometro = 0;
    }
    
    public void andar( int distancia){
        if (distancia <=0 ){
            System.out.println("Valor invalido!");
        }
        odometro += distancia;
        System.out.println("O carro " + marca + "/" + modelo + " andou " + distancia + " Km");
    }
    
    public void visualizarOdometro(){
        System.out.println("A quilometragem atual do carro eh " + odometro + " Km");
    }
}
