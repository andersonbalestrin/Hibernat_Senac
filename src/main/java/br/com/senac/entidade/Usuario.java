/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senac.entidade;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author SONY
 */
@Entity //  quer dizer que a classe usuario liga com o banco de dados. para saber quem ele é.
@Table(name = "usuaio")
public class Usuario implements Serializable { //sempre que implements implementa uma interface ou seja, serializable é uma interface.

    private static final long serialVersionUID = 1L;
    @Id // siguinifica que o Long id é uma chave primária.
    @GeneratedValue(strategy = GenerationType.IDENTITY) //siginifica que é auto incremente.
    private Long id; // String e Varchar no banco de dados nunca vai ser autoincremente. apenas uma dica.

    @Column(nullable = false, length = 120)
    private String nome;

    @Column(nullable = false, length = 120, unique = true)
    private String login;

    @Column(nullable = false, length = 100)
    private String senha;

    public Usuario() {

    }

    public Usuario(Long id, String nome, String login, String senha) {
        this.id = id;
        this.nome = nome;
        this.login = login;
        this.senha = senha;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString() {
        return "br.com.senac.util.Usuario[ id=" + id + " ]";
    }

}
