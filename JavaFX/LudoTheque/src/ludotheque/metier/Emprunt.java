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
public class Emprunt {
    
    private final StringProperty titreLivre = new SimpleStringProperty();
        public String getTitreLivre() {return titreLivre.get();}
        public void setTitreLivre(String titre) {this.titreLivre.set(titre);}
        public StringProperty titreLivreProperty(){return titreLivre;}
    
       
     private final IntegerProperty idPersonne = new SimpleIntegerProperty();
        public Integer getIdPersonne() {return idPersonne.get();}
        public void setIdPersonne(Integer idLivre) {this.idPersonne.set(idLivre);}
        public IntegerProperty idPersonneProperty(){return idPersonne;}
        
    private final ObjectProperty<LocalDate> dateEmprunt = new SimpleObjectProperty<LocalDate>();
        public LocalDate getDateEmprunt() {return dateEmprunt.get();}
        public void setDateEmprunt(LocalDate dateParution) {this.dateEmprunt.set(dateParution);}
        public ObjectProperty<LocalDate> dateEmpruntProperty(){return dateEmprunt;}
        
    public Emprunt(String titreLivre, int idPersonne, LocalDate dateEmprunt){
        setTitreLivre(titreLivre);
        setIdPersonne(idPersonne);
        setDateEmprunt(dateEmprunt);
        
    }
        
    
}
