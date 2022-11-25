package com.pictomanis.controllers;

import com.pictomanis.entities.Membership;
import com.pictomanis.serviceinterfaces.IMembershipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/membership")
public class MembershipController {
    @Autowired
    private IMembershipService mService;
    @PostMapping
    public void registrar(@RequestBody Membership m) {
        mService.insert(m);
    }
    @GetMapping
    public List<Membership> list() {
        return mService.list();
    }
    @PutMapping
    public void update(@RequestBody Membership m) {
        mService.insert(m);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        mService.delete(id);
    }
    @PostMapping("/find")
    public List<Membership> findName(@RequestBody Membership ms) throws ParseException{
        List<Membership> listMembership;
        ms.setNameMembership(ms.getNameMembership());
        listMembership = mService.findName(ms.getNameMembership());
        return listMembership;
    }
    @GetMapping("/{id}")
    public Optional<Membership> listarID(@PathVariable("id") Integer id){return mService.findMembershipByID(id);}
}
