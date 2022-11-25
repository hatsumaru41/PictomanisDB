package com.pictomanis.serviceimpls;

import com.pictomanis.entities.Membership;
import com.pictomanis.repositories.IMembershipRepository;
import com.pictomanis.serviceinterfaces.IMembershipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MembershipServiceImpl implements IMembershipService {
    @Autowired
    private IMembershipRepository mR;
    @Override
    public void insert(Membership membership){
        mR.save(membership);
    }

    @Override
    public List<Membership> list(){
        return mR.findAll();
    }

    @Override
    public void delete(int idMembership) {
        mR.deleteById(idMembership);
    }

    @Override
    public Optional<Membership> listId(int idMembership){
        return Optional.of(mR.findById(idMembership).orElse(new Membership()));
    }

    @Override
    public List<Membership> findName(String nameMembership){
        return mR.findName(nameMembership);
    }

    @Override
    public Optional<Membership> findMembershipByID(int idMembership) {
        return Optional.of(mR.findById(idMembership).orElse(new Membership()));
    }
}