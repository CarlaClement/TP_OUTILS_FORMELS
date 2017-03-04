/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ihm;

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
   
   private TextField inputNom; 
   private TextField inputPrenom; 
   private TextField inputAdresse; 
   
   private Button btSubmit;
   
   public CreateAccount(){
        super(new VBox(10), 800, 600);
        /* isCreated à False */
        isCreated = new SimpleBooleanProperty();
        isCreated.set(false);
        
        System.out.println("CREATION DE COMPTE : Init");
        Pane item = new Pane(); // Item extends Pane.
        
        /* Initialisation des labels */
        lblNom = new Label("Nom:");
        lblPrenom = new Label("Prénom:");
        lblAdresse = new Label("Adresse:");
        
         /* Initialisation des inputs */
        btSubmit = new Button("Créer un compte");
        inputNom = new TextField();
        inputPrenom =new TextField();
        inputAdresse = new TextField();
        
       /* Inscription du listener à un appui*/
      //  btSubmit.setOnAction(listener);
        
       ((VBox)getRoot()).getChildren().add(item);
        // Ajout des components sur la scene 
        ((VBox)getRoot()).getChildren().add(lblNom);
        ((VBox)getRoot()).getChildren().add(inputNom);
        ((VBox)getRoot()).getChildren().add(lblPrenom);
        ((VBox)getRoot()).getChildren().add(inputPrenom);
        ((VBox)getRoot()).getChildren().add(lblAdresse);
        ((VBox)getRoot()).getChildren().add(inputAdresse);
        ((VBox)getRoot()).getChildren().add(btSubmit);
               
    }
   
   EventHandler<ActionEvent> listener = (ActionEvent event) -> {
        if(event.getSource() == btSubmit){     
            System.out.println("Demande de création de compte");
        }
        
   };
   
   public BooleanProperty getCreateAccountState(){
       return isCreated;
   }
}

