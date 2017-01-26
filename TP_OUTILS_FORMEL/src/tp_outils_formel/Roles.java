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
   public static int COMMERCANT = 0;
   public static int COMPTABLE = 1; 
   public static int CLIENT = 2;
   public static int FOURNISSEUR = 3;
   
   public static String getRole(int i){
    switch (i)   
    {
        case 0:
            return "Commercant"; 
            break;
        case 1: 
            return "Comptable"; 
            break; 
        case 2 :
            return "Client"; 
            break;
        case 3 : 
            return "Fournisseur"; 
            break;
                  
    }
   }
   
}
