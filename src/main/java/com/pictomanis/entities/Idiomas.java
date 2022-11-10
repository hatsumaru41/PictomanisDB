package com.pictomanis.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Idiomas")
public class Idiomas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idIdiomas;
    @Column(name = "nameIdiomas",length = 45,nullable = false)
    private String nameIdiomas;

    @ManyToOne
    @JoinColumn(name = "idResenas",nullable = false)
    private Resenas idResenas;


    public Idiomas(){

    }

    public Idiomas(int idIdiomas, String nameIdiomas, Resenas idResenas) {
        this.idIdiomas = idIdiomas;
        this.nameIdiomas = nameIdiomas;
        this.idResenas = idResenas;
    }

    public Resenas getIdResenas() {
        return idResenas;
    }

    public void setIdResenas(Resenas idResenas) {
        this.idResenas = idResenas;
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
