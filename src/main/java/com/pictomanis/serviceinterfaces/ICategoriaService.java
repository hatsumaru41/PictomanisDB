package com.pictomanis.serviceinterfaces;

import com.pictomanis.entities.Categoria;

import java.util.List;
import java.util.Optional;

public interface ICategoriaService{
    void insert(Categoria categoria);
    List<Categoria> list();
    public void delete(int idCategoria);
    public Optional<Categoria> listId(int idCategoria);
    List<Categoria> findName(String nameCategoria);
}
