package com.pictomanis.serviceinterfaces;

import com.pictomanis.entities.Membership;

import java.util.List;
import java.util.Optional;

public interface IMembershipService{
    public void insert(Membership membership);
    List<Membership> list();
    public void delete(int idMembership);
    public Optional<Membership> listId(int idMembership);
    List<Membership> findName(String nameMembership);
    public Optional<Membership> findMembershipByID(int idMembership);
}
