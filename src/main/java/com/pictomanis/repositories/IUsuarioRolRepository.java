package com.pictomanis.repositories;

import com.pictomanis.entities.UsuarioRol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IUsuarioRolRepository extends JpaRepository<UsuarioRol, Integer> {
    @Query("from UsuarioRol uR where uR.User.nameUsuario like %:nameUsuario%")
    List<UsuarioRol> findByName(@Param("nameUsuario")String nameUsuario);
}
