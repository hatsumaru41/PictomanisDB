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
}
