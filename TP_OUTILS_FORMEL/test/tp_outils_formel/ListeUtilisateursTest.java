/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_outils_formel;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Carla
 */
public class ListeUtilisateursTest {
    
    public ListeUtilisateursTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of get method, of class ListeUtilisateurs.
     *//*
    @Test
    public void testGet_0args() {
        System.out.println("get");
        ListeUtilisateurs instance = new ListeUtilisateurs();
        ArrayList<Utilisateur> expResult = null;
        ArrayList<Utilisateur> result = instance.get();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of ajouter method, of class ListeUtilisateurs.
     */
    @Test
    public void testAjouter() {
        System.out.println("ajouter");
        Utilisateur u = new Utilisateur(3, "tt", "cc", null, 1);
        ListeUtilisateurs instance = new ListeUtilisateurs();
        int result = instance.ajouter(u);
        int expected =0; 
        assertEquals(expected, result);
    }

    /**
     * Test of get method, of class ListeUtilisateurs.
     */
    /*@Test
    public void testGet_int() {
        System.out.println("get");
        int id = 0;
        ListeUtilisateurs instance = new ListeUtilisateurs();
        Utilisateur expResult = null;
        Utilisateur result = instance.get(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of supprimer method, of class ListeUtilisateurs.
     */
    @Test
    public void testSupprimer() {
        System.out.println("supprimer");
        Utilisateur u = new Utilisateur(3, "tt", "cc", null, 1);
        ListeUtilisateurs instance = new ListeUtilisateurs();
        instance.ajouter(u);
        int expResult = 0;
        int result = instance.supprimer(u);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of nbUtilisateurs method, of class ListeUtilisateurs.
     */
    @Test
    public void testNbUtilisateurs() {
        System.out.println("nbUtilisateurs");
        ListeUtilisateurs instance = new ListeUtilisateurs();
        int expResult = 0;
        int result = instance.nbUtilisateurs();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
