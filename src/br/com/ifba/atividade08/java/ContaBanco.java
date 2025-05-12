/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade08.java;

/**
 *
 * @author Bruno
 */
public class ContaBanco {
    protected String tipoConta;
    public int numConta;
    private String donoConta;
    private int saldoConta;
    private boolean statusConta;

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getDonoConta() {
        return donoConta;
    }

    public void setDonoConta(String donoConta) {
        this.donoConta = donoConta;
    }

    public int getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(int saldoConta) {
        this.saldoConta = saldoConta;
    }

    public boolean isStatusConta() {
        return statusConta;
    }

    public void setStatusConta(boolean statusConta) {
        this.statusConta = statusConta;
    }

    public void abrirConta(String tipoConta){
        this.setTipoConta(tipoConta);
        this.setStatusConta(true);
        
        if(tipoConta.equals("cc")){
            this.setSaldoConta(50);
            System.out.println("Conta corrente criada com sucesso! Adicionado R$50 em sua conta.");
        } else if (tipoConta.equals("cp")){
            this.setSaldoConta(150);
            System.out.println("Conta poupança criada com sucesso! Adicionado R$150 em sua conta.");
        } else {
            System.out.println("Tipo inválido! Selecione cc ou cp.");
        }
    }
    
    public void fecharBanco(){
        if (this.saldoConta == 0){
            this.setStatusConta(false);
            System.out.println("Conta fechada com sucesso!");
        } else if(this.saldoConta > 0 ){
            System.out.println("A conta não pôde ser fechada. É necessário retirar o saldo.");
        } else {
            System.out.println("A conta não pôde ser fechada. É necessário quitar a dívida.");
        }
    }
    
    public void depositar(int valor){
        this.setSaldoConta(this.getSaldoConta() + valor);
    }
    
    public void sacar(int valor){
        if (this.getSaldoConta() >= valor){
            this.setSaldoConta(this.getSaldoConta() - valor);
            System.out.printf("Foi sacado R$%d de sua conta.\nSaldo atual: R$%d", valor, this.getSaldoConta());
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }
    
    public void pagarMensal(){
        if (this.isStatusConta() == true){
            if (tipoConta.equals("cc")){
                    this.setSaldoConta(getSaldoConta() - 12);
                    System.out.printf("Foi sacado R$12 de sua conta.\nSaldo atual: R$%d", this.getSaldoConta());
            }
            if (tipoConta.equals("cp")){
                    this.setSaldoConta(getSaldoConta() - 15);
                    System.out.printf("Foi sacado R$15 de sua conta.\nSaldo atual: R$%d", this.getSaldoConta());
            }
        } else {
            System.out.println("Conta fechada.");
        }
    }
}
