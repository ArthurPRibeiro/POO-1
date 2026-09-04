/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula0309;

public class Lampada {
    
    /*
        Cada lâmpada tem vida util de 5 ciclos
    */
    
    // atributos
    
    public String marca;
    public int potencia; //em watts
    private boolean status;// V/T = acessa F = apagada
    private int contaCiclos;
    public boolean queimada;
    
    public Lampada(){
        status = false;
        contaCiclos = 0;
    }
    
    //métodos
    
    public void ligar(){
        if (verificarLampada()){
            if(!status){
                status = true;
                contaCiclos++;
                System.out.println("A lampada foi ligada");
            } else{
                System.out.println("A lampada ja esta ligada");
            }
        } else {
            System.out.println("A lampada esta queimada");
        }
    }
    
    public void desligar(){
        if(status){
            status = false;
            System.out.println("A lampada foi desligada");
        } else{
            System.out.println("A lampada ja esta desligada");
        }
    }
    
    public void statusLampada(){
        String msg = "A lampada esta";
        if(status){
            System.out.println(msg + " ligada");
        } else{
            System.out.println(msg + " desligada");   
        }
    }
    
    private boolean verificarLampada(){
        if(contaCiclos >= 5){
            return false;
        }
        return true;
    }
    
    
}
