package com.pictomanis.serviceimpls;

import com.pictomanis.entities.UsuarioRol;
import com.pictomanis.repositories.IUsuarioRolRepository;
import com.pictomanis.serviceinterfaces.IUsuarioRolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class UsuarioRolServiceImpl implements IUsuarioRolService {
    @Autowired
    private IUsuarioRolRepository urS;
    @Override
    @Transactional
    public boolean insert(UsuarioRol usuarioRol) {
        UsuarioRol objUsuarioRol = urS.save(usuarioRol);
        if(objUsuarioRol == null)
        {
            return false;
        }
        return true;
    }

    @Override
    @Transactional
    public void delete(int IdUsuarioRol) {
        urS.deleteById(IdUsuarioRol);
    }

    @Override
    public Optional<UsuarioRol> ListarID(int IdUsuarioRol) {
        return Optional.empty();
    }

    @Override
    public List<UsuarioRol> list() {

        return urS.findAll();
    }

    @Override
    public Optional<UsuarioRol> findUserById(int IdUsuarioRol) {
        return Optional.of(urS.findById(IdUsuarioRol).orElse(new UsuarioRol()));
    }
}
