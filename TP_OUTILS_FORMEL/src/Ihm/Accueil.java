/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ihm;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import tp_outils_formel.ListeUtilisateurs;

/**
 *
 * @author Carla
 */
public class Accueil extends Scene {
    
    private Button btLogin;                /* Bouton de validation */
    private Button btCreateAccount;         /* Bouton pour créer un compte */
    private Label lblAccueil;
    private BooleanProperty welcomeState;
    //private BooleanProperty toCreateAccount;
    
    public Accueil(){
        super(new VBox(10), 800, 600);
        
        /* toCreateAccount à False */
        welcomeState = new SimpleBooleanProperty();
        welcomeState.set(false);
        
        /* toLogin à False */
       // toLogin = new SimpleBooleanProperty();
        //toLogin.set(false);
        
        System.out.println("ACCUEIL : Init");
        Pane item = new Pane(); // Item extends Pane.
        
         /* Initialisation des labels */
        lblAccueil = new Label("Que souhaitez vous faire  :");
        btCreateAccount = new Button (" Créer un nouveau compte");
        btLogin = new Button (" Se logger");
         /* Inscription du listener à un appui*/
        btCreateAccount.setOnAction(listener);
        btLogin.setOnAction(listener);
        
        ((VBox)getRoot()).getChildren().add(item);
        
        /* Ajout des components sur la scene */
        ((VBox)getRoot()).getChildren().add(lblAccueil);
        ((VBox)getRoot()).getChildren().add(btCreateAccount);
        ((VBox)getRoot()).getChildren().add(btLogin);
    }
    
    public BooleanProperty getwWelcomeState(){
        return welcomeState;
    }
   /* public BooleanProperty getGoToCreateState(){
        return toCreateAccount;
    }*/
    /**
     * Listener des actions sur boutons
     */
    EventHandler<ActionEvent> listener = (ActionEvent event) -> {
        if(event.getSource() == btCreateAccount){     
            System.out.println("ACCUEIL : Appui sur bouton Créer un nouveau compte");
            welcomeState.set(true);
        }
        if(event.getSource() == btLogin){  
            System.out.println("ACCUEIL : Appui sur bouton Se logger");
            welcomeState.set(false);
        }
    };
}


