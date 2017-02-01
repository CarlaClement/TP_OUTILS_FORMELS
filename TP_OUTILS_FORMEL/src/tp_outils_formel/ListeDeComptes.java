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
    public ListeDeComptes(int id){
        _listeDeComptes=new ArrayList<>(); 
        _listeDeComptes.add(new Compte());
        _comptePrincipal = _listeDeComptes.get(0);
        _idProprietaire=id; 
    }
    
    public void ajouterCompte(Compte monCompte){
        _listeDeComptes.add(monCompte); 
    }
    public void supprimerCompte(Compte monCompte){
        _listeDeComptes.remove(monCompte);
    }
    
    public void setMontantComptePrincipal(double _montant){
        _comptePrincipal.setMontantCourant(_montant);
    }
    
    public void setDonnesComptePrincipal(String _iban, String _bic){
        DonneesBancaires mesDonnees;
         mesDonnees = new DonneesBancaires(_iban, _bic);
        _comptePrincipal.setMesDonnesBancaires(mesDonnees);
    }
    // Getters & Setters
    public Compte getComptePrincipal() {
        return _comptePrincipal;
    }
    public Compte getCompte(int index) {
       //id = position dans la liste
        return _listeDeComptes.get(index); 
    }
    public void setComptePrincipal(Compte _comptePrincipal) {
        this._comptePrincipal = _comptePrincipal;
    }
    
    public ArrayList<Compte> getListeComptes(){
        return _listeDeComptes; 
    }

    public int getIdProprietaire() {
        return _idProprietaire;
    }

    public void setIdProprietaire(int idProprietaire) {
        _idProprietaire = idProprietaire;
    }
}
