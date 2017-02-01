/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_outils_formel;

import java.util.ArrayList;

/**
 *
 * @author cleme
 */
public class ListeUtilisateurs {
    private ArrayList<Utilisateur> _listeUtilisateurs;                          // Conteneur de la bdd
    
    /* Constructeur par défaut */

    /**
     *
     */
    
    public ListeUtilisateurs(){
        _listeUtilisateurs = new ArrayList<>();
    }
    
    
    /* Constructeur de la liste, prend une liste comme paramètre */

    /**
     *
     * @param liste
     */
    
    public ListeUtilisateurs(ArrayList<Utilisateur> liste){
        _listeUtilisateurs = new ArrayList<>();
        liste.forEach((u) -> {
            _listeUtilisateurs.add(u);
        });
    }
    
    /* Getter de la liste */

    /**
     *
     * @return
     */
    
    public ArrayList<Utilisateur> get(){
        return _listeUtilisateurs;
    }
    
    /**
     *
     * @param u
     */
    public void ajouter(Utilisateur u){
        _listeUtilisateurs.add(u);
    }
    
    /**
     *
     * @param id
     * @return
     */
    public Utilisateur get(int id){
        return _listeUtilisateurs.get(id);
    }
    
    /**
     *
     * @param u
     * @return
     */
    public boolean supprimer(Utilisateur u){
        System.out.println("Id à supprimer : " + u.getId());
        if(_listeUtilisateurs.remove(u.getId()) != null){
            return true;
        }
        return false;
    }
    
    /**
     *
     * @return
     */
    public int nbUtilisateurs(){
        return _listeUtilisateurs.size();
    }
    
}
