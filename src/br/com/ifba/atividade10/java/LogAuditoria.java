package br.com.ifba.atividade10.java;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LogAuditoria {

    private Long id;
    private String mensagem;
    private LocalDateTime dataHora;

    public LogAuditoria() {}

    public LogAuditoria(long id, String mensagem, LocalDateTime dataHora) {
        this.id = id;
        this.mensagem = mensagem;
        this.dataHora = dataHora;
    }

    // Getters e Setters
    public long getId() { return id; }
    public void setId(long id) { this.id = id; }
    public String getMensagem() { return mensagem; }
    public void setMensagem(String mensagem) { this.mensagem = mensagem; }
    public LocalDateTime getDataHora() { return dataHora; }
    public void setDataHora(LocalDateTime dataHora) { this.dataHora = dataHora; }

    // Simulação de "banco" em memória
    private static List<LogAuditoria> logs = new ArrayList<>();

    static {
        logs.add(new LogAuditoria(1, "Login realizado", LocalDateTime.now().minusDays(1)));
        logs.add(new LogAuditoria(2, "Usuário cadastrado", LocalDateTime.now().minusHours(3)));
        logs.add(new LogAuditoria(3, "Erro ao acessar sistema", LocalDateTime.now().minusMinutes(30)));
        logs.add(new LogAuditoria(4, "Login realizado", LocalDateTime.now().minusHours(5)));
    }

    // Buscar todos
    public static List<LogAuditoria> buscarTodos() {
        return new ArrayList<>(logs);
    }

    // Buscar por filtro simples na mensagem (case insensitive)
    public static List<LogAuditoria> buscarPorFiltro(String filtro) {
        if (filtro == null || filtro.isEmpty()) {
            return buscarTodos();
        }
        return logs.stream()
            .filter(log -> log.getMensagem().toLowerCase().contains(filtro.toLowerCase()))
            .collect(Collectors.toList());
    }

    // Buscar por ação exata (igualdade na mensagem, case insensitive)
    public static List<LogAuditoria> buscarPorAcao(String acao) {
        if (acao == null || acao.isEmpty()) {
            return buscarTodos();
        }
        return logs.stream()
            .filter(log -> log.getMensagem().equalsIgnoreCase(acao))
            .collect(Collectors.toList());
    }

    // Buscar por intervalo de data (inclusive)
    public static List<LogAuditoria> buscarPorData(LocalDateTime inicio, LocalDateTime fim) {
        if (inicio == null && fim == null) {
            return buscarTodos();
        }
        return logs.stream()
            .filter(log -> {
                LocalDateTime dt = log.getDataHora();
                boolean depoisInicio = (inicio == null) || !dt.isBefore(inicio);
                boolean antesFim = (fim == null) || !dt.isAfter(fim);
                return depoisInicio && antesFim;
            })
            .collect(Collectors.toList());
    }

    // Buscar por ID
    public static LogAuditoria buscarPorId(int id) {
        return logs.stream()
            .filter(log -> log.getId() == id)
            .findFirst()
            .orElse(null);
    }
}
