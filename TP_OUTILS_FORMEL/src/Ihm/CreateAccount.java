/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ihm;

import java.util.ArrayList;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import tp_outils_formel.ListeUtilisateurs;
import tp_outils_formel.Utilisateur;

/**
 *
 * @author Carla
 */
public class CreateAccount extends Scene {
   private BooleanProperty isCreated;
   ListeUtilisateurs lu;                   /* Liste à tester */
  
   private Label lblNom;
   private Label lblPrenom;
   private Label lblAdresse;
   private Label lblRole;
   private Label lblMdp;
   private TextField inputNom; 
   private TextField inputPrenom; 
   private TextField inputAdresse; 
   private TextField inputRole; 
   private TextField inputMdp; 
   
   private Button btSubmit;
   
   public CreateAccount(){
        super(new VBox(10), 800, 600);
        /* isCreated à False */
        isCreated = new SimpleBooleanProperty();
        isCreated.set(false);
        
        System.out.println("CREATION DE COMPTE : Init");
        Pane item = new Pane(); // Item extends Pane.
        
        /* Initialisation des labels */
        lblNom      = new Label("Nom:");
        lblPrenom   = new Label("Prénom:");
        lblAdresse  = new Label("Adresse:");
        lblRole     = new Label("Role: (0 pour commerçant, 1 pour Comptable)");
        lblMdp      = new Label("Mot de passe "); 
         /* Initialisation des inputs */
        btSubmit        = new Button("Créer un compte");
        inputNom        = new TextField();
        inputPrenom     = new TextField();
        inputAdresse    = new TextField();
        inputRole       = new TextField();
        inputMdp        = new TextField();
       /* Inscription du listener à un appui*/
        btSubmit.setOnAction(listener);
        
       ((VBox)getRoot()).getChildren().add(item);
        // Ajout des components sur la scene 
        ((VBox)getRoot()).getChildren().add(lblNom);
        ((VBox)getRoot()).getChildren().add(inputNom);
        ((VBox)getRoot()).getChildren().add(lblPrenom);
        ((VBox)getRoot()).getChildren().add(inputPrenom);
        ((VBox)getRoot()).getChildren().add(lblAdresse);
        ((VBox)getRoot()).getChildren().add(inputAdresse);
        ((VBox)getRoot()).getChildren().add(lblRole);
        ((VBox)getRoot()).getChildren().add(inputRole);
        ((VBox)getRoot()).getChildren().add(lblMdp);
        ((VBox)getRoot()).getChildren().add(inputMdp);
        ((VBox)getRoot()).getChildren().add(btSubmit);
               
    }
   
   public BooleanProperty getCreateAccountState(){
       return isCreated;
   }
   
   public String getNom(){
       return inputNom.getText();
   }
   public String getPrenom(){
       return inputPrenom.getText();
   }
   public String getAdresse(){
       return inputAdresse.getText();
   }
   public String getRole(){
       return inputRole.getText();
   }
   public void setList(ListeUtilisateurs l){
        lu = l;
    }
    public String getMdp(){
       return inputMdp.getText();
   }
    
   public int creerCpte(){
       String nom = getNom();
       if(nom.length()<=2){ 
           System.out.println(" return creer cpte : nom trop court");
           return -1;
       }
       String prenom = getPrenom();
       if(prenom.length()<=2){
           System.out.println(" return creer cpte : prenom trop court");
           return -2;
       }
       String adresse = getAdresse();
       if(adresse.length()<=2){
          System.out.println(" return creer cpte :  adr trop courte");
           return -3;
        }
        int role = Integer.parseInt(getRole());  
        if(role != 0 && role !=1){
           // ERREUR
           System.out.println(" return creer cpte : Mauvais role" );
           return -4;  
        }
        String mdp = getMdp();
        if(mdp.length()<=4){
            System.out.println(" return creer cpte :  Mvais mdp");
            return -5;
        }
       setList(lu);
       int index = lu.nbUtilisateurs();
       
       //System.out.println("taille liste " + index);
       //Utilisateur user = new Utilisateur(index-1,nom,prenom,mdp,adresse,role);
       
       //lu.ajouter(user);
      return 0;
   }
   
   EventHandler<ActionEvent> listener = (ActionEvent event) -> {
        if(event.getSource() == btSubmit){     
            System.out.println("Demande de création de compte");
            creerCpte();
        }
        
   };
   
}
