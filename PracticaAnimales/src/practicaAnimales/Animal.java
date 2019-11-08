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
//CODE JJ 1/1
public abstract class Animal {

    private String nombre;
    private int edad;
    protected float peso; // Precisión de 0.01
    protected Habitat habitat; //Diferentes Habitats posibles

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso= 0.025f;
        this.habitat=Habitat.NO_DEFINIDO;
    }

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

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public abstract void desplazar();

    //CODE JJ 1/2
    //CODE ALO 1/2
    
    public Habitat getAcuatico() {
        return this.habitat;
    }

    /**
     * Alimentación del animal en cuestión
     * @param alimento 
     */
    public void alimentar(String alimento) {
        System.out.println(getNombre() + " mastica y come " + alimento + ".");
    }

    /**
     * Muestra toda la información del animal en cuestión
     * @param animal 
     */
    public static void mostrar(Animal animal) {
        System.out.println(animal.toString());
    }

    @Override
    public String toString() {
        return ("Nombre: " + this.getNombre() + " edad: " + this.getEdad() + " peso: " + this.getPeso() + "kg. Tipo: " + this.getAcuatico());
    }
    //CODE ALO 2/2

}
