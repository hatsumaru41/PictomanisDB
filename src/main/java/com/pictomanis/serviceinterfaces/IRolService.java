package com.pictomanis.serviceinterfaces;

import com.pictomanis.entities.Rol;

import java.util.List;
import java.util.Optional;

public interface IRolService {
    public void insert(Rol rol);
    List<Rol> list();
    public void delete(int idRol);
    public Optional<Rol> listId(int idRol);
    List<Rol> findName(String nameRol);

    List<Rol> CallRoll();
}
