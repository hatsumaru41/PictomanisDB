package com.pictomanis.serviceinterfaces;

import com.pictomanis.entities.Resenas;

import java.util.List;
import java.util.Optional;

public interface IResenasService {
    public void insert(Resenas resenas);
    List<Resenas> list();
    public void delete(int idResenas);
    public Optional<Resenas> listId(int idResenas);
    List<Resenas> findName(String nameResenas);
}
