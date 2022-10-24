package com.pictomanis.serviceimpls;

import com.pictomanis.entities.Categoria;
import com.pictomanis.repositories.ICategoriaRepository;
import com.pictomanis.serviceinterfaces.ICategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaServiceImpl implements ICategoriaService {
    @Autowired
    private ICategoriaRepository cR;
    @Override
    public void insert(Categoria categoria) {
        cR.save(categoria);
    }

    @Override
    public List<Categoria> list(){
        return cR.findAll();
    }

    @Override
    public void delete(int idCategoria){
        cR.deleteById(idCategoria);
    }

    @Override
    public Optional<Categoria> listId(int idCategoria){
        return Optional.of(cR.findById(idCategoria).orElse(new Categoria()));
    }

    @Override
    public List<Categoria> findName(String nameCategoria){
        return cR.findName(nameCategoria);
    }

}
