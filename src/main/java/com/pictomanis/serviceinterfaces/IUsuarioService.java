package com.pictomanis.serviceinterfaces;

import com.pictomanis.entities.Membership;
import com.pictomanis.entities.Usuario;

import java.util.List;
import java.util.Optional;

public interface IUsuarioService{
    public void insert(Usuario usuario);
    List<Usuario> list();
    public void delete(int idUsuario);
    public Optional<Usuario> listId(int idUsuario);
    List<Usuario> findName(String nameUsuario);
    List<Usuario> CallMembership();
}
