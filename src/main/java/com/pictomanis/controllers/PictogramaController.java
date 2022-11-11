package com.pictomanis.controllers;

import com.pictomanis.entities.Pictograma;
import com.pictomanis.serviceinterfaces.IPictogramaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;

@RestController
@RequestMapping("/pictograma")
public class PictogramaController {
    @Autowired
    private IPictogramaService pService;
    @PostMapping
    public void registrar(@RequestBody Pictograma p) {
        pService.insert(p);
    }
    @GetMapping
    public List<Pictograma> list() {
        return pService.list();
    }
    @PutMapping
    public void update(@RequestBody Pictograma p){
        pService.insert(p);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){
        pService.delete(id);
    }
    @PostMapping("/find")
    public List<Pictograma> findName(@RequestBody Pictograma ps) throws ParseException{
        List<Pictograma> listPictograma;
        ps.setNamePictograma(ps.getNamePictograma());
        listPictograma = pService.findName(ps.getNamePictograma());
        return listPictograma;
    }

}
