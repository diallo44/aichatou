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
public class OrangeTest {
    private Orange orange;

    @Before
    public void setUp() {
        orange = new Orange(0.9,"Etats Unis");
    }

    @Test
    public void testConstructor() {
        assertEquals(0.9, orange.getPrix(),0);
        assertEquals("Etats Unis", orange.getOrigine());
    }
}
