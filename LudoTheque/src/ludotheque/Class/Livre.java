/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ludotheque.Class;

import java.time.LocalDate;

/**
 *
 * @author tosanchez
 */
public class Livre{
    
    private int idLivre; 
    private String titre;
    private LocalDate dateP;
    private String auteur;
    
    public Livre(int idLivre, String titre, LocalDate dateP, String auteur){
        this.idLivre=idLivre;
        this.titre=titre;
        this.dateP=dateP;
        this.auteur=auteur;    
    }

    public int getIdLivre() {
        return idLivre;
    }

    public void setIdLivre(int idLivre) {
        this.idLivre = idLivre;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public LocalDate getDateP() {
        return dateP;
    }

    public void setDateP(LocalDate dateP) {
        this.dateP = dateP;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    
}
