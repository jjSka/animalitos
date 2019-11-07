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

    //CODE JJ 1/2
    //CODE ALO 1/2
    public Acuatico getAcuatico() {
        return this.acuatico;
    }

    public void alimentar(String alimento) {
        System.out.println(this.nombre + " mastica y come " + alimento + ".");
    }

    public static void mostrar(Animal animal) {
        animal.toString();
    }

    @Override
    public String toString() {
        return ("Nombre: " + this.getNombre() + " edad: " + this.getEdad() + " peso: " + this.getPeso() + "kg. Tipo: " + this.getAcuatico());
    }
    //CODE ALO 2/2
    
}
