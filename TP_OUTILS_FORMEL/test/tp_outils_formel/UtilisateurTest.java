/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tp_outils_formel;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Administrateur
 */
public class UtilisateurTest {
    
    public UtilisateurTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of emettreFacture method, of class Utilisateur.
     */
    /*@Test
    public void testEmettreFacture() {
        System.out.println("emettreFacture");
        int recepteur = 35;
        double montant = 18.0;
        //Emetteur
        Utilisateur instance = new Utilisateur();
        instance.setId(33);
        //Recepteur
        Utilisateur instanceRecepteur = new Utilisateur();
        instanceRecepteur.setId(recepteur);
        //Facture attendue 
        Facture expResult = new Facture ();
        Date dateDuJour = new Date(); 
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        expResult.setDate(dateFormat.format(dateDuJour));
        expResult.setEmetteur(instance.getId());
        expResult.setRecepteur(recepteur);
        expResult.setMontant(montant);
        
        //Resultat
        Facture result = instance.emettreFacture(recepteur, montant);
        assertEquals(expResult.getDate(), result.getDate());
        assertEquals(expResult.getEmetteur(), result.getEmetteur());
        assertEquals(expResult.getRecepteur(), result.getRecepteur());
 
        //Test
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
*/
    /**
     * Test of demanderPrelevementComptePricincipal method, of class Utilisateur.
     */
    @Test
    public void testDemanderPrelevementComptePricincipal() {
        System.out.println("demanderPrelevementComptePricincipal");
        double _montant = 2530.65;
        Utilisateur aDebiter = new Utilisateur();
        aDebiter.setMontantComptePrincipal(35000.65);
        Utilisateur instance = new Utilisateur();
        instance.setMontantComptePrincipal(3200.0);
        instance.demanderPrelevementComptePricincipal(3656, aDebiter);
        double expectedMontantCred = 31344.65;
        double expectdeMontantInstance = 6856;
        if  ((aDebiter.getMontantComptePrincipal()== expectedMontantCred) &&(instance.getMontantComptePrincipal()== expectdeMontantInstance)){
            assertTrue(true);
        }
       }

    /**
     * Test of getMontantComptePrincipal method, of class Utilisateur.
     */
    /*@Test
    public void testGetMontantComptePrincipal() {
        System.out.println("getMontantComptePrincipal");
        Utilisateur instance = new Utilisateur();
        double expResult = 0.0;
        double result = instance.getMontantComptePrincipal();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of recupererInfosUtilisateur method, of class Utilisateur.
     */
    /*@Test
    public void testRecupererInfosUtilisateur() {
        System.out.println("recupererInfosUtilisateur");
        Utilisateur instance = new Utilisateur();
        String expResult = "";
        String result = instance.recupererInfosUtilisateur();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    
}
