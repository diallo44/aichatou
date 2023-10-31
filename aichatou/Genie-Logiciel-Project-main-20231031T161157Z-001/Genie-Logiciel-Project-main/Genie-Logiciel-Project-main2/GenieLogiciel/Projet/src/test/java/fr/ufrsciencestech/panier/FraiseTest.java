/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.ufrsciencestech.panier;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 * @author cristanemir
 */
public class FraiseTest {

    private Fraise fraise;

    @Before
    public void setUp() {
        fraise = new Fraise();
    }

    @Test
    public void testConstructor() {
        assertEquals(0.35, fraise.getPrix(), 0);
        assertEquals("Hawai", fraise.getOrigine());
    }

}
