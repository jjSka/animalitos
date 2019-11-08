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
public class Perro extends Animal {

    private String raza;

    public Perro(String nombre, int edad, String raza) {
        super(nombre, edad);
        this.raza = raza;
        this.habitat=Habitat.TERRESTRE;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public void desplazar() {
        System.out.println(getNombre() + " corre contento");
    }

    public void ladrar() {
        System.out.println(getNombre() + " dice 'Guau guau guau!");
    }

    @Override
    public String toString() {
        return ("Nombre: " + this.getNombre() + " es un perro; edad: " + this.getEdad() + " peso: " + this.getPeso() + "kg. Raza:"+this.getRaza()+" Tipo: " + this.habitat);
    }
}
