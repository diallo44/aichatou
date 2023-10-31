/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.ufrsciencestech.model;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 *
 * @author cristanemir
 */

public class ModeleTest {

  @Test
  public void testSetInfoEmptyString() {
    Modele modele = new Modele();

    modele.setInfo("");

    assertEquals("", modele.getInfo());
  }

  @Test
  public void testSetInfoChooseCountry() {
    Modele modele = new Modele();

    modele.setInfo("Choisissez un pays");

    assertEquals("Vous n'avez sélectionner aucun pays !!!", modele.getInfo());
  }
  @Test
  public void testSetInfoChooseFruit() {
    Modele modele = new Modele();

    modele.setInfo("Choisissez un fruit");

    assertEquals("Vous n'avez sélectionner aucun fruit !!!", modele.getInfo());
  }
  @Test
  public void testSetInfoBoycottCountry() {
    Modele modele = new Modele();

    modele.setInfo("France");

    assertEquals("France a été boycotté", modele.getInfo());
  }
}
