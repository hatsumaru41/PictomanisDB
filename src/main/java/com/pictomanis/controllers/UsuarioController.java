package com.pictomanis.controllers;

import com.pictomanis.entities.Usuario;
import com.pictomanis.serviceinterfaces.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    private IUsuarioService uService;
    @PostMapping
    public void registrar(@RequestBody Usuario u) {
        uService.insert(u);
    }
    @GetMapping
    public List<Usuario> list() {
        return uService.list();
    }
    @PutMapping
    public void update(@RequestBody Usuario u) {
        uService.insert(u);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        uService.delete(id);
    }
    @PostMapping("/find")
    public List<Usuario> findName(@RequestBody Usuario us) throws ParseException{
        List<Usuario> listUsuario;
        us.setNameUsuario(us.getNameUsuario());
        listUsuario = uService.findName(us.getNameUsuario());
        return listUsuario;
    }
    @GetMapping("/TipeOfMembership")
    public List<Usuario> CallMembership(){return uService.CallMembership();}

}
