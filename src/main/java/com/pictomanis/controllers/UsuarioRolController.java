package com.pictomanis.controllers;

import com.pictomanis.entities.Usuario;
import com.pictomanis.entities.UsuarioRol;
import com.pictomanis.serviceinterfaces.IUsuarioRolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/usuarioRoles")
public class UsuarioRolController {
    @Autowired
    private IUsuarioRolService uRs;

    @PostMapping
    public void Registrar(@RequestBody UsuarioRol uR) {
        uRs.insert(uR);
    }
    @GetMapping
    public List<UsuarioRol> Listar() {
        return uRs.list();
    }
    @PutMapping
    public void Modificar(@RequestBody UsuarioRol uR) {
        uRs.insert(uR);
    }

    @DeleteMapping("/{id}")
    public void Eliminar(@PathVariable("id") Integer id) {
        uRs.delete(id);
    }

    @GetMapping("/{id}")
    public Optional<UsuarioRol> listarId(@PathVariable("id") Integer id) {
        return uRs.ListarID(id);
    }

}
