/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tp_outils_formel;

import java.util.ArrayList;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Administrateur
 */
public class ListeDeComptesTest {
    
    public ListeDeComptesTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of ajouterCompte method, of class ListeDeComptes.
     */
    @Test
    public void testAjouterCompte() {
        System.out.println("ajouterCompte");
        Compte monCompte = new Compte(1000300.5648, null, 2);
        ListeDeComptes instance = new ListeDeComptes(2);
        instance.ajouterCompte(monCompte);
        Compte compte = instance.getCompte(1);
        assertEquals(compte, monCompte);
    }

    /**
     * Test of supprimerCompte method, of class ListeDeComptes.
     */
    @Test
    public void testSupprimerCompte() {
        System.out.println("supprimerCompte");
        Compte monCompte = new Compte();
        ListeDeComptes instance = new ListeDeComptes(1);
        ListeDeComptes expected = instance;
        instance.ajouterCompte(monCompte);
        instance.supprimerCompte(monCompte);
        assertEquals(expected, instance);
        // TODO review the generated test code and remove the default call to fail.
    }

   
 

   

}
