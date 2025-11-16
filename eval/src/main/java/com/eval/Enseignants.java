package com.eval;

import java.time.LocalDate;

public class Enseignants {
    private int id;
    private String nom;
    private String prenom;
    private LocalDate dateNaissance;
    private String email;
    private String telephone;
    private String specialite;

    public Enseignants(int id, String nom, String prenom, LocalDate dateNaissance, String email, String telephone, String specialite) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.email = email;
        this.telephone = telephone;
        this.specialite = specialite;
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
    public String getSpecialite() {
        return specialite;
    }

    
}
