/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tests;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import tp_outils_formel.BddConnexion;
import tp_outils_formel.ListeUtilisateurs;
import tp_outils_formel.Utilisateur;

/**
 *
 * @author cleme
 */
public class TestUploadLongueListe {
    
    public TestUploadLongueListe(){
        ListeUtilisateurs lu = new ListeUtilisateurs();
    
    
        Utilisateur[] utilisateurs = new Utilisateur[50];

        BddConnexion bdd = new BddConnexion();

        for(int i = 0; i < utilisateurs.length; i++){
                utilisateurs[i]= new Utilisateur(i+1, "TestNom"+i+1, "TestPrenom"+i+1, "TestAdresse"+i+1, 0);
                lu.ajouter(utilisateurs[i]);
        }
        
        try {
            bdd.connecter();
            bdd.uploadListeUtisateur(lu.get());
            bdd.deconnnecter();
        } catch (SQLException ex) {
            Logger.getLogger(TestUploadLongueListe.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TestUploadLongueListe.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
