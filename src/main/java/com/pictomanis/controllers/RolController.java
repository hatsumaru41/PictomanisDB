package com.pictomanis.controllers;

import com.pictomanis.entities.Rol;
import com.pictomanis.serviceinterfaces.IRolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;

@RestController
@RequestMapping("/rol")
public class RolController {
    @Autowired
    private IRolService roService;
    @PostMapping
    public void registrar(@RequestBody Rol ro) {
        roService.insert(ro);
    }
    @GetMapping
    public List<Rol> list() {
        return roService.list();
    }
    @PutMapping
    public void update(@RequestBody Rol ro) {
        roService.insert(ro);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        roService.delete(id);
    }
    @PostMapping("/find")
    public List<Rol> findName(@RequestBody Rol ro) throws ParseException {
        List<Rol> listRol;
        ro.setNameRol(ro.getNameRol());
        listRol = roService.findName(ro.getNameRol());
        return listRol;
    }
}
