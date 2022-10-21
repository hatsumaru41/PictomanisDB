package com.pictomanis.serviceimpls;

import com.pictomanis.entities.Usuario;
import com.pictomanis.repositories.IUsuarioRepository;
import com.pictomanis.serviceinterfaces.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UsuarioServiceImpl implements IUsuarioService {
    @Autowired
    private IUsuarioRepository uR;
    @Override
    public void insert(Usuario usuario){uR.save(usuario);}

    @Override
    public List<Usuario> list(){return uR.findAll();}
}