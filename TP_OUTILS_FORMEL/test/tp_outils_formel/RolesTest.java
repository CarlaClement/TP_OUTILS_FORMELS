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
public class RolesTest {
    
    public RolesTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getStringRole method, of class Roles.
     */
    @Test
    public void testGetStringRole() {
        System.out.println("getStringRole");
        int i = 0;
            String expResult = "Commercant";
            String result = Roles.getStringRole(i);
               if(!result.equals(expResult)){
               fail("The test case is a prototype.");
           }
         i = 1;
             expResult = "Comptable";
             result = Roles.getStringRole(i);
               if(!result.equals(expResult)){
               fail("The test case is a prototype.");
           }
         i = 2;
             expResult = "Client";
             result = Roles.getStringRole(i);
               if(!result.equals(expResult)){
               fail("The test case is a prototype.");
           }       
         i = 3;
             expResult = "Fournisseur";
             result = Roles.getStringRole(i);
               if(!result.equals(expResult)){
               fail("The test case is a prototype.");
           }       
    }
    
}
