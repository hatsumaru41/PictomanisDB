package com.pictomanis.serviceinterfaces;

import ch.qos.logback.core.pattern.parser.OptionTokenizer;
import com.pictomanis.entities.UsuarioRol;

import java.util.List;
import java.util.Optional;

public interface IUsuarioRolService {
    public boolean insert(UsuarioRol usuarioRol);
    public void delete(int IdUsuarioRol);
    Optional <UsuarioRol> ListarID(int IdUsuarioRol);
    List<UsuarioRol> list();

    public Optional<UsuarioRol> findUserById(int IdUsuarioRol);
}
