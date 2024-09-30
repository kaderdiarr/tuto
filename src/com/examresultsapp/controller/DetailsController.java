package com.examresultsapp.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class DetailsController {

    @FXML
    private Label matriculeLabel;
    @FXML
    private Label nomLabel;
    @FXML
    private Label prenomLabel;
    @FXML
    private Label dateNaissanceLabel;
    @FXML
    private Label ecoleLabel;
    @FXML
    private Label moyenneLabel;

    public void setDetails(String matricule, String nom, String prenom, String dateNaissance, String ecole, double moyenne) {
        matriculeLabel.setText(matricule);
        nomLabel.setText(nom);
        prenomLabel.setText(prenom);
        dateNaissanceLabel.setText(dateNaissance);
        ecoleLabel.setText(ecole);
        moyenneLabel.setText(String.valueOf(moyenne));
    }
}
