/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ludotheque.metier;

import java.time.LocalDate;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author tosanchez
 */
public class Livre{
    
   
    private final StringProperty titre = new SimpleStringProperty();
        public String getTitre() {return titre.get();}
        public void setTitre(String titre) {this.titre.set(titre);}
        public StringProperty titreProperty(){return titre;}
        
    private final IntegerProperty idLivre = new SimpleIntegerProperty();
        public Integer getIdLivre() {return idLivre.get();}
        public void setIdLivre(Integer idLivre) {this.idLivre.set(idLivre);}
        public IntegerProperty idLivreProperty(){return idLivre;}
        
    private final ObjectProperty<LocalDate> dateParution = new SimpleObjectProperty<LocalDate>();
        public LocalDate getDateParution() {return dateParution.get();}
        public void setDateParution(LocalDate dateParution) {this.dateParution.set(dateParution);}
        public ObjectProperty<LocalDate> dateParutionProperty(){return dateParution;}
        
    private final StringProperty auteur = new SimpleStringProperty();
        public String getAuteur() {return auteur.get();}
        public void setAuteur(String auteur) {this.auteur.set(auteur);}
        public StringProperty auteurProperty(){return auteur;}
        
    private final StringProperty description = new SimpleStringProperty();
        public String getDescription(){return description.get();}        
        public void setDescription(String description){this.description.set(description);}
        public StringProperty descriptionProperty(){return description;}
        
    private final StringProperty urlImage = new SimpleStringProperty();
        public String getUrlImage() {return urlImage.get();}
        public void setUrlImage(String urlImage) {this.urlImage.set(urlImage);}
        public StringProperty urlImageProperty(){return urlImage;}
    
        
    public Livre(int idLivre, String titre, LocalDate dateParution, String auteur, String description, String urlImage) {
        setIdLivre(idLivre);
        setTitre(titre);
        setDateParution(dateParution);
        setAuteur(auteur);
        setDescription(description);
        setUrlImage(urlImage);
    }

    @Override
    public String toString() {
        return this.getIdLivre() + " | " + this.getTitre();
    }

}

  