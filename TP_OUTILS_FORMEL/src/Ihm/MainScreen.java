/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ihm;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import tp_outils_formel.Facture;
import tp_outils_formel.Utilisateur;

/**
 *
 * @author cleme
 */
public class MainScreen extends Scene{
    
    /* Utilisateur courant */
    Utilisateur currentUser;
    
    /* Barre de menu */
    
    /* Layout à onglets */
    TabPane layoutTabs;
    
    
    /**
     *  FACTURES
     */
    /* Onglet Factures */
    Tab invoicesTab;
    /* Layout Vertical */
    /* Région Gauche : Affichage de la liste des Factures */
    Pane invoicesView;
    
    /* Liste des Factures */
    ListView<Facture> invoicesList;
    
    /* Région droite : Affichage des contrôles liées aux Factures */
    Pane invoicesControl = new Pane();
    
    /**
     *  STOCK
     */
    /* Onglet Stock */
    Tab inventoryTab = new Tab("Stock");
    
    public MainScreen() {
        super(new VBox(), 800, 600);
        
        /* Init du Menu supérieur */
        
        /* Init de la liste list view */
        initListView();
        
        /* Init de la view d'affichage des Factures */
        initInvoicesView();
        
        /* Init de la view d'affichage des contrôles des Factures */
        initInvoicesControl();
        
        /* Init de l'onglet des Factures */
        initInvoicesTab();
        
        /* Init du Layout */
        initLayoutTab();
               
        /* Integration du Layout */
        ((VBox)getRoot()).getChildren().add(layoutTabs);
        
    }
    
    /**
     * Affecte l'adresse de l'utilisateur courant 
     * @param u : référence vers l'utilisateur
     */
    public void setCurrentUser(Utilisateur u){
        currentUser = u;
    }
    
    /**
     * Initialisation du conteneur des onglets
     * Ajustement des dimensions à la taille de la fenêtre
     */
    private void initLayoutTab(){
        layoutTabs = new TabPane(invoicesTab, inventoryTab);
        
        /* Ajustement de la taille à la fenêtre */
        layoutTabs.resize(widthProperty().get(), heightProperty().get());
    }
    
    /**
     * Initalisation de l'onglet Factures
     * Ajout des vues : Conteneur de la liste & Contrôle
     */
    private void initInvoicesTab(){
        /* Instanciation */
        invoicesTab = new Tab("Factures");
        
         /* Ajout de l'onglet Facture*/
        invoicesTab.setContent(invoicesView);
    }
    
    /**
     * Initialisation de l'onglet de vue des factures : Conteneur de la liste 
     * Ajustement des dimensions : Hauteur max, largeur de la page /2
     * Ajout de la liste dans la vue
     */
    private void initInvoicesView(){
        /* Instanciation de la vue */
        invoicesView = new Pane();
        
        /* Affichage de la vue sur la partie gauche de l'affichage */
        invoicesView.setMinSize(widthProperty().get()/2, heightProperty().get());
        invoicesView.setMaxSize(widthProperty().get()/2, heightProperty().get());
        /* Affichage d'un séparateur */
        invoicesView.setStyle("-fx-border-color:  black;\n");
        
        /* Ajout de la liste dans la view */
        invoicesView.getChildren().add(invoicesList);
    }
    
    /**
     * Initialisation de la page des contrôles des factures
     * Instanciation de la vue
     * Ajout des boutons : Créer Facture, Supprimer Facture, Modifier Facture
     * Ajout des boutons : Demander prélèvement (demandeur) et valider la demande (récepteur de la demande)
     * Autres ajouts?
     */
    private void initInvoicesControl(){
        
    }
    
    /**
     * Initialisation de la liste des factures
     * Instancie la liste en mémoire;
     * Alimente la liste avec les factures en bdd
     */
    private void initListView(){
        /* Instanciation de la liste */
        invoicesList = new ListView<>();
        /* Téléchargement des factures dans la bdd  */
        
        /* Ajout des Facture dans la list view */
        
    }
    
    
    
}
