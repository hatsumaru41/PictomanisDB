package com.pictomanis.repositories;

import com.pictomanis.entities.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICategoriaRepository extends JpaRepository<Categoria,Integer> {
    @Query("from Categoria c where c.nameCategoria like %:nameCategoria")
    List<Categoria> findName(@Param("nameCategoria") String nameCategoria);
}
