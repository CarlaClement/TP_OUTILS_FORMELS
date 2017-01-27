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
 
    private int _id; 
    private String _nom; 
    private String _prenom; 
    private String _adresse; 
    private ListeDeComptes _mesComptes; 
    int _role; 
    private final Dossier _monDossier; 
       
    //COnstructeur
    public Utilisateur(){
        _mesComptes=null;
        _id=0;
        _nom = ""; 
        _prenom = ""; 
        _adresse=""; 
        _role = Roles.COMMERCANT; //par défaut l'utilisateur est un commercant              
        _monDossier=null; 
    }
    public Utilisateur(int _id, String _nom, String _prenom, String _adresse, int _role) {
        this._id = _id;
        this._nom = _nom;
        this._prenom = _prenom;
        this._adresse = _adresse;
        this._role = _role;
         _monDossier=null;
    }
    // En fonction de son rôle l'utilisateur accède à différentes fonctionalités 
    //Méthodes globales à tous les utilisateurs: 
    public Facture emettreFacture(int idRecepteur, double montant){
        Date dateDuJour = new Date(); 
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        return new Facture(dateFormat.format(dateDuJour), montant, this._id, idRecepteur);
        
        //Contrôles
        //Si le récepteur est connu, on associe la facture à son compte 
        /* Checker la base de données utilisateurs */  
    }
    
    public void demanderPrelevementComptePricincipal(double _montant, Utilisateur user){//int idDuProprietaire){
        // Si l'utilisateur est autorisé à prélever
        //if(****************)
        // SI le compte existe
       // Utilisateur aDebiter = new Utilisateur();
        //aDebiter._id=idDuProprietaire; 
        Compte compteADebiter = user._mesComptes.getComptePrincipal();
        double temp = compteADebiter.getMontantCourant(); 
        compteADebiter.setMontantCourant((temp - _montant));
        Compte compteACrediter=this._mesComptes.getComptePrincipal();
        temp = compteACrediter.getMontantCourant(); 
         compteACrediter.setMontantCourant((_montant+temp));
    }
    
    public double getMontantComptePrincipal(){
        return this._mesComptes.getComptePrincipal().getMontantCourant();    
    }
     public void setMontantComptePrincipal(double montant){
         this._mesComptes.getComptePrincipal().setMontantCourant(montant);    
    }
    public String recupererInfosUtilisateur(){
        return ("Utilisateur "+getRole(_role) +", N°"+ this._id+" , "+ _nom+" "+_prenom+", adresse : "+_adresse+ " \n"); 
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

    public String getRole (int _role) {
        return Roles.getStringRole(_role);
    }

    public void setRole(int _role) {
        this._role = _role;
    }
   public int getId() {
        return _id;
    }

    public void setId(int _id) {
        this._id = _id;
    }

    public ListeDeComptes getMesComptes() {
        return _mesComptes;
    }

    public void setMesComptes(ListeDeComptes _mesComptes) {
        this._mesComptes = _mesComptes;
    }
    
}
