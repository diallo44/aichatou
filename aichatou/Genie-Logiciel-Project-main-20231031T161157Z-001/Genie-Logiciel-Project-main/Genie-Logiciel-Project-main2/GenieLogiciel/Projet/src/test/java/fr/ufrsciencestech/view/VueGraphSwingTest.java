/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.ufrsciencestech.view;

import fr.ufrsciencestech.controller.Controleur;
import fr.ufrsciencestech.model.Modele;
import org.junit.Before;
import org.junit.Test;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 *
 * @author cristanemir
 */
public class VueGraphSwingTest {
    private VueGraphSwing vueGraphSwing;

    @Before
    public void setUp() {
        vueGraphSwing = new VueGraphSwing();
    }

    @Test
    public void testInitComponent() {
        // Test that all of the components are initialized
        assertNotNull(vueGraphSwing.getInc());
        assertNotNull(vueGraphSwing.getDec());
        assertNotNull(vueGraphSwing.getReset());
        assertNotNull(vueGraphSwing.getAffiche());
        assertNotNull(vueGraphSwing.getPanierList());
        assertNotNull(vueGraphSwing.getShow());
        assertNotNull(vueGraphSwing.getBoycotte());
        assertNotNull(vueGraphSwing.getCountryList());
    }

    @Test
    public void testAddControleur() {
        // Test that the view can add a controller
        Controleur controleur = new Controleur();
        vueGraphSwing.addControleur(controleur);

        // Test that the controller is listening to the view's buttons
        ActionListener incActionListener = vueGraphSwing.getInc().getActionListeners()[0];
        ActionListener decActionListener = vueGraphSwing.getDec().getActionListeners()[0];
        ActionListener resetActionListener = vueGraphSwing.getReset().getActionListeners()[0];

        assertTrue(incActionListener == controleur);
        assertTrue(decActionListener == controleur);
        assertTrue(resetActionListener == controleur);
    }
/*
    @Test
    public void testUpdate() {
        // Test that the view updates its display when the model changes
        Modele modele = new Modele();
        vueGraphSwing.addObserver(modele);

        // Change the model's counter
        modele.setCompteur(10);

        // Test that the view's display has been updated
        assertEquals("10", vueGraphSwing.getAffiche().getText());
    }

    @Test
    public void testInitPanier() {
        // Test that the view can initialize its panier list
        List<String> fruits = new ArrayList<>();
        fruits.add("Ananas");
        fruits.add("Banane");
        fruits.add("Cerise");

        vueGraphSwing.initPanier(fruits);

        // Test that the panier list is populated with the correct fruits
        JComboBox<String> panierList = vueGraphSwing.getPanierList();
        assertEquals(3, panierList.getItemCount());
        assertEquals("Ananas", panierList.getItemAt(0));
        assertEquals("Banane", panierList.getItemAt(1));
        assertEquals("Cerise", panierList.getItemAt(2));
    }

    @Test
    public void testInitCountries() {
        // Test that the view can initialize its countries list
        List<String> countries = new ArrayList<>();
        countries.add("France");
        countries.add("Italie");
        countries.add("Espagne");

        vueGraphSwing.initCountries(countries);

        // Test that the countries list is populated with the correct countries
        JComboBox<String> countryList = vueGraphSwing.getCountryList();
        assertEquals(3, countryList.getItemCount());
        assertEquals("France", countryList.getItemAt(0));
        assertEquals("Italie", countryList.getItemAt(1));
        assertEquals("Espagne", countryList.getItemAt(2));
    }

    @Test
    public void testGetSelectedPanierItem() {
        // Test that the view can get the selected item in the panier list
        vueGraphSwing.initPanier(new ArrayList<>());
        vueGraphSwing.getPanierList().setSelectedItem("Ananas");

        assertEquals("Ananas", vueGraphSwing.getSelectedPanierItem());
    }

    @Test
    public void testGetSelectedCountryItem() {
        // Test that the view can get the selected item in the countries list
        vueGraphSwing.initCountries(new ArrayList<>());

    }*/
}