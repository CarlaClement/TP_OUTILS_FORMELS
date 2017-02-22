/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_outils_formel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cleme
 */
public class BddConnexion{
    
    /*
      java.util.Map map = con.getTypeMap();
      map.put("mySchemaName.ATHLETES", Class.forName("Athletes"));
      con.setTypeMap(map);
    Associer une table à une classe
    
    */
    
    
    
    private Connection conn;
    
    /* Constructeur par défaut */

    /**
     *
     */
    
    public BddConnexion(){
    
    }
    
    /**
     *
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public void connecter() throws SQLException, ClassNotFoundException{
        Class.forName("org.h2.Driver");
        conn = DriverManager.getConnection("jdbc:h2:~/test", "admin", "");
        System.out.println("Connecté");
    }
    
    /* Methode qui déconnecte l'objet au serveur de la base de données */

    /**
     *
     * @throws SQLException
     */
    
    public void deconnnecter() throws SQLException{
        /* Nous contrôlons si nous sommes connectés */
        if(conn.isValid(2)){
            conn.close();
            System.err.println("Deconnecté");
        }
        /* Sinon nous ne faisons rien */
    }
    
    /**
     * Créé une nouvelle liste d'utilisateurs 
     * @return Nouvelle base de Données
     * @throws SQLException 
     */
    public ArrayList<Utilisateur> telechargerListeUtilisateurs() throws SQLException{
        /* Allocation de la nouvelle liste */
        ArrayList<Utilisateur> ret = new ArrayList<>();
        
       /* Requête de la Base de Données utilisateurs */
        Statement st = conn.createStatement();
        /* Si la requête est validée, on stocka le résultat dans un "ResultSet" */
        if(st.execute("select * from Utilisateur;")){
            ResultSet res = st.getResultSet();
            /* On parcourt les lignes tant que res.next renvoie vrai */
            while(res.next()){
                /* Création d'un nouvel utilisateur */
                Utilisateur temp;
                temp = new Utilisateur((int)res.getObject(1), (String)res.getObject(2), (String)res.getObject(3), (String)res.getObject(4), 0);
                System.out.println("Téléchargement de l'Utilisateur  n°"+temp.getId());
                
                /* On ajoute l'élément téléchargé */
                ret.add(temp);
                
            }
        }
        /* On renvoi la nouvelle liste */
        return ret;
    }
    
    /**
     * Alimente la liste des utilisateurs à partir de la bdd pour une liste déjà existante
     * @param liste List à alimenter
     * @throws SQLException 
     */
    public void telechargerListeUtilisateurs(ArrayList<Utilisateur> liste) throws SQLException{
        
       /* Requête de la Base de Données utilisateurs */
        Statement st = conn.createStatement();
        /* Si la requête est validée, on stocka le résultat dans un "ResultSet" */
        if(st.execute("select * from Utilisateur;")){
            ResultSet res = st.getResultSet();
            /* On parcourt les lignes tant que res.next renvoie vrai */
            while(res.next()){
                /* Création d'un nouvel utilisateur */
                Utilisateur temp;
                temp = new Utilisateur((int)res.getObject(1), (String)res.getObject(2), (String)res.getObject(3), (String)res.getObject(4), 0);
                System.out.println("Téléchargement de l'Utilisateur  n°"+temp.getId());
                if(liste!=null){
                    liste.add(temp);
                }
            }
        }
    }
    
    /**
     *
     * @param liste
     */
    public void uploadListeUtisateur(ArrayList<Utilisateur> liste){
        if(liste != null){
            
            liste.forEach((Utilisateur u) -> {
                try {
                    PreparedStatement ps = conn.prepareStatement("insert into Utilisateur(id,nom,prenom,adresse) values(?, ?, ?, ?) ;");
                    ps.setInt(1, u.getId());
                    ps.setString(2, u.getNom());
                    ps.setString(3, u.getPrenom());
                    ps.setString(4, u.getAdresse());
                    ps.executeUpdate();
                    System.out.println("Mise en ligne de l'utilisateur " + u.getId());
                } catch (SQLException ex) {
                    System.out.println("Code Erreur : " + ex.getErrorCode());
                    if(ex.getErrorCode() != 23505){
                        Logger.getLogger(BddConnexion.class.getName()).log(Level.SEVERE, null, ex);
                    } 
                }
            });
        }else{
            //Utilisateur test = new Utilisateur(2, "Yoyotte", "Carla", "", 0);
            /* boucle sur chaque élément de la liste d'utilisateur */       
        }
    }
    
}
