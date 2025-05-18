package br.com.ifba.atividade10.java;

import java.time.LocalDateTime;
import java.util.UUID;

public class LogAuditoria {
    private String idLog;
    private Long idUsuario;
    private LocalDateTime dataEvento;
    private String descricao;

    public LogAuditoria(Long idUsuario, String descricao) {
        this.idLog = UUID.randomUUID().toString();
        this.idUsuario = idUsuario;
        this.dataEvento = LocalDateTime.now();
        this.descricao = descricao;
    }

    // Getters e setters

    public String getIdLog() {
        return idLog;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public LocalDateTime getDataEvento() {
        return dataEvento;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "LogAuditoria{" +
                "idLog='" + idLog + '\'' +
                ", idUsuario=" + idUsuario +
                ", dataEvento=" + dataEvento +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
