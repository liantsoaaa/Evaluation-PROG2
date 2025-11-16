package com.eval;

public class Matieres {
    private int id;
    private String label;
    private int credits;
    private Enseignants enseignant;

    public Matieres(int id, String label, int credits, Enseignants enseignant) {
        this.id = id;
        this.label = label;
        this.credits = credits;
        this.enseignant = enseignant;
    }

    public int getId() {
        return id;
    }
    public String getLabel() {
        return label;
    }
    public int getCredits() {
        return credits;
    }
    public Enseignants getEnseignant() {
        return enseignant;
    }

    
}
