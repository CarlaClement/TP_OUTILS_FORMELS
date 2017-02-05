/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tp_outils_formel;

import java.util.ArrayList;

/**
 *
 * @author Administrateur
 */
public class ListeDeComptes {
     private final ArrayList<Compte> _listeDeComptes; 
     private Compte _comptePrincipal; 
     private  int _idProprietaire; 

    //Constructeur 

    /**
     *
     * @param id
     */
        public ListeDeComptes(int id){
        _listeDeComptes=new ArrayList<>(0); 
        _listeDeComptes.add(_comptePrincipal);
        //_comptePrincipal = _listeDeComptes.get(0);
        _idProprietaire=id; 
    }
    
    /**
     *
     * @param monCompte
     * @return 0 : Action validée; 1: le compte passé est nul, 2: la siste de compte n'a pas été allongée donc compte non ajouté, 3: le compte ajouté n'est pas le même
     */
    public int ajouterCompte(Compte monCompte){
        boolean added;
        if(monCompte==null){
            return 1;
        }else{
            added = _listeDeComptes.add(monCompte); 
        }
        if(added != true){
            return 2;
        }
        return 0;
    }

    /**
     *
     * @param monCompte
     * @return 0 : Fonction valide, 1 : compte passé nul, 2 : Liste de taille inchangée = compte non supprimé
     */
    public int supprimerCompte(int index){
        Compte aSupp ;
        if(index==0){
            return 1; // On ne supprime pas le compte principal 
        }else{
            aSupp= _listeDeComptes.get(index);
            _listeDeComptes.remove(index) ;//== false)
        }
        if(_listeDeComptes.get(index)==aSupp)
        {
            return 2;
        }
                
            return 0;
    }
    
    /**
     *
     * @param _montant
     */
    public void setMontantComptePrincipal(double _montant){
        _comptePrincipal.setMontantCourant(_montant);
    }
    
    /**
     *
     * @param _iban
     * @param _bic
     */
    public void setDonnesComptePrincipal(String _iban, String _bic){
        DonneesBancaires mesDonnees;
         mesDonnees = new DonneesBancaires(_iban, _bic);
        _comptePrincipal.setMesDonnesBancaires(mesDonnees);
    }
    // Getters & Setters

    /**
     *
     * @return
     */
        public Compte getComptePrincipal() {
        return _comptePrincipal;
    }

    /**
     *
     * @param index
     * @return
     */
    public Compte getCompte(int index) {
       //id = position dans la liste
        return _listeDeComptes.get(index); 
    }

    /**
     *
     * @param _comptePrincipal
     */
    public void setComptePrincipal(Compte _comptePrincipal) {
        this._comptePrincipal = _comptePrincipal;
    }
    
    /**
     *
     * @return
     */
    public ArrayList<Compte> getListeComptes(){
        return _listeDeComptes; 
    }

    /**
     *
     * @return
     */
    public int getIdProprietaire() {
        return _idProprietaire;
    }

    /**
     *
     * @param idProprietaire
     */
    public void setIdProprietaire(int idProprietaire) {
        _idProprietaire = idProprietaire;
    }
}
