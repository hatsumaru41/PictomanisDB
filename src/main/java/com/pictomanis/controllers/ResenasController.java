package com.pictomanis.controllers;

import com.pictomanis.entities.Resenas;
import com.pictomanis.serviceinterfaces.IResenasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/resenas")
public class ResenasController {
    @Autowired
    private IResenasService rService;
    @PostMapping
    public void registrar (@RequestBody Resenas r) {
        rService.insert(r);
    }
    @GetMapping
    public List<Resenas> list() {
        return rService.list();
    }
    @PutMapping
    public void update(@RequestBody Resenas r){
        rService.insert(r);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){
        rService.delete(id);
    }
    @PostMapping("/find")
    public List<Resenas> findName(@RequestBody Resenas rs) {
        return  rService.findName(rs.getNameResenas());
    }
}
