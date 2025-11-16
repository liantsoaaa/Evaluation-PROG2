package com.eval;

import java.util.List;

public class Promotion {
    private String nom;
    private List<String> groupes;

    public Promotion(String nom, List<String> groupes) {
        this.nom = nom;
        this.groupes = groupes;
    }

    public String getNom() {
        return nom;
    }
    public List<String> getGroupes() {
        return groupes;
    }

    public void addGroupe(String groupe) {
        this.groupes.add(groupe);
    }

    @Override
    public String toString() {
        return "Promotion : " + nom + ", groupes = " + groupes;
    }
}