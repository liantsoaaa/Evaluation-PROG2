package com.eval;

import java.time.LocalDateTime;

public class Examen {
    private int id;
    private String titre;
    private Matieres matiere;
    private LocalDateTime dateHeure;
    private int coefficient;

    public Examen(int id, String titre, Matieres matiere, LocalDateTime dateHeure, int coefficient) {
        this.id = id;
        this.titre = titre;
        this.matiere = matiere;
        this.dateHeure = dateHeure;
        this.coefficient = coefficient;
    }

    public int getId() {
        return id;
    }
    public String getTitre() {
        return titre;
    }
    public Matieres getMatiere() {
        return matiere;
    }
    public LocalDateTime getDateHeure() {
        return dateHeure;
    }
    public int getCoefficient() {
        return coefficient;
    }

    
}
