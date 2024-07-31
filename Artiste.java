package com.exam;

import java.util.ArrayList;

public class Artiste extends Humain {
     private String chansons;
     private String  album;
     private String  genreDeMusic;

    public Artiste(String nom, String prenom, String album, int age, String chansons, String album1, String genreDeMusic) {
        super(nom, prenom, album, age);
        this.chansons = chansons;
        this.album = album1;
        this.genreDeMusic = genreDeMusic;
    }




}
