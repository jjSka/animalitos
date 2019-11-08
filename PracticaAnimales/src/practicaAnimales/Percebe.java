/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaAnimales;

/**
 *
 * @author PC
 */
public class Percebe extends Animal {

    public Percebe(String nombre, int edad) {
        super(nombre, edad);
        habitat=habitat.ACUATICO;
    }

    
    /**
     * Los percebes no se desplazan, se adhieren a una roca
     */
    @Override
    public void desplazar() {
        System.out.println("Está adherido a una roca"); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Nutrición del percebe
     * @param alimento 
     */
    @Override
    public void alimentar(String alimento) {
        System.out.println(this.getNombre() + " mastica y se nutre de " + alimento + "."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
         //To change body of generated methods, choose Tools | Templates.
        return super.toString()+" Es un percebe...";
    }
}
