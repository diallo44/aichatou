/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.ufrsciencestech.controller;

import fr.ufrsciencestech.model.Modele;
import fr.ufrsciencestech.panier.Orange;
import fr.ufrsciencestech.view.VueGraphSwing;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertFalse;

/**
 *
 * @author cristanemir
 */
public class ControleurTest {

    // Test the `del()` method.
    @Test
    public void testDel() throws Exception {
        // Create a new Controleur object.
        Controleur controleur = new Controleur();

        // Create a new Modele object.
        Modele modele = new Modele();

        // Set the Modele object on the Controleur object.
        controleur.setModele(modele);

        // Create a new VueGraphSwing object.
        VueGraphSwing vue = new VueGraphSwing();

        // Set the VueGraphSwing object on the Controleur object.
        controleur.setVue(vue);

        // Add a fruit to the panier.
        modele.getPanier().ajout(new Orange());

        // Call the `del()` method.
        controleur.del();

        // Assert that the fruit was removed from the panier.
        assertFalse(modele.getPanier().contains(new Orange()));
    }

    // Test the `clear()` method.
    @Test
    public void testClear() throws Exception {
        // Create a new Controleur object.
        Controleur controleur = new Controleur();

        // Create a new Modele object.
        Modele modele = new Modele();

        // Set the Modele object on the Controleur object.
        controleur.setModele(modele);

        // Create a new VueGraphSwing object.
        VueGraphSwing vue = new VueGraphSwing();

        // Set the VueGraphSwing object on the Controleur object.
        controleur.setVue(vue);

        // Add a fruit to the panier.
        modele.getPanier().ajout(new Orange());

        // Call the `clear()` method.
        controleur.clear();

        // Assert that the panier is empty.
    }

    // Test the `boycotte()` method.


}
