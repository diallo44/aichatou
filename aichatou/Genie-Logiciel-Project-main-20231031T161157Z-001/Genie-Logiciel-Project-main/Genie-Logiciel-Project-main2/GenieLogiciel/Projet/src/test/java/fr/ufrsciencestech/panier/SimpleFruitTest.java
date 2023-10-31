/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.ufrsciencestech.panier;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 *
 * @author cristanemir
 */
public class SimpleFruitTest {
    private SimpleFruit simpleFruit;

    @Before
    public void setUp() {
        simpleFruit = new SimpleFruit(0.5, "Brésil");
    }

    @Test
    public void testConstructor() {
        assertEquals(0.5, simpleFruit.getPrix(), 0);
        assertEquals("Brésil", simpleFruit.getOrigine());
    }

    @Test
    public void testIsSeedless() {
        assertFalse(simpleFruit.isSeedless());
    }

    @Test
    public void testToString() {
        assertEquals("Fruit de Brésil a 0.5 euros", simpleFruit.toString());
    }


}
