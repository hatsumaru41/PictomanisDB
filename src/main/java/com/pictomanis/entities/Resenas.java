package com.pictomanis.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Resenas")
public class Resenas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idResenas;
    @Column(name = "nameResenas",length = 45,nullable = false)
    private String nameResenas;
    @Column(name = "descripcionResenas",length = 255,nullable = false)
    private String descripcionResenas;

    @ManyToOne
    @JoinColumn(name = "idPictograma",nullable = false)
    private Pictograma pictograma;

    public Resenas(){

    }

    public Resenas(int idResenas, String nameResenas, String descripcionResenas, Pictograma pictograma) {
        this.idResenas = idResenas;
        this.nameResenas = nameResenas;
        this.descripcionResenas = descripcionResenas;
        this.pictograma = pictograma;
    }

    public Pictograma getPictograma() {
        return pictograma;
    }

    public void setPictograma(Pictograma pictograma) {
        this.pictograma = pictograma;
    }

    public int getIdResenas() {
        return idResenas;
    }

    public void setIdResenas(int idResenas) {
        this.idResenas = idResenas;
    }

    public String getNameResenas() {
        return nameResenas;
    }

    public void setNameResenas(String nameResenas) {
        this.nameResenas = nameResenas;
    }

    public String getDescripcionResenas() {
        return descripcionResenas;
    }

    public void setDescripcionResenas(String descripcionResenas) {
        this.descripcionResenas = descripcionResenas;
    }
}
