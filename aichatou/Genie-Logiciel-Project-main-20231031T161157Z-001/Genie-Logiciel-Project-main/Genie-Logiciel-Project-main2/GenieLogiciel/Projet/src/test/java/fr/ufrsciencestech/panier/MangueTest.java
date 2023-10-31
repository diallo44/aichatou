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
public class MangueTest {
    private Mangue mangue;

    @Before
    public void setUp() {
        mangue = new Mangue();
    }

    @Test
    public void testConstructor() {
        assertEquals(1.5, mangue.getPrix(), 0);
        assertEquals("Honduras", mangue.getOrigine());
    }

}
