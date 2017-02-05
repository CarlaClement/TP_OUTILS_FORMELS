/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tp_outils_formel;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

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

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    /**
     * Test of ajouterCompte method, of class ListeDeComptes.
     */
    @Test
    public void testAjouterCompte() {
        System.out.println("ajouterCompte");
        Compte monCompte = new Compte(1000300.5648, null, 2);
        ListeDeComptes instance = new ListeDeComptes(2);
        Compte compte = instance.getCompte(0);
        int result = instance.ajouterCompte(monCompte);
        compte = instance.getCompte(1);
        assertEquals(compte, monCompte);
        int expected = 0; 
        assertEquals(result, expected); 
        
        
    }

    /**
     * Test of supprimerCompte method, of class ListeDeComptes.
     */
    @Test
    public void testSupprimerCompte() {
        System.out.println("supprimerCompte");
        Compte monCompte1 = new Compte();
        Compte monCompte2 = new Compte();
        ListeDeComptes instance = new ListeDeComptes(1);
        int expected = 0;
        instance.ajouterCompte(monCompte1);
        instance.ajouterCompte(monCompte2);
        int result = instance.supprimerCompte(1);
        assertEquals(expected, result);
       
    }

    /**
     * Test of setMontantComptePrincipal method, of class ListeDeComptes.
     */
  /*  @Test
    public void testSetMontantComptePrincipal() {
        System.out.println("setMontantComptePrincipal");
        double _montant = 0.0;
        ListeDeComptes instance = null;
        instance.setMontantComptePrincipal(_montant);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
*/
    /**
     * Test of setDonnesComptePrincipal method, of class ListeDeComptes.
     */
  /*  @Test
    public void testSetDonnesComptePrincipal() {
        System.out.println("setDonnesComptePrincipal");
        String _iban = "";
        String _bic = "";
        ListeDeComptes instance = null;
        instance.setDonnesComptePrincipal(_iban, _bic);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
*/
    /**
     * Test of getComptePrincipal method, of class ListeDeComptes.
     */
  /*  @Test
    public void testGetComptePrincipal() {
        System.out.println("getComptePrincipal");
        ListeDeComptes instance = null;
        Compte expResult = null;
        Compte result = instance.getComptePrincipal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
*/
    /**
     * Test of getCompte method, of class ListeDeComptes.
     */
  /*  @Test
    public void testGetCompte() {
        System.out.println("getCompte");
        int index = 0;
        ListeDeComptes instance = null;
        Compte expResult = null;
        Compte result = instance.getCompte(index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
*/
    /**
     * Test of setComptePrincipal method, of class ListeDeComptes.
     */
  /*  @Test
    public void testSetComptePrincipal() {
        System.out.println("setComptePrincipal");
        Compte _comptePrincipal = null;
        ListeDeComptes instance = null;
        instance.setComptePrincipal(_comptePrincipal);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListeComptes method, of class ListeDeComptes.
     *//*
    @Test
    /*public void testGetListeComptes() {
        System.out.println("getListeComptes");
        ListeDeComptes instance = null;
        ArrayList<Compte> expResult = null;
        ArrayList<Compte> result = instance.getListeComptes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
*/
    /**
     * Test of getIdProprietaire method, of class ListeDeComptes.
     */
  /*  @Test
    public void testGetIdProprietaire() {
        System.out.println("getIdProprietaire");
        ListeDeComptes instance = null;
        int expResult = 0;
        int result = instance.getIdProprietaire();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
*/
    /**
     * Test of setIdProprietaire method, of class ListeDeComptes.
     */
  /*  @Test
    public void testSetIdProprietaire() {
        System.out.println("setIdProprietaire");
        int idProprietaire = 0;
        ListeDeComptes instance = null;
        instance.setIdProprietaire(idProprietaire);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
*/
   
 

   

}
