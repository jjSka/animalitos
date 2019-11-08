/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testAnimales;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import practicaAnimales.Animal;
import practicaAnimales.Percebe;
import practicaAnimales.Perro;

/**
 *
 * @author PC
 */
public class TestAnimales {

    public TestAnimales() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @Before
    public void setUp() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void creacionAnimales() {
        Animal[] x = {new Perro("Rodríguez", 5, "Corgi"),
            new Percebe("Beirut", 3)};
        x[0].setPeso(12.3f);
        Animal.mostrar(x[0]);
        x[0].alimentar("un ficus");
        x[0].desplazar();
        ((Perro)x[0]).ladrar();
        Animal.mostrar(x[1]);
        x[1].alimentar("torreznos");
        x[1].desplazar();

    }
}
