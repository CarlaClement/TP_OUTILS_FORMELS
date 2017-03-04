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
 * @author cleme
 */
public class Login extends Scene{
    
    private BooleanProperty isLogged;       /* Etat du login : vrai ou pas */
    private BooleanProperty createAccount; /* Créer un compte : oui ou non */
    private Button btSubmit;                /* Bouton de validation */
    private Button btCreateAccount;         /* Bouton pour créer un compte */
    private Label lblUniqueId;        /* Label de l'id à entrer */
    private Label lblPassword;        /* Password associé */
    
    private TextField inputUsername;        /* Entree utilisateur */
    private PasswordField inputPassword;    /* Entree du Mot de Passe */
    
    ListeUtilisateurs lu;                   /* Liste à tester */
    
    
    public Login() {
        super(new VBox(10), 800, 600);
        
        /* isLogged à False */
        isLogged = new SimpleBooleanProperty();
        isLogged.set(false);
        
        createAccount = new SimpleBooleanProperty();
        createAccount.set(false);
        
        System.out.println("LOGIN : Init");
        Pane item = new Pane(); // Item extends Pane.
        
        /* Initialisation des labels */
        lblUniqueId = new Label("Identifiant unique:");
        lblPassword = new Label("Mot de passe:");
        
        /* Initialisation des inputs */
        btSubmit = new Button("Valider");
        btCreateAccount = new Button("Créer un compte");
        inputUsername = new TextField();
        inputPassword = new PasswordField();
        
        /* Inscription du listener à un appui*/
        btSubmit.setOnAction(listener);
        btCreateAccount.setOnAction(listener);
        
        ((VBox)getRoot()).getChildren().add(item);
        
        /* Ajout des components sur la scene */
        ((VBox)getRoot()).getChildren().add(lblUniqueId);
        ((VBox)getRoot()).getChildren().add(inputUsername);        
        ((VBox)getRoot()).getChildren().add(lblPassword);
        ((VBox)getRoot()).getChildren().add(inputPassword);
        ((VBox)getRoot()).getChildren().add(btSubmit);
        ((VBox)getRoot()).getChildren().add(btCreateAccount);
        
        
    }
    
    public BooleanProperty getLoginState(){
        return isLogged;
    }
    
    public BooleanProperty getCreateAccount(){
        return createAccount;
    }
    
    public void setList(ListeUtilisateurs l){
        lu = l;
    }
    
    public int getUserId(){
        return Integer.parseInt(inputUsername.getText());
    }
    final Alert alerte = new Alert(Alert.AlertType.CONFIRMATION);
    //alerte.initOwner(stage);
    //alert.setContentText(" Mot de passe erroné ! ");
    /**
     * Listener des actions sur boutons
     */
    EventHandler<ActionEvent> listener = (ActionEvent event) -> {
        if(event.getSource() == btSubmit){              /* Si l'appui est sur la validation du login */
            System.out.println("LOGIN : Appui sur submit");
            /* Contrôle des données en input */
            switch(lu.authentificate(Integer.parseInt(inputUsername.getText()), inputPassword.getText())){
                case 0: 
                    System.out.println("LOGIN : Login Ok");
                    isLogged.set(true);
                    break;
                case 1: 
                    System.out.println("LOGIN : Erreur, Mot de passe incorrect");
                    break;
                case -1: 
                    System.out.println("LOGIN : Erreur, Utilisateur inexistant");
                    break;                    
            }
        }
        if(event.getSource()== btCreateAccount){
            createAccount.set(true);
        }
    };
}
