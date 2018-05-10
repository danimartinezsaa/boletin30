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
public class Futbolista extends SeleccionFutbol{
    
    int dorsal;
    String demarcacion;

    public Futbolista(int dorsal, String demarcacion, int id, int edad, String nombre, String apellidos){
        super(id, edad, nombre, apellidos);
        this.dorsal=dorsal;
        this.demarcacion=demarcacion;
    }

    public int getDorsal(){
        return dorsal;
    }

    public void setDorsal(int dorsal){
        this.dorsal=dorsal;
    }

    public String getDemarcacion(){
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion){
        this.demarcacion=demarcacion;
    }
    
    @Override
    public void concentrarse(){
        System.out.println("Se concentra el Futbilista");
    }

    @Override
    public void viajar(){
        System.out.println("Viaja el Futbolista");
    }

    @Override
    public void entrenar(){
        System.out.println("Entrena el Futbolista");
    }

    @Override
    public void jugarPartido(){
        System.out.println("Juega el Futbolista");
    }    

    @Override
    public String toString(){
        return super.toString()+"dorsal="+dorsal+", demarcacion="+demarcacion;
    }
    
    public void darEntrevista(){
        System.out.println("Dando una entrevista");
    }
}
