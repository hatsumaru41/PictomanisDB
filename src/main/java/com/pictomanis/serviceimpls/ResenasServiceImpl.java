package com.pictomanis.serviceimpls;

import com.pictomanis.entities.Resenas;
import com.pictomanis.repositories.IResenasRepository;
import com.pictomanis.serviceinterfaces.IResenasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ResenasServiceImpl implements IResenasService {
    @Autowired
    private IResenasRepository rR;
    @Override
    public void insert(Resenas resenas){
        rR.save(resenas);
    }
    @Override
    public List<Resenas> list(){
        return rR.findAll();
    }
    @Override
    public void delete(int idResenas) {
        rR.deleteById(idResenas);
    }
    @Override
    public Optional<Resenas> listId(int idResenas) {
        return Optional.of(rR.findById(idResenas).orElse(new Resenas()));
    }
    @Override
    public List<Resenas> findName(String nameResenas) {
        return rR.findName(nameResenas);
    }
}
