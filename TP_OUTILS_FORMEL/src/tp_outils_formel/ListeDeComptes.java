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
        _comptePrincipal = new Compte();
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
     * @return   0 : Fonction valide, 
     *          -1 : Compte passé nul, 
     *          -2 : Liste de taille inchangée = compte non supprimé
     */
    public int supprimerCompte(int index){
        Compte aSupp ;
        if(index==0){
            return -1; // On ne supprime pas le compte principal 
        }else{
            aSupp= _listeDeComptes.get(index);
            _listeDeComptes.remove(index) ;//== false)
        }
        if(_listeDeComptes.get(index)==aSupp)
        {
            return -2;
        }
                
            return 0;
    }
    
    /**
     *
     * @param _montant
     * @return  0: Success
     *          1 : Montant non mis à jour
     */
    public int setMontantComptePrincipal(double _montant){
        _comptePrincipal.setMontantCourant(_montant);
        if(_comptePrincipal.getMontantCourant()!=_montant){
            return -1;
        }
        return 0;
    }
    
    /**
     *
     * @param _iban
     * @param _bic
     * @return  0 : Succès
     *          -1 : Donnees non mises à jour
     */
    public int setDonnesComptePrincipal(String _iban, String _bic){
        DonneesBancaires mesDonnees;
         mesDonnees = new DonneesBancaires(_iban, _bic);
        _comptePrincipal.setMesDonnesBancaires(mesDonnees);
        DonneesBancaires donnees = _comptePrincipal.getMesDonnesBancaires(); 
        if (((donnees.getIban())!=_iban) || (donnees.getBic() != _bic)) {
            return -1;
        }
            return 0; 
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
    public int setComptePrincipal(Compte _comptePrincipal) {
        this._comptePrincipal = _comptePrincipal;
        return 0;
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
