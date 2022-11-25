package com.pictomanis.entities;

import javax.persistence.*;

@Entity
@Table(name = "Usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUsuario;
    @ManyToOne
    @JoinColumn(name = "Membership_id", nullable = false)
    private Membership member;
    @ManyToOne
    @JoinColumn(name = "Role_id", nullable = false)
    private Rol Role;
    @Column(name = "nameUsuario", length = 45,nullable = false)
    private String nameUsuario;
    @Column(name = "lastName", length = 35, nullable = false)
    private String lastName;
    @Column(name = "numberUsuario", length = 10, nullable = false)
    private int numberUsuario;
    @Column(name = "emailUsuario", length = 35, nullable = false)
    private String emailUsuario;
    @Column(name = "passwordUsuario", length = 45, nullable = false)
    private String passwordUsuario;
    
    @ManyToOne
    @JoinColumn(name = "idRol", nullable = false)
    private Rol rol;
    @ManyToOne
    @JoinColumn(name = "idMembership", nullable = false)
    private Membership membership;

    public Usuario() {
    super();
    }

    public Usuario(int idUsuario, String nameUsuario, String lastName, int numberUsuario, String emailUsuario, String passwordUsuario, Rol rol, Membership membership) {
        this.idUsuario = idUsuario;
        this.member = member;
        Role = role;
        this.nameUsuario = nameUsuario;
        this.lastName = lastName;
        this.numberUsuario = numberUsuario;
        this.emailUsuario = emailUsuario;
        this.passwordUsuario = passwordUsuario;
        this.rol = rol;
        this.membership = membership;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Membership getMember() {
        return member;
    }

    public void setMember(Membership member) {
        this.member = member;
    }

    public Rol getRole() {
        return Role;
    }

    public void setRole(Rol role) {
        Role = role;
    }

    public String getNameUsuario() {
        return nameUsuario;
    }

    public void setNameUsuario(String nameUsuario) {
        this.nameUsuario = nameUsuario;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getNumberUsuario() {
        return numberUsuario;
    }

    public void setNumberUsuario(int numberUsuario) {
        this.numberUsuario = numberUsuario;
    }

    public String getEmailUsuario() {
        return emailUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    public String getPasswordUsuario() {
        return passwordUsuario;
    }

    public void setPasswordUsuario(String passwordUsuario) {
        this.passwordUsuario = passwordUsuario;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public Membership getMembership() {
        return membership;
    }

    public void setMembership(Membership membership) {
        this.membership = membership;
    }
}





