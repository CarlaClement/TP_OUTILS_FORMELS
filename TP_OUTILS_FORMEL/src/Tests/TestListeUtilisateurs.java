/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tests;

import tp_outils_formel.ListeUtilisateurs;
import tp_outils_formel.Utilisateur;

/**
 *
 * @author cleme
 */
public class TestListeUtilisateurs {
    public TestListeUtilisateurs(){
        ListeUtilisateurs lu = new ListeUtilisateurs();
        Utilisateur[] nUtilisateurs = new Utilisateur[10];
        
        /* Creation d'un utilisateur */
        Utilisateur user1 = new Utilisateur(1, "TestNom1", "TestPrenom1", "TestAdresse1", 0);
        lu.ajouter(user1);
        
        System.out.println("Nombre d'utilisateur(s) dans la liste : " + lu.nbUtilisateurs());
        
        for(int i = 0; i < nUtilisateurs.length; i++){
            nUtilisateurs[i]= new Utilisateur(i+2, "TestNom"+i+2, "TestPrenom"+i+2, "TestAdresse"+i+2, 0);
            lu.ajouter(nUtilisateurs[i]);
        }
 
        System.out.println("Nombre d'utilisateur(s) dans la liste : " + lu.nbUtilisateurs());
        
        for(Utilisateur u : lu.get()){
            System.out.println("Id: " + u.getId());
        }
        
        
        lu.supprimer(nUtilisateurs[4]);
        System.out.println("Nombre d'utilisateur(s) dans la liste : " + lu.nbUtilisateurs());
        
    }
}
