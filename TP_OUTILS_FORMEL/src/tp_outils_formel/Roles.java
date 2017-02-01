/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tp_outils_formel;

/**
 *
 * @author Administrateur
 */
public class  Roles {

    /**
     *
     */
    public static int COMMERCANT = 0;
 
    /**
     *
     */
    public static int COMPTABLE = 1; 

    /**
     *
     */
    public static int CLIENT = 2;

    /**
     *
     */
    public static int FOURNISSEUR = 3;
   
    /**
     *
     * @param i
     * @return
     */
    public static String getStringRole(int i){
       String role = " "; 
    switch (i)   
    {
        case 0:
            role= "Commercant"; 
            break;
        case 1: 
             role= "Comptable"; 
            break; 
        case 2 :
             role= "Client"; 
            break;
        case 3 : 
             role= "Fournisseur"; 
            break;    }
    return role;
   }
   
}
