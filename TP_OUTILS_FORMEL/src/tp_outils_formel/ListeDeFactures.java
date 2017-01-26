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
public class ListeDeFactures{
    private final ArrayList<Facture> _listeFactures; 
    //Constructeur 
    public ListeDeFactures(){
        _listeFactures=new ArrayList<>(); 
    }
    
    public void ajouterFacture(Facture maFacture){
        _listeFactures.add(maFacture); 
    }
     public void supprimerFacture(Facture maFacture){
        _listeFactures.remove(maFacture); 
    }
}
