package com.pictomanis.serviceimpls;

import com.pictomanis.entities.Idiomas;
import com.pictomanis.repositories.IIdiomasRepository;
import com.pictomanis.serviceinterfaces.IIdiomasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IdiomasServiceImpl implements IIdiomasService {
    @Autowired
    private IIdiomasRepository iR;
    @Override
    public void insert(Idiomas idiomas) {
        iR.save(idiomas);
    }
    @Override
    public List<Idiomas> list(){
        return iR.findAll();
    }
    @Override
    public void delete(int idIdiomas){
        iR.deleteById(idIdiomas);
    }
    @Override
    public Optional<Idiomas> listId(int idIdiomas){
        return Optional.of(iR.findById(idIdiomas).orElse(new Idiomas()));
    }
    @Override
    public List<Idiomas> findName(String nameIdiomas){
        return iR.findName(nameIdiomas);
    }
}
