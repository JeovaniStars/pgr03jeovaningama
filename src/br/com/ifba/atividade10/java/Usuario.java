/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10.java;
import java.time.LocalDateTime;

/**
 *
 * @author Bruno
 */
public class Usuario {
    private Long id;
    private PerfilUsuario perfil;
    private String nomeUsuario;
    private String email;
    private String senha;
    private DateTime ultimoLogin;
    private Boolean ativo;

    public Usuario(Long id, PerfilUsuario perfil, String nomeUsuario, String email, String senha, DateTime ultimoLogin, Boolean ativo) {
        this.id = id;
        this.perfil = perfil;
        this.nomeUsuario = nomeUsuario;
        this.email = email;
        this.senha = senha;
        this.ultimoLogin = ultimoLogin;
        this.ativo = ativo;
    }
    
    //Getters e Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PerfilUsuario getPerfil() {
        return perfil;
    }

    public void setPerfil(PerfilUsuario perfil) {
        this.perfil = perfil;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public DateTime getUltimoLogin() {
        return ultimoLogin;
    }

    /**
     *
     * @param ultimoLogin
     */
    public void setUltimoLogin(DateTime ultimoLogin) {
        this.ultimoLogin = ultimoLogin;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }
    
    //Fim Getters e Setters
    
    @Override
    public String toString() {
        return "Usuario{id=" + id + ", nomeUsuario='" + nomeUsuario + "', email='" + email + "'}";
    }

    
    public void setUltimoLogin(DateTime ultimoLogin) {
        this.ultimoLogin = ultimoLogin;
    }
    
}
