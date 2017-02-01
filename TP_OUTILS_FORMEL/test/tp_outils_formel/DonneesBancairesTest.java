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
public class DonneesBancairesTest {
    
    public DonneesBancairesTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getIban method, of class DonneesBancaires.
     */
    @Test
    public void testGetIban() {
        System.out.println("getIban");
        DonneesBancaires instance = new DonneesBancaires ();
            String expResult = ""; 
            String result = instance.getIban();
            assertEquals(expResult, result);
            if(!result.equals(expResult)){
                fail("The testgetIban has failed ");
            }else{
                System.out.println("GetIban Success");
            }
        instance = new DonneesBancaires ("caca", "pipi");
        expResult = "caca";
        result = instance.getIban();
        assertEquals(expResult, result);
        if(!result.equals(expResult)){
            fail("The testgetIban has failed ");
        }else{
            System.out.println("GetIban Success");
        }
    }

    /**
     * Test of setIban method, of class DonneesBancaires.
     */
    @Test
    public void testSetIban() {
        System.out.println("setIban");
        String _iban = "nouvelIbanDeMerde";
        DonneesBancaires instance = new DonneesBancaires();
            instance.setIban(_iban);
            String result = instance.getIban(); 
            if(!result.equals(_iban)){
                fail("The testSetIban has failed at empty donees ");
            }
        instance = new DonneesBancaires("ibanOrigine", "456406bic");
            instance.setIban(_iban);
            result = instance.getIban(); 
            if(!result.equals(_iban)){
                fail("The testSetIban has failed at already filled donnees ");
            }else{
                System.out.println("SetIban Success");
            }
        
    }

    /**
     * Test of getBic method, of class DonneesBancaires.
     */
    @Test
    public void testGetBic() {
        System.out.println("getBic");
        DonneesBancaires instance = new DonneesBancaires();
        String expResult = "";
        String result = instance.getBic();
        assertEquals(expResult, result);
        if(!result.equals(expResult)){
            fail("The testgetIban has failed ");
        }
        instance = new DonneesBancaires("popo", "pwet1232");
        expResult = "pwet1232";
        result = instance.getBic();
        assertEquals(expResult, result);
        if(!result.equals(expResult)){
            fail("The testgetIban has failed ");
        }      
        else{
            System.out.println("GetBic Success");
        }    
    }

    /**
     * Test of setBic method, of class DonneesBancaires.
     */
    @Test
    public void testSetBic() {
        System.out.println("setBic");
        String _bic =" poool"; 
        DonneesBancaires instance = new DonneesBancaires();
            instance.setIban(_bic);
            String result = instance.getIban(); 
            if(!result.equals(_bic)){
                fail("The testSetBic has failed on empty donees ");
            }
        instance = new DonneesBancaires("ibanOrigine", "456406bic");
            instance.setIban(_bic);
            result = instance.getIban(); 
            if(!result.equals(_bic)){
                fail("The testSetBic has failed at already filled donnees ");
            }else{
                System.out.println("SetBic Success");
            }
               
    }
    
}
