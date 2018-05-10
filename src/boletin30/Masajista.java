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
public class Masajista extends SeleccionFutbol{

    String titulacion;
    int aniosExperiencia;

    public String getTitulacion(){
        return titulacion;
    }

    public void setTitulacion(String titulacion){
        this.titulacion=titulacion;
    }

    public int getAniosExperiencia(){
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia){
        this.aniosExperiencia=aniosExperiencia;
    }

    public Masajista(String titulacion, int aniosExperiencia, int id, int edad, String nombre, String apellidos){
        super(id, edad, nombre, apellidos);
        this.titulacion=titulacion;
        this.aniosExperiencia=aniosExperiencia;
    }

    @Override
    public void concentrarse(){
        System.out.println("Se concentra el masajistaa");
    }

    @Override
    public void viajar(){
        System.out.println("Viaja el masajista");
    }

    @Override
    public void entrenar(){
        System.out.println("Entrena el Masajista");
    }

    @Override
    public void jugarPartido(){
        System.out.println("Juega el Masajista");
    }

    @Override
    public String toString(){
        return super.toString()+"titulacion="+titulacion+", aniosExperiencia="+aniosExperiencia;
    }
    
    public void darMasaje(){
        System.out.println("Dando un masaje");
    }
    
}
