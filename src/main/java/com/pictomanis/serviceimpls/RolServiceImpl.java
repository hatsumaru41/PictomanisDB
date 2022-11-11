package com.pictomanis.serviceimpls;

import com.pictomanis.entities.Rol;
import com.pictomanis.repositories.IRolRepository;
import com.pictomanis.serviceinterfaces.IRolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RolServiceImpl implements IRolService {
    @Autowired
    private IRolRepository roR;
    @Override
    public void insert(Rol rol) {
        roR.save(rol);
    }
    @Override
    public List<Rol> list(){
        return roR.findAll();
    }
    @Override
    public void delete(int idRol) {
        roR.deleteById(idRol);
    }
    @Override
    public Optional<Rol> listId(int idRol) {
        return Optional.empty();
    }
    @Override
    public List<Rol> findName(String nameRol) {
        return roR.findName(nameRol);
    }
}
