/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin30;

/**
 *
 * @author dani
 */
public class Seleccionador extends SeleccionFutbol{

    public Seleccionador(int id, int edad, String nombre, String apellidos){
        super(id, edad, nombre, apellidos);
    }

    @Override
    public void concentrarse(){
        System.out.println("Se concentra el seleccionador");
    }

    @Override
    public void viajar(){
        System.out.println("viaja el seleccionador");
    }

    @Override
    public void entrenar(){
        System.out.println("Entrena el entrenador");
    }

    @Override
    public void jugarPartido(){
        System.out.println("Juega el entrenador");
    }
    
    public void seleccionarJugador(){
        System.out.println("Seleccionando jugador");
    }
}
