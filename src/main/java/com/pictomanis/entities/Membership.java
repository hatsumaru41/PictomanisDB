package com.pictomanis.entities;

import javax.persistence.*;

@Entity
@Table(name = "Membership")
public class Membership {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMembership;
    @Column(name = "nameMembership",length = 45,nullable = false)
    private String nameMembership;
    @Column(name = "type",length = 35,nullable = false)
    private String type;
    public Membership(){


    }

    public Membership(int idMembership,String nameMiembro,String type){
        this.idMembership = idMembership;
        this.nameMembership = nameMiembro;
        this.type = type;
    }

    public int getIdMembership() {
        return idMembership;
    }

    public void setIdMembership(int idMembership) {
        this.idMembership = idMembership;
    }

    public String getNameMembership() {
        return nameMembership;
    }

    public void setNameMembership(String nameMembership) {
        this.nameMembership = nameMembership;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
