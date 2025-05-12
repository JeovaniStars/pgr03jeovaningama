/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade08.java;

import java.util.Scanner;

public class TesteConta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaBanco minhaConta = new ContaBanco();

        int opcao;
        do {
            System.out.println("\n=== Menu de Operações ===");
            System.out.println("1. Abrir Conta");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("4. Pagar Mensalidade");
            System.out.println("5. Fechar Conta");
            System.out.println("6. Verificar Saldo");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    if (minhaConta.isStatusConta()) {
                        System.out.println("A conta já está aberta!");
                    } else {
                        System.out.print("Digite o tipo de conta (cc para Corrente ou cp para Poupança): ");
                        String tipo = scanner.next();
                        minhaConta.abrirConta(tipo);
                        System.out.print("Digite o nome do dono da conta: ");
                        scanner.nextLine(); // Consumir o newline
                        String dono = scanner.nextLine();
                        minhaConta.setDonoConta(dono);
                        System.out.println("Conta aberta com sucesso!");
                    }
                    break;

                case 2:
                    if (minhaConta.isStatusConta()) {
                        System.out.print("Digite o valor para depositar: ");
                        int valorDeposito = scanner.nextInt();
                        minhaConta.depositar(valorDeposito);
                    } else {
                        System.out.println("A conta está fechada. Não é possível depositar.");
                    }
                    break;

                case 3:
                    if (minhaConta.isStatusConta()) {
                        System.out.print("Digite o valor para sacar: ");
                        int valorSaque = scanner.nextInt();
                        minhaConta.sacar(valorSaque);
                    } else {
                        System.out.println("A conta está fechada. Não é possível sacar.");
                    }
                    break;

                case 4:
                    if (minhaConta.isStatusConta()) {
                        minhaConta.pagarMensal();
                    } else {
                        System.out.println("A conta está fechada. Não é possível pagar a mensalidade.");
                    }
                    break;

                case 5:
                    if (minhaConta.isStatusConta()) {
                        if (minhaConta.getSaldoConta() == 0) {
                            minhaConta.fecharConta();
                            System.out.println("Conta fechada com sucesso!");
                        } else {
                            System.out.println("A conta não pode ser fechada. O saldo precisa estar zerado.");
                        }
                    } else {
                        System.out.println("A conta já está fechada.");
                    }
                    break;

                case 6:
                    System.out.printf("Saldo atual: %d\n", minhaConta.getSaldoConta());
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}

