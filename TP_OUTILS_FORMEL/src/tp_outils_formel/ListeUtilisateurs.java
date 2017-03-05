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
    public ListeUtilisateurs(Utilisateur user){
        _listeUtilisateurs=new ArrayList<>();
        _listeUtilisateurs.add(user);
    }
    
    public ListeUtilisateurs(ArrayList<Utilisateur> liste){
        _listeUtilisateurs = new ArrayList<>();
        liste.forEach((u) -> {
            _listeUtilisateurs.add(u);
        });
    }
    
    /**
     *Getter de la liste 
     * @return
     */
    
    public ArrayList<Utilisateur> get(){
        return _listeUtilisateurs;
    }
    
    /**
     *
     * @param u
     */
    public int ajouter(Utilisateur u){
        boolean a; 
        if(u!=null){
           a= _listeUtilisateurs.add(u);
        }else{return 1;}
        if(a==false){
            return 2;
        }
        return 0; 
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
     * Suppression d'un utilisateur de la liste en fonction de son id
     * @param u
     * @return : 0 : action valide, 1: action non réalisée
     */
    public int supprimer(Utilisateur u){
        System.out.println("Id à supprimer : " + u.getId());
        int a =u.getId(); 
        _listeUtilisateurs.remove(a);
        //return 1;    
        return 0;
    }
    
    /**
     *
     * @return nombre d'utilisateurs dans la liste.
     */
    public int nbUtilisateurs(){
        return _listeUtilisateurs.size();
    }
    
    /**
     * 
     * @param id : id unique
     * @param pwd : password à comparer
     * @return :    0 : Succès
     *              1 : Mot de passe incorrect
     *             -1 : Utilisateur inexistant
     */
    public int authentificate(int id, String pwd){
        
            for(Utilisateur u : _listeUtilisateurs){
            /* Recherche de l'identifiant correspondant */
                if(u.getId() == id){
                    /* Contrôle du Mot de Passe */
                    if(u.getPassword().equals(pwd)){
                        /* Retourne pwd correct */
                        return 0;
                    }
                    else{
                        /* Retourne pwd incorrect */
                        return 1;
                    }
                }
            }
            
        /* Utilisateur  inexistant*/
        return -1;
    }
}
