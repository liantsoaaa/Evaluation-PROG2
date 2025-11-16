package com.eval;

import java.time.LocalDate;

public class Etudiants {
    private int id;
    private String nom;
    private String prenom;
    private LocalDate dateNaissance;
    private String email;
    private String telephone;
    private String groupe;
    private String tuteur;

    public Etudiants(int id, String nom, String prenom, LocalDate dateNaissance, String email, String telephone, String groupe, String tuteur) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.email = email;
        this.telephone = telephone;
        this.groupe = groupe;
        this.tuteur = tuteur;
    }

    public int getId() {
        return id;
    }   
    public String getNom() {
        return nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public LocalDate getDateNaissance() {
        return dateNaissance;
    }
    public String getEmail() {
        return email;
    }
    public String getTelephone() {
        return telephone;
    }
    public String getGroupe() {
        return groupe;
    }
    public String getTuteur() {
        return tuteur;
    }


}
