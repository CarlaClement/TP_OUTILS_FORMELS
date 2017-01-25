/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tp_outils_formel;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Administrateur
 */
public class Utilisateur  {
   
    private String _nom; 
    private String _prenom; 
    private String _adresse; 
    private Compte _monCompte; 
    private int _role; 
    
    
    
   
    //COnstructeur
    public Utilisateur(){
        _monCompte = new Compte();
        _nom = ""; 
        _prenom = ""; 
        _adresse=""; 
        _role = Roles.COMMERCANT; //par défaut l'utilisateur est un commercant               
    }
    
    // En fonction de son rôle l'utilisateur accède à différentes fonctionalités 
    //Méthodes globales à tous les utilisateurs: 
    public Facture emettreFacture(String recepteur, double montant){
        Date dateDuJour = new Date(); 
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        return new Facture(dateFormat.format(dateDuJour), montant, recepteur,_nom+_prenom);
        
        //Contrôles
        //Si le récepteur est connu, on associe la facture à son compte 
        /* Checker la base de données utilisateurs */  
    }
    
    // Getters & Setters
    public String getNom() {
        return _nom;
    }

    public void setNom(String _nom) {
        this._nom = _nom;
    }

    public String getPrenom() {
        return _prenom;
    }

    public void setPrenom(String _prenom) {
        this._prenom = _prenom;
    }

    public String getAdresse() {
        return _adresse;
    }

    public void setAdresse(String _adresse) {
        this._adresse = _adresse;
    }

    public Compte getMonCompte() {
        return _monCompte;
    }

    public void setMonCompte(Compte _monCompte) {
        this._monCompte = _monCompte;
    }

    public int getRole() {
        return _role;
    }

    public void setRole(int _role) {
        this._role = _role;
    }
   
    
}
