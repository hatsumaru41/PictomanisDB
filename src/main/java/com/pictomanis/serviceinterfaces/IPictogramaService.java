package com.pictomanis.serviceinterfaces;

import com.pictomanis.entities.Pictograma;

import java.util.List;
import java.util.Optional;

public interface IPictogramaService {
    public void insert(Pictograma pictograma);
    List<Pictograma> list();
    public void delete(int idPictograma);
    public Optional<Pictograma> listId(int idPictograma);
    List<Pictograma> findName(String namePictograma);
    List<Pictograma> CatPic();
}
