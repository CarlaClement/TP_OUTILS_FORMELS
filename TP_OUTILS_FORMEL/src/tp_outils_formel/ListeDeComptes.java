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
     private int idProprietaire; 

    //Constructeur 
    public ListeDeComptes(){
        _listeDeComptes=new ArrayList<>(); 
        _listeDeComptes.add(_comptePrincipal);
    }
    
    public void ajouterCompte(Compte monCompte){
        _listeDeComptes.add(monCompte); 
    }
    public void supprimerCompte(Compte monCompte){
        _listeDeComptes.remove(monCompte);
    }
    
    // Getters & Setters
    public Compte getComptePrincipal() {
        return _comptePrincipal;
    }

    public void setComptePrincipal(Compte _comptePrincipal) {
        this._comptePrincipal = _comptePrincipal;
    }

    public int getIdProprietaire() {
        return idProprietaire;
    }

    public void setIdProprietaire(int idProprietaire) {
        this.idProprietaire = idProprietaire;
    }
}
