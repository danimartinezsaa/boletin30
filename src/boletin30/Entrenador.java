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
public class Entrenador extends SeleccionFutbol{
    
    int idFederacion;

    public Entrenador(int idFederacion, int id, int edad, String nombre, String apellidos){
        super(id, edad, nombre, apellidos);
        this.idFederacion=idFederacion;
    }

    public int getIdFederacion(){
        return idFederacion;
    }

    public void setIdFederacion(int idFederacion){
        this.idFederacion=idFederacion;
    }

    @Override
    public String toString(){
        return super.toString()+"idFederacion="+idFederacion;
    }
    
    @Override
    public void concentrarse(){
        System.out.println("Se concentra el Entrenador");
    }

    @Override
    public void viajar(){
        System.out.println("Viaja el entrenador");
    }

    @Override
    public void entrenar(){
        System.out.println("Entrena el entrenador");
    }

    @Override
    public void jugarPartido(){
        System.out.println("Juega el entrenador");
    }    
    
    public void planificarEntrenamiento(){
        System.out.println("planificanco entrenamiento");
    }
}
