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
    @Column(name = "lastName",length = 35, nullable = false)
    private String lastName;
    @Column(name = "numberUsuario",length = 10,nullable = false)
    private int numberUsuario;
    @Column(name = "emailUsuario",length = 35, nullable = false)
    private String emailUsuario;
    @Column(name = "passwordUsuario",length = 45,nullable = false)
    private String passwordUsuario;

    public Usuario() {
    }

    public Usuario(int idUsuario, Membership member, Rol role, String nameUsuario, String lastName, int numberUsuario, String emailUsuario, String passwordUsuario) {
        this.idUsuario = idUsuario;
        this.member = member;
        Role = role;
        this.nameUsuario = nameUsuario;
        this.lastName = lastName;
        this.numberUsuario = numberUsuario;
        this.emailUsuario = emailUsuario;
        this.passwordUsuario = passwordUsuario;
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
}
