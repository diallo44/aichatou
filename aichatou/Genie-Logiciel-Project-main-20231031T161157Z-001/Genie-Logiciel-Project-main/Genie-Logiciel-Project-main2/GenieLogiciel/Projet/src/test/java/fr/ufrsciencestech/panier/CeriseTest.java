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
public class CeriseTest {

    private Cerise cerise;

    @Before
    public void setUp() {
        cerise = new Cerise();
    }

    @Test
    public void testConstructor() {
        assertEquals(0.6, cerise.getPrix(), 0);
        assertEquals("Italie", cerise.getOrigine());
    }

}
