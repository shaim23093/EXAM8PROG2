package com.exam;

public class Humain  {

   public String nom;
   public String prenom;
   public int age;

   public Humain(String nom, String prenom, String album, int age) {
      this.nom = nom;
      this.prenom = prenom;
      this.age = age;
   }

   public String getNom() {
      return nom;
   }

   public void setNom(String nom) {
      this.nom = nom;
   }

   public String getPrenom() {
      return prenom;
   }

   public void setPrenom(String prenom) {
      this.prenom = prenom;
   }

   public int getAge() {
      return age;
   }

   public void setAge(int age) {
      this.age = age;
   }
}
