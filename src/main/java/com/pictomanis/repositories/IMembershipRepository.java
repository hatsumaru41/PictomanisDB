package com.pictomanis.repositories;

import com.pictomanis.entities.Membership;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IMembershipRepository extends JpaRepository<Membership,Integer> {
    @Query("from Membership m where m.nameMembership like %:nameMembership%")
    List<Membership> findName(@Param("nameMembership") String nameMembership);
}
