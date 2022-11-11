package com.pictomanis.controllers;

import com.pictomanis.entities.Categoria;
import com.pictomanis.serviceinterfaces.ICategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;

@RestController
@RequestMapping("/categorias")
public class
CategoriaController {
    @Autowired
    private ICategoriaService cService;
    @PostMapping
    public void registrar(@RequestBody Categoria c) {
        cService.insert(c);
    }
    @GetMapping
    public List<Categoria> list() {
        return cService.list();
    }

    @PutMapping
    public void update(@RequestBody Categoria c){
        cService.insert(c);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){
        cService.delete(id);
    }
    @PostMapping("/find")
    public List<Categoria> findName(@RequestBody Categoria cs) throws ParseException{
        List<Categoria> listCategoria;
        cs.setNameCategoria(cs.getNameCategoria());
        listCategoria = cService.findName(cs.getNameCategoria());
        return listCategoria;
    }
}
