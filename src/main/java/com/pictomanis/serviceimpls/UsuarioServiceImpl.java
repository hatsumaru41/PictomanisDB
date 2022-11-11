package com.pictomanis.serviceimpls;

import com.pictomanis.entities.Usuario;
import com.pictomanis.repositories.IUsuarioRepository;
import com.pictomanis.serviceinterfaces.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class UsuarioServiceImpl implements IUsuarioService {
    @Autowired
    private IUsuarioRepository uR;
    @Override
    public void insert(Usuario usuario){
        uR.save(usuario);
    }

    @Override
    public List<Usuario> list(){
        return uR.findAll();
    }

    @Override
    public void delete(int idUsuario) {
        uR.deleteById(idUsuario);
    }

    @Override
    public Optional<Usuario> listId(int idUsuario){
        return Optional.of(uR.findById(idUsuario).orElse(new Usuario()));
    }

    @Override
    public List<Usuario> findName(String nameUsuario){
        return uR.findName(nameUsuario);
    }
}
