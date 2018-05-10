/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin30;

import java.util.ArrayList;

/**
 *
 * @author dani
 */
public class Boletin30{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        SeleccionFutbol futbolista=new Futbolista(1,"portero",1,19,"Daniel","Martínez");
        SeleccionFutbol masajista=new Masajista("Masajista",20,2,44,"Javier","López");
        SeleccionFutbol entrenador=new Entrenador(1234,3,55,"Vicente","Del Bosque");
        
        ArrayList<SeleccionFutbol> seleccion=new ArrayList();
        seleccion.add(futbolista);
        seleccion.add(masajista);
        seleccion.add(entrenador);
         
        
        for(SeleccionFutbol elemento:seleccion){
            System.out.println(elemento.toString());
        }
        
    }
    
}
