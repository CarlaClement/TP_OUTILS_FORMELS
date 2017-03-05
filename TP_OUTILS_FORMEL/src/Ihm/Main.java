/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ihm;

import java.util.ArrayList;
import javafx.application.Application;
import javafx.beans.property.BooleanProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import tp_outils_formel.ListeUtilisateurs;
import tp_outils_formel.Utilisateur;

/**
 *
 * @author Administrateur
 */
public class Main extends Application {
    
    /* Fenetre principale */
    Stage MainStage;                                       
    
    /* Liste des Utilisateurs */
    private ListeUtilisateurs lu;                                               

    /* Fenetre de login */
    private Login loginScene;
    private Accueil accueilScene;
    /*Fenetre de création de compte */
    private CreateAccount createAccountScene;
    
    /* Etat du login */
    private BooleanProperty loginState;
    private BooleanProperty createAccountState;
    private BooleanProperty welcomeState;
    private int nextState =0;
    
    /* Fenetre de travail */
    private MainScreen mainScreen;
    
    public static void main(String[] args) {
        System.out.println("Main method inside Thread : " + Thread.currentThread().getName());
        launch(args);
    }

    /**
     *
     * @param args
     */
    @Override
    public void start(Stage args) {

        /* Fenetre principale */
        MainStage = args;
        
        /* TEMPORAIRE */
        /* Création d'une liste d'utilisateur */
        
        ArrayList<Utilisateur> liste=new ArrayList<>();
        liste.add(new Utilisateur(1001, "DOREAU", "Clément", "test", "Paris", 1));
        liste.add(new Utilisateur(2, "YOYOTTE", "Carla", "Mdp", "Tours", 0));
        lu = new ListeUtilisateurs(liste);
        int index = lu.nbUtilisateurs();
       System.out.println("taille liste " + index);
        /*Afficer la page d'accueil */
        if(welcomeState == null){
        accueilScene = new Accueil();
        welcomeState=accueilScene.getWelcomeState();
        welcomeState.addListener(welcomeListener);
        nextState=accueilScene.getToNextState();
        args.setScene(accueilScene);
        }
        /* Si l'utilisateur veut se logger pas loggué */
        /* On ouvre la fenêtre de login avec la liste à tester */
        if (nextState == 1 ) {
            // Fenetre de login 
            loginScene = new Login();
            loginScene.setList(lu);
            loginState = loginScene.getLoginState();
            loginState.addListener(loginListener);
            args.setScene(loginScene);
            
        }
        /*
        // Si l'utilisateur veut créer un compte 
        else if(nextState == 2){
           // Fenêtre de création de compte 
            createAccountScene = new CreateAccount(); 
            args.setScene(createAccountScene);
            createAccountScene.setList(lu);
            createAccountState = createAccountScene.getCreateAccountState(); 
        }*/
        args.setTitle("Bienvenu sur BestGest ! ");
        MainStage.show();

    }
    
    ChangeListener<Boolean> loginListener = new ChangeListener<Boolean>() {
        @Override
        public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
            System.out.println("Main : Logged");
            mainScreen = new MainScreen();
            MainStage.setScene(mainScreen);
            mainScreen.setCurrentUser(lu.get(loginScene.getUserId()-1000));
            MainStage.show();
        }
    };
    
    ChangeListener<Boolean> welcomeListener = new ChangeListener<Boolean>() {
        @Override
        public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
            System.out.println("Main : Create account");
            createAccountScene = new CreateAccount();
            MainStage.setScene(createAccountScene);
            //createAccountScene.setCurrentUser(lu.get(loginScene.getUserId()-1000));
            MainStage.show();
        }
    };

}
