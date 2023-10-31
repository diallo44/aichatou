/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.ufrsciencestech.panier;

import static junit.framework.Assert.*;
import org.junit.*;

/**
 *
 * @author cristanemir
 */
public class BananeTest {
    private Banane banane;

    @Before
    public void setUp() {
        banane = new Banane(0.5,"Équateur");
    }

    @Test
    public void testConstructor() {
        assertEquals(0.5, banane.getPrix());
        assertEquals("Équateur", banane.getOrigine());
    }


}
