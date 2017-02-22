/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ihm;

import com.sun.javafx.font.t2k.T2KFactory;
import java.awt.BasicStroke;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Border;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javax.swing.border.StrokeBorder;
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
    Tab invoicesTab = new Tab("Factures");
    /* Layout Vertical */
    /* Région Gauche : Affichage de la liste des Factures */
    Pane invoicesView = new Pane();
    /* Liste des factures */
    ListView<Facture> invoicesList = new ListView<>();
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
        
        /* Init du layout principal */
        layoutTabs = new TabPane(invoicesTab, inventoryTab);
        /* Ajustement de la taille à la fenêtre */
        layoutTabs.resize(widthProperty().get(), heightProperty().get());
        
        /* Init de la région de l'affichage des factures */
        invoicesView.setMinSize(widthProperty().get()/2, heightProperty().get());
        invoicesView.setMaxSize(widthProperty().get()/2, heightProperty().get());
        invoicesView.setStyle("-fx-border-color:  black;\n");
        /* Ajout des éléments dans la région */
        invoicesView.getChildren().add(invoicesList);
        
        /* Ajout des régions dans l'onglet*/
        invoicesTab.setContent(invoicesView);
        /* Integration des éléments */
        ((VBox)getRoot()).getChildren().add(layoutTabs);
        
    }
    
    /**
     * Affecte l'adresse de l'utilisateur courant 
     * @param u : référence vers l'utilisateur
     */
    public void setCurrentUser(Utilisateur u){
        currentUser = u;
    }
    
    private void initInvoicesTab(){
        
    }
    
    private void initInvoicesView(){
        
    }
    
    private void initInvoicesControl(){
        
    }
    
    private void init
    
}
