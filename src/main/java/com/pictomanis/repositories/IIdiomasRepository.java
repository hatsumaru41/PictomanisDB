package com.pictomanis.repositories;

import com.pictomanis.entities.Idiomas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IIdiomasRepository extends JpaRepository<Idiomas,Integer> {
    @Query("from Idiomas i where i.nameIdiomas like %:nameIdiomas%")
    List<Idiomas> findName(@Param("nameIdiomas") String nameIdiomas);

    @Query(value = "SELECT*from idiomas i JOIN resenas r ON r.id_resenas = i.id_resenas WHERE r.name_resenas = 'comentario'",nativeQuery = true)
    List<Idiomas> TypeOfResena();
}
