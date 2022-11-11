package com.pictomanis.repositories;

import com.pictomanis.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario,Integer> {
    @Query("from Usuario u where u.nameUsuario like %:nameUsuario%")
    List<Usuario> findName(@Param("nameUsuario") String nameUsuario);
}
