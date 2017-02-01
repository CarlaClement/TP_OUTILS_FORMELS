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

    /**
     *
     */
        public Utilisateur(){
        _mesComptes=new ListeDeComptes(0);
        _id=0;
        _nom = ""; 
        _prenom = ""; 
        _adresse=""; 
        _role = Roles.COMMERCANT; //par défaut l'utilisateur est un commercant              
        _monDossier=null; 
    }

    /**
     *
     * @param _id
     * @param _nom
     * @param _prenom
     * @param _adresse
     * @param _role
     */
    public Utilisateur(int _id, String _nom, String _prenom, String _adresse, int _role) {
        this._mesComptes=new ListeDeComptes(0);
        this._id = _id;
        this._nom = _nom;
        this._prenom = _prenom;
        this._adresse = _adresse;
        this._role = _role;
         _monDossier=null;
    }
    // En fonction de son rôle l'utilisateur accède à différentes fonctionalités 
    //Méthodes globales à tous les utilisateurs: 

    /**
     *
     * @param idRecepteur
     * @param montant
     * @return
     */
        public Facture emettreFacture(int idRecepteur, double montant){
        Date dateDuJour = new Date(); 
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        return new Facture(dateFormat.format(dateDuJour), montant, this._id, idRecepteur);
        
        //Contrôles
        //Si le récepteur est connu, on associe la facture à son compte 
        /* Checker la base de données utilisateurs */  
    }
    
    /**
     *
     * @param _montant
     * @param user
     */
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
    
    /**
     *
     * @return
     */
    public double getMontantComptePrincipal(){
        return this._mesComptes.getComptePrincipal().getMontantCourant();    
    }

    /**
     *
     * @param montant
     */
    public void setMontantComptePrincipal(double montant){
         this._mesComptes.getComptePrincipal().setMontantCourant(montant);    
    }

    /**
     *
     * @return
     */
    public String recupererInfosUtilisateur(){
        return ("Utilisateur "+ getRole(_role) +", N°"+ this._id+" , "+ _nom+" "+_prenom+", adresse : "+_adresse+ " \n"); 
    }
    
    public void supprimerMonCompte(int index){
        this._mesComptes.supprimerCompte(index);
    }
    public void ajouterCompte(Compte nouveauCompte){
        this._mesComptes.ajouterCompte(nouveauCompte);
    }
    // Getters & Setters

    /**
     *
     * @return
     */
        public String getNom() {
        return _nom;
    }

    /**
     *
     * @param _nom
     */
    public void setNom(String _nom) {
        this._nom = _nom;
    }

    /**
     *
     * @return
     */
    public String getPrenom() {
        return _prenom;
    }

    /**
     *
     * @param _prenom
     */
    public void setPrenom(String _prenom) {
        this._prenom = _prenom;
    }

    /**
     *
     * @return
     */
    public String getAdresse() {
        return _adresse;
    }

    /**
     *
     * @param _adresse
     */
    public void setAdresse(String _adresse) {
        this._adresse = _adresse;
    }

    /**
     *
     * @param _role
     * @return
     */
    public String getRole (int _role) {
        return Roles.getStringRole(_role);
    }

    /**
     *
     * @param _role
     */
    public void setRole(int _role) {
        this._role = _role;
    }

    /**
     *
     * @return
     */
    public int getId() {
        return _id;
    }

    /**
     *
     * @param _id
     */
    public void setId(int _id) {
        this._id = _id;
    }

    /**
     *
     * @return
     */
    public ListeDeComptes getMesComptes() {
        return _mesComptes;
    }

    /**
     *
     * @param _mesComptes
     */
    public void setMesComptes(ListeDeComptes _mesComptes) {
        this._mesComptes = _mesComptes;
    }
    
}
