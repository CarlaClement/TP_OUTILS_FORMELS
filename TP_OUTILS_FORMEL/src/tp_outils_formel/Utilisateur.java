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
 
    private static int _id;                         /* id unique : 1000 + index tableau */
    private String _nom;                            /* Nom de l'utilisateur */
    private String _prenom;                         /* Prenom de l'utilisateur */
    private String _adresse;                        /* Adresse de l'utilisateur*/
    private ListeDeComptes _mesComptes;             /* Comptes associés à l'utilisateur */
    private String _password;                        /* Mot de passe pour login */
    int _role;                                      /* Role de l'utilisateur */
    private final Dossier _monDossier;              /* Dossier lié à l'utilisateur */
       
    //COnstructeur

    /**
     *
     */
        public Utilisateur(){
        _mesComptes=new ListeDeComptes(0);
        _id++;
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
    public Utilisateur(int _id, String _nom, String _prenom, String password, String _adresse, int _role) {
        this._mesComptes=new ListeDeComptes(0);
        this._id = _id;
        this._nom = _nom;
        this._prenom = _prenom;
        this._adresse = _adresse;
        this._role = _role;
        this._password = password;
         _monDossier=null;
    }

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
    }
    
    /**
     *
     * @param _montant
     * @param user
     * @param type : vaut 1 si l'emetteur de la demande est créditer, 0 si il est débité
     * @return   0 : Succès
     *          -1 : Montant non mis à jour 
     */
    public int demanderPrelevementComptePricincipal(double _montant, Utilisateur user, boolean type){//int idDuProprietaire)      
        Compte compteUtilisateur2 = user._mesComptes.getComptePrincipal();
        Compte compteMonCompte=this._mesComptes.getComptePrincipal();
        double temp = compteUtilisateur2.getMontantCourant();
        double temp2 = compteMonCompte.getMontantCourant();
        
        if (type ==true){
            compteUtilisateur2.setMontantCourant((temp -_montant));
            compteMonCompte.setMontantCourant((temp2 +_montant));
            if(compteUtilisateur2.getMontantCourant()!= (temp-_montant) || compteMonCompte.getMontantCourant()!= (temp2+_montant)){
                return -1;
            }
        }else{
            compteUtilisateur2.setMontantCourant((temp +_montant));
            compteMonCompte.setMontantCourant((temp2 -_montant));
            if(compteUtilisateur2.getMontantCourant()!= (temp+_montant) || compteMonCompte.getMontantCourant()!= (temp2-_montant)){
                return -1;
            }
        }
         return 0;
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
     * Retourne les principales informatoins sur l'utilisateur
     * @return
     */
    public String recupererInfosUtilisateur(){
        return ("Utilisateur "+ getRole(_role) +", N°"+ Utilisateur._id+" , "+ _nom+" "+_prenom+", adresse : "+_adresse+ " \n"); 
    }
    
    /**
     *
     * @param index
     * @return  0 : Succes
     *          -1 : Fail
     */
    public int supprimerMonCompte(int index){
        int a;
        a=this._mesComptes.supprimerCompte(index);
        if(a!=0){
            return -1;
        }
        return 0;
    }
        
    /**
     *
     * @param nouveauCompte
     * @return  0 : Success
     *          -1 : Fail
     */
    
    public int ajouterCompte(Compte nouveauCompte){
        int a = this._mesComptes.ajouterCompte(nouveauCompte);
        if(a!=0){return -1;}
        return 0;
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
     * Getter du mot de passe
     * @return Mot de passe associé au compte
     */
    public String getPassword(){
        return _password;
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
