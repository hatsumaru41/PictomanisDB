package com.pictomanis.controllers;

import com.pictomanis.entities.Idiomas;
import com.pictomanis.serviceinterfaces.IIdiomasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/idiomas")
public class IdiomasController {
    @Autowired
    private IIdiomasService iService;
    @PostMapping
    public void registrar(@RequestBody Idiomas i) {
        iService.insert(i);
    }
    @GetMapping
    public List<Idiomas> list() {
        return iService.list();
    }
    @PutMapping
    public void update(@RequestBody Idiomas i){
        iService.insert(i);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){
        iService.delete(id);
    }
    @PostMapping("/find")
    public List<Idiomas> findName(@RequestBody Idiomas is){
        return iService.findName(is.getNameIdiomas());
    }
}
