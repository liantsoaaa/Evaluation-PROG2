package com.eval;

import java.util.List;
import java.time.Instant;

public class Notes {
    private Etudiants etudiant;
    private double valeurInitiale;
    private List<Double> valeursModifiees;
    private Instant dateCreation;

    public Notes(Etudiants etudiant, double valeurInitiale, List<Double> valeursModifiees, Instant dateCreation) {
        this.etudiant = etudiant;
        this.valeurInitiale = valeurInitiale;
        this.valeursModifiees = valeursModifiees;
        this.dateCreation = dateCreation;
    }

    public Etudiants getEtudiant() {
        return etudiant;
    }
    public double getValeurInitiale() {
        return valeurInitiale;
    }
    public List<Double> getValeursModifiees() {
        return valeursModifiees;
    }
    public Instant getDateCreation() {
        return dateCreation;
    }
}
