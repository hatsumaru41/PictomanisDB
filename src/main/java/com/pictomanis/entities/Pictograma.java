package com.pictomanis.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Pictograma")
public class Pictograma implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPictograma;
    @Column(name = "namePictograma",length = 45,nullable = false)
    private String namePictograma;

    @ManyToOne
    @JoinColumn(name = "idUsuario",nullable = false)
    private Usuario idUsuario;

    @ManyToOne
    @JoinColumn(name = "idCategoria",nullable = false)
    private Categoria idCategoria;


    public Pictograma() {
    }

    public Pictograma(int idPictograma, String namePictograma, Usuario idUsuario, Categoria idCategoria) {
        this.idPictograma = idPictograma;
        this.namePictograma = namePictograma;
        this.idUsuario = idUsuario;
        this.idCategoria = idCategoria;
    }

    public int getIdPictograma() {
        return idPictograma;
    }

    public void setIdPictograma(int idPictograma) {
        this.idPictograma = idPictograma;
    }

    public String getNamePictograma() {
        return namePictograma;
    }

    public void setNamePictograma(String namePictograma) {
        this.namePictograma = namePictograma;
    }

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Categoria getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Categoria idCategoria) {
        this.idCategoria = idCategoria;
    }
}
