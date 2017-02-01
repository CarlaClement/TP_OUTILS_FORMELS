/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_outils_formel;


import Tests.TestListeUtilisateurs;
import Tests.TestUploadLongueListe;

import javafx.stage.Stage;


/**
 *
 * @author cleme
 */
public class TP_OUTILS_FORMEL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Tests.TestBddConnexion test1 = new TestBddConnexion();
        //TestListeUtilisateurs test2 =  new TestListeUtilisateurs();
        Utilisateur user = new Utilisateur();
        DonneesBancaires donneesTest = new DonneesBancaires("abc", "coco");
        DonneesBancaires donneesTest2 = new DonneesBancaires("abc2", "coco2");
        Compte compteTest = new Compte(18, donneesTest, 1);
        Compte compteTest2 = new Compte(18, donneesTest2, 2);
        user.ajouterCompte(compteTest);
        //user.ajouterCompte(compteTest2);
       

 
    }
    
}
