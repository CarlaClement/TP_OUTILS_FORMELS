/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tp_outils_formel;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Administrateur
 */
public class ListeDeFacturesTest {
    
    public ListeDeFacturesTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of ajouterFacture method, of class ListeDeFactures.
     */
    @Test
    public void testAjouterFacture() {
        System.out.println("ajouterFacture");
        Facture maFacture = new Facture();
        ListeDeFactures instance = new ListeDeFactures();
            instance.ajouterFacture(maFacture);
            assertEquals(maFacture, instance.getFacture(0));
        instance = new ListeDeFactures(maFacture);
            instance.ajouterFacture(maFacture);
            assertEquals(maFacture, instance.getFacture(1));
                
        //fail("The test case is a prototype.");
    }

    /**
     * Test of supprimerFacture method, of class ListeDeFactures.
     */
    @Test
    public void testSupprimerFacture() {
        System.out.println("supprimerFacture");
        Facture maFacture = new Facture();
        ListeDeFactures instance = new ListeDeFactures();
            ListeDeFactures expected = instance;
            instance.ajouterFacture(maFacture);
            instance.supprimerFacture(maFacture);
            assertEquals(instance,expected);
        instance = new ListeDeFactures();
            expected = instance;
            instance.supprimerFacture(maFacture);
            assertEquals(instance,expected);
    }
    
}
