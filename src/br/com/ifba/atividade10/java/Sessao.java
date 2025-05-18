/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10.java;
import java.time.LocalDateTime;
import java.util.UUID;
/**
 *
 * @author Bruno
 */
public class Sessao {
    private String idSessao;
    private Usuario usuario;
    private LocalDateTime dataCriacao;
    
    public Sessao(Usuario usuario) {
        this.usuario = usuario;
        this.idSessao = UUID.randomUUID().toString();  // gera id único
        this.dataCriacao = LocalDateTime.now();
    }

    public String getIdSessao() {
        return idSessao;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }
    
    
}
