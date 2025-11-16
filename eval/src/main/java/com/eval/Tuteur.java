package com.eval;

public class Tuteur extends Etudiants {
    private String relation;

    public Tuteur(int id, String nom, String prenom, java.time.LocalDate dateNaissance, String email, String telephone, String groupe, String relation) {
        super(id, nom, prenom, dateNaissance, email, telephone, groupe, nom + " " + prenom);
        this.relation = relation;
    }

    public String getRelation() {
        return relation;
    }

    
}
