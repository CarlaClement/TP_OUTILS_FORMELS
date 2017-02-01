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

/**
 *
 * @author cleme
 * Classe de test de manipulation de la base de données
 * Test de connexion
 * Test de la requête de téléchargement de la base utilisateurs
 */
public class TestBddConnexion {
    private final BddConnexion testConnexion;                                         // Objet à tester
    
    /* Test de connexion */
    public TestBddConnexion(){
        testConnexion =  new BddConnexion();
        ListeUtilisateurs lu;
        try {
            testConnexion.connecter();
            lu = new ListeUtilisateurs(testConnexion.telechargerListeUtilisateurs());
            testConnexion.uploadListeUtisateur(lu.get());
            testConnexion.deconnnecter();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(TestBddConnexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
