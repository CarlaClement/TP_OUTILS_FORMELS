/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tp_outils_formel;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Administrateur
 */
public class Ihm extends Application{

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println( "Main method inside Thread : " +  Thread.currentThread().getName());
        launch(args);
    }

    /**
     *
     * @param args
     * @throws Exception
     */
    @Override
    public void start(Stage args) throws Exception {
        System.out.println( "Start method inside Thread : " +  Thread.currentThread().getName());
        
        // Bouton continuer
        Button btn = new Button();
        btn.setText("Continuer");
        btn.setTranslateY(90);
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("L'utilisateur entre dans l'application ");
            }
        });
        
         // Panneau message de bienvenue       
        Group sign = new Group();
        sign.setTranslateX(40);
        sign.setTranslateY(10);
        Text text = new Text("Bienvenue!  \n Vous allez accéder à BestGest!");
        text.setFont(new Font(20));
        text.setFill(Color.GREEN);
        //Rectangle panel = new Rectangle( 0, -50, 500, 110);
        //panel.setFill(Color.DARKBLUE);
        //sign.getChildren().add(panel);
        sign.getChildren().add(text);
        
        //Stack pane  - Resizable
        StackPane root = new StackPane();
        root.getChildren().add(sign);
        root.getChildren().add(btn);
        //Scene
        Scene scene = new Scene(root, 600, 650);

        args.setTitle("Bienvenu sur BestGest ! ");
        
        args.setScene(scene);
        args.show();

    }
}
