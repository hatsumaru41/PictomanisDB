package com.pictomanis.serviceimpls;

import com.pictomanis.entities.Pictograma;
import com.pictomanis.repositories.IPictogramaRepository;
import com.pictomanis.serviceinterfaces.IPictogramaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PictogramaServiceImpl implements IPictogramaService {
    @Autowired
    private IPictogramaRepository pR;
    @Override
    public void insert(Pictograma pictograma){
        pR.save(pictograma);
    }

    @Override
    public List<Pictograma> list(){
        return pR.findAll();
    }

    @Override
    public void delete(int idPictograma){
        pR.deleteById(idPictograma);
    }

    @Override
    public Optional<Pictograma> listId(int idPictograma){
        return Optional.of(pR.findById(idPictograma).orElse(new Pictograma()));
    }

    @Override
    public List<Pictograma> findName(String namePictograma){
        return pR.findName(namePictograma);
    }

    @Override
    public List<Pictograma> CatPic() {
        return pR.CategoryOfPic();
    }
}
