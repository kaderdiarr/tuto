package com.examresultsapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApp extends Application {

    private Stage primaryStage;

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Consultation de Résultats d'Examen");

        // Initialisation de la première scène
        initRootLayout();
    }

    /**
     * Initialise le layout de la fenêtre principale et charge la scène initiale.
     */
    public void initRootLayout() {
        try {
            // Charge le fichier FXML de la vue principale (ResultatView.fxml)
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("/com/examresultsapp/view/ResultatView.fxml"));
            AnchorPane rootLayout = loader.load();

            // Crée la scène avec le layout chargé
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Méthode principale pour lancer l'application.
     *
     * @param args Les arguments de la ligne de commande.
     */
    public static void main(String[] args) {
        launch(args);
    }
}
