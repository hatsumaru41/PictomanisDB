package com.pictomanis.repositories;

import com.pictomanis.entities.Pictograma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IPictogramaRepository extends JpaRepository<Pictograma,Integer> {
    @Query("from Pictograma p where p.namePictograma like %:namePictograma%")
    List<Pictograma> findName(@Param("namePictograma") String namePictograma);
    @Query(value = "SELECT*FROM pictograma p JOIN categoria c ON c.id_categoria = p.id_categoria WHERE c.name_categoria = 'Transito'",nativeQuery = true)
    List<Pictograma> CategoryOfPic();
}
