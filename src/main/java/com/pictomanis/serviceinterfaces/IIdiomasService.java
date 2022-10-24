package com.pictomanis.serviceinterfaces;

import com.pictomanis.entities.Idiomas;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;
import java.util.Optional;

public interface IIdiomasService {
    public void insert(Idiomas idiomas);
    List<Idiomas> list();
    public void delete(int idIdiomas);
    public Optional<Idiomas> listId(int idIdiomas);
    List<Idiomas> findName(String nameIdiomas);
}
