/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.ufrsciencestech.utils;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 *
 * @author cristanemir
 */
public class PanierTest {
    @Test
    public void testListClassNamesInPackage() {
        List<String> classNames = ClassLister.listClassNamesInPackage("fr.ufrsciencestech.panier");

        assertTrue(classNames.contains("Ananas"));
        assertTrue(classNames.contains("Banane"));
        assertTrue(classNames.contains("Cerise"));
        assertTrue(classNames.contains("Fraise"));
        assertTrue(classNames.contains("Mangue"));
        assertTrue(classNames.contains("Orange"));
        assertTrue(classNames.contains("SimpleFruit"));

        assertEquals(17, classNames.size());
    }
}
