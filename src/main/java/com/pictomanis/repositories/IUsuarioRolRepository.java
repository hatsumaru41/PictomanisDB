package com.pictomanis.repositories;

import com.pictomanis.entities.UsuarioRol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsuarioRolRepository extends JpaRepository<UsuarioRol, Integer> {
}
