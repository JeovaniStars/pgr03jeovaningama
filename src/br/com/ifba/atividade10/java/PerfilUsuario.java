/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10.java;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Bruno
 */
public class PerfilUsuario {
    private Long id;
    private String descricao;
    private List<String> permissoes;

    public PerfilUsuario() {
        this.id = null;
        this.descricao = "";
        this.permissoes = new ArrayList<>();
    }

    //Getters e Setters
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<String> getPermissoes() {
        return permissoes;
    }

    public void setPermissoes(List<String> permissoes) {
        this.permissoes = permissoes;
    }
    
    //Fim Getters e Setters
    
    @Override
    public String toString() {
        return "PerfilUsuario{" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                ", permissoes=" + permissoes +
                '}';
    }
}
