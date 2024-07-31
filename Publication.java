package com.exam;

import java.time.Instant;

public abstract class Publication {
    private String titre;
    private String auteur;
    private Instant datePublication;

    public Publication(String titre, String auteur, Instant datePublication) {
        this.titre = titre;
        this.auteur = auteur;
        this.datePublication = datePublication;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public Instant getDatePublication() {
        return datePublication;
    }

    public void setDatePublication(Instant datePublication) {
        this.datePublication = datePublication;
    }

    public abstract void publier();
}
