package com.pictomanis.repositories;

import com.pictomanis.entities.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IRolRepository extends JpaRepository<Rol,Integer> {
    @Query("from Rol r where r.nameRol like %:nameRol%")
    List<Rol> findName(@Param("nameRol") String nameRol);
    @Query(value = "SELECT*FROM usuario u JOIN rol r ON r.id_rol = u.id_rol WHERE r.name_rol = 'Admin'", nativeQuery = true)
    List<Rol> TypeOfRol();
}