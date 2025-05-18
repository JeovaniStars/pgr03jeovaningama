/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.ifba.atividade10.view;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import br.com.ifba.atividade10.java.*;

/**
 *
 * @author Bruno
 */
public class TelaListagem extends javax.swing.JFrame {
        private DefaultTableModel modeloTabela;
    


    /**
     * Creates new form TelaListagem
     */
    public TelaListagem() {
        initComponents();
        configurarModeloTabela();
    }

    private void configurarModeloTabela() {
        // Configura o modelo da tabela
        modeloTabela = new DefaultTableModel(
            new Object[][]{},
            new String[]{"ID", "Nome", "Email"}
        ) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Tabela não editável
            }
        };

        // Configura o modelo no componente JTable existente
        jTable1.setModel(modeloTabela);
    }

    public void preencherTabela(List<Usuario> usuarios) {
        modeloTabela.setRowCount(0); // Limpa a tabela
        for (Usuario u : usuarios) {
            modeloTabela.addRow(new Object[]{u.getId(), u.getNomeUsuario(), u.getEmail()});
        }
    }

    // Simula busca por filtro - substituir por implementação real
    private List<Usuario> buscarUsuariosPorFiltro(String filtro) {
        // Retorne os usuários filtrados com base no filtro fornecido.
        return List.of(); 
    }

    private void realizarBusca() {
        String filtro = txtFiltro.getText().trim();
        List<Usuario> usuariosFiltrados = buscarUsuariosPorFiltro(filtro);
        preencherTabela(usuariosFiltrados);
    }

    private void acaoNovo() {
        // TODO: Adicionar lógica para criar um novo usuário
        System.out.println("Novo usuário - Ação a ser implementada");
    }

    private void acaoEditar() {
        // TODO: Adicionar lógica para editar usuário selecionado
        System.out.println("Editar usuário - Ação a ser implementada");
    }

    private void acaoExcluir() {
        // TODO: Adicionar lógica para excluir usuário selecionado
        System.out.println("Excluir usuário - Ação a ser implementada");
    }

    /**
     * Código gerado automaticamente. Não altere o conteúdo deste método fora do Editor de Formulários.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblListagemDeUsuarios = new javax.swing.JLabel();
        lblFiltro = new javax.swing.JLabel();
        txtFiltro = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnNovo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblListagemDeUsuarios.setText("Listagem de Usuários");
        getContentPane().add(lblListagemDeUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, -1));

        lblFiltro.setText("Filtro:");
        getContentPane().add(lblFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));
        getContentPane().add(txtFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 180, -1));

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(btnPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nome", "Email"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 310, 190));

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        getContentPane().add(btnNovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, -1, -1));

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btnExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        // TODO add your handling code here:
         realizarBusca();
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        // TODO add your handling code here:
        
    System.out.println("Ação para criar um novo usuário.");

    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        int selectedRow = jTable1.getSelectedRow();
    if (selectedRow >= 0) {
        // Exemplo de como acessar o ID do usuário selecionado
        int userId = (int) modeloTabela.getValueAt(selectedRow, 0);
        System.out.println("Editar usuário com ID: " + userId);
    } else {
        System.out.println("Selecione um usuário para editar.");
    }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // TODO add your handling code here:
        int selectedRow = jTable1.getSelectedRow();
    if (selectedRow >= 0) {
        int userId = (int) modeloTabela.getValueAt(selectedRow, 0);
        System.out.println("Excluir usuário com ID: " + userId);
    } else {
        System.out.println("Selecione um usuário para excluir.");
    }
    }//GEN-LAST:event_btnExcluirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaListagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaListagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaListagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaListagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaListagem().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblFiltro;
    private javax.swing.JLabel lblListagemDeUsuarios;
    private javax.swing.JTextField txtFiltro;
    // End of variables declaration//GEN-END:variables
}
