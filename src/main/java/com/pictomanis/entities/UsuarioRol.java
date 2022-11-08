package com.pictomanis.entities;

import javax.persistence.*;

@Entity
@Table(name="UsuarioRol")
public class UsuarioRol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn(name = "User_id", nullable = false)
    private Usuario User;
    @ManyToOne
    @JoinColumn(name = "Role_id", nullable = false)
    private Rol Role;

    public UsuarioRol() {
        super();
    }

    public UsuarioRol(int id, Usuario user, Rol role) {
        this.id = id;
        User = user;
        Role = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Usuario getUser() {
        return User;
    }

    public void setUser(Usuario user) {
        User = user;
    }

    public Rol getRole() {
        return Role;
    }

    public void setRole(Rol role) {
        Role = role;
    }
}
