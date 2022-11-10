package com.pictomanis.entities;

import javax.persistence.*;

@Entity
@Table(name = "Idiomas")
public class Idiomas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idIdiomas;
    @Column(name = "nameIdiomas",length = 45,nullable = false)
    private String nameIdiomas;

    public Idiomas(){

    }

    public Idiomas(int idIdioma,String nameIdioma){
        this.idIdiomas = idIdioma;
        this.nameIdiomas = nameIdioma;
    }

    public int getIdIdiomas() {
        return idIdiomas;
    }

    public void setIdIdiomas(int idIdiomas) {
        this.idIdiomas = idIdiomas;
    }

    public String getNameIdiomas() {
        return nameIdiomas;
    }

    public void setNameIdiomas(String nameIdiomas) {
        this.nameIdiomas = nameIdiomas;
    }

}
