/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package fr.ufrsciencestech.panier;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class AnanasTest {
    @Test
    public void testConstructorWithNoArgs() {
        Ananas ananas = new Ananas();

        assertEquals(0.5, ananas.getPrix(), 0);
        assertEquals("Brésil", ananas.getOrigine());
    }

    @Test
    public void testConstructorWithArgs() {
        Ananas ananas = new Ananas(1.0, "France");

        assertEquals(1.0, ananas.getPrix(), 0);
        assertEquals("France", ananas.getOrigine());
    }

    @Test
    public void testToString() {
        Ananas ananas = new Ananas();

        assertEquals("Ananas du Brésil à 0.5 €", ananas.toString());
    }
}
