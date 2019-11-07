/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaanimales;

/**
 *
 * @author PC
 */

//CODE JJ 1/1
public abstract class Animal {
    
    private String nombre;
    private int edad;
    private int peso;
    private Acuatico acuatico;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    public abstract void desplazar();
    
    public String toString(){
        return getNombre()+" "+getEdad()+" "+getPeso();
    }
    //CODE JJ 1/2
}
