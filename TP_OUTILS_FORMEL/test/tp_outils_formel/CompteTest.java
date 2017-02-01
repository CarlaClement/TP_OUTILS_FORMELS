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
public class CompteTest {
    
    public CompteTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of modifierDonneesBancaires method, of class Compte.
     */
    @Test
    public void testModifierDonneesBancaires() {
        System.out.println("modifierDonneesBancaires");
        String _newBic = "cacaBic";
        String _newIban = "pipiIban";
        Compte instance = new Compte();
        instance.modifierDonneesBancaires(_newBic, _newIban);
        DonneesBancaires donnees = instance.getMesDonnesBancaires();
        String result_bic = donnees.getBic(); 
        System.out.println(result_bic);
        String result_iban = donnees.getIban(); 
        if(!result_bic.equals(_newBic)){
            fail ("Bic non mis a jour"); 
        }
        if (!result_iban.equals(_newIban)){
            fail("Iban non mise à jour ");
        }
    }

    /**
     * Test of getMontantCourant method, of class Compte.
     */
    
    @Test
    public void testGetMontantCourant() {
       
    }
    /**
     * Test of setMontantCourant method, of class Compte.
     */
    /*
    @Test
    public void testSetMontantCourant() {
        System.out.println("setMontantCourant");
        double _montantCourant = 0.0;
        Compte instance = new Compte();
        instance.setMontantCourant(_montantCourant);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
*/
    /**
     * Test of getMesDonnesBancaires method, of class Compte.
     */
    
    /*@Test
    public void testGetMesDonnesBancaires() {
        System.out.println("getMesDonnesBancaires");
        Compte instance = new Compte();
        DonneesBancaires expResult = null;
        DonneesBancaires result = instance.getMesDonnesBancaires();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
*/
    /**
     * Test of setMesDonnesBancaires method, of class Compte.
     */
    /*
    @Test
    public void testSetMesDonnesBancaires() {
        System.out.println("setMesDonnesBancaires");
        DonneesBancaires _mesDonnesBancaires = null;
        Compte instance = new Compte();
        instance.setMesDonnesBancaires(_mesDonnesBancaires);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    */
}
