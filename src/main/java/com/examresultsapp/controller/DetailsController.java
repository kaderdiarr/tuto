package com.examresultsapp.controller;

import com.examresultsapp.model.Etudiant;
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

    /**
     * Initialise les données de l'étudiant dans les labels de la vue de détails.
     * @param etudiant L'objet étudiant contenant les informations à afficher.
     */
    public void afficherDetailsEtudiant(Etudiant etudiant) {
        if (etudiant != null) {
            matriculeLabel.setText(etudiant.getMatricule());
            nomLabel.setText(etudiant.getNom());
            prenomLabel.setText(etudiant.getPrenom());
            dateNaissanceLabel.setText(etudiant.getDateNaissance());
            ecoleLabel.setText(etudiant.getEcole());
            moyenneLabel.setText(String.valueOf(etudiant.getMoyenne()));
        } else {
            // Efface les informations si l'étudiant est null
            matriculeLabel.setText("");
            nomLabel.setText("");
            prenomLabel.setText("");
        
