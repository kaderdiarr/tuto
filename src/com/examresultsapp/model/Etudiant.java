package com.examresultsapp.model;

public class Etudiant {

    private String matricule;
    private String nom;
    private String prenom;
    private String dateNaissance;
    private String ecole;
    private double moyenne;

    public Etudiant(String matricule, String nom, String prenom, String dateNaissance, String ecole, double moyenne) {
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.ecole = ecole;
        this.moyenne = moyenne;
    }

    // Getters and Setters
    public String getMatricule() { return matricule; }
    public void setMatricule(String matricule) { this.matricule = matricule; }
    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }
    public String getPrenom() { return prenom; }
    public void setPrenom(String prenom) { this.prenom = prenom; }
    public String getDateNaissance() { return dateNaissance; }
    public void setDateNaissance(String dateNaissance) { this.dateNaissance = dateNaissance; }
    public String getEcole() { return ecole; }
    public void setEcole(String ecole) { this.ecole = ecole; }
    public double getMoyenne() { return moyenne; }
    public void setMoyenne(double moyenne) { this.moyenne = moyenne; }
}
