package Desafios.Desafio5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Entrada de dados
        Scanner scanner = new Scanner(System.in);

        //Contadores
        int opcaoMenu = -1;
        int opcaoConta = 0;

        ContaPoupanca contaPoupanca = new ContaPoupanca(0, TipoConta.POUPANCA);
        ContaCorrente contaCorrente = new ContaCorrente(0, TipoConta.CORRENTE);

        while (opcaoMenu != 0){
            System.out.println("\n=== Bem-vindo ao Banco de Konoha! ===");
            System.out.println("Escolha uma opção abaixo:");
            System.out.println("1. Depositar");
            System.out.println("2. Verificar saldo");
            System.out.println("0. Sair");
            System.out.print("Opção: ");
            opcaoMenu = scanner.nextInt();
            scanner.nextLine();

            switch (opcaoMenu) {
                case 1:     //Depositar
                    System.out.println("\nEm qual conta deseja fazer o depósito?");
                    System.out.println("1. " + TipoConta.CORRENTE);
                    System.out.println("2. " + TipoConta.POUPANCA);
                    opcaoConta = scanner.nextInt();
                    scanner.nextLine();

                    while (true) {
                        if (opcaoConta == 1) {
                            System.out.print("Digite o valor a depositar na conta Corrente: R$ ");
                            double valor = scanner.nextDouble();
                            contaCorrente.depositar(TipoConta.CORRENTE, valor);
                            break;
                        } else if (opcaoConta == 2) {
                            System.out.print("Digite o valor a depositar na conta Poupança: R$ ");
                            double valor = scanner.nextDouble();
                            contaPoupanca.depositar(TipoConta.POUPANCA, valor);
                            break;
                        } else {
                            System.out.print("Opção inválida. Digite novamente: ");
                            opcaoConta = scanner.nextInt();
                            scanner.nextLine();
                        }
                    }
                    break;
                case 2:     //Consultar Saldo
                    System.out.println("\nEscolha a conta que deseja consultar o saldo:");
                    System.out.println("1. " + TipoConta.CORRENTE);
                    System.out.println("2. " + TipoConta.POUPANCA);
                    opcaoConta = scanner.nextInt();
                    scanner.nextLine();

                    while(true){
                        if(opcaoConta == 1){
                            contaCorrente.consultarSaldo();
                        }
                        else if(opcaoConta == 2){
                            contaPoupanca.consultarSaldo();
                        }
                        else{
                            System.out.print("Opção inválida. Digite novamente: ");
                            opcaoConta = scanner.nextInt();
                            scanner.nextLine();
                        }
                        break;
                    }
                    break;
                case 0:
                    System.out.println("Você escolheu sair. Obrigado por utilizar nossos serviços!");
                    break;
                default:
                    System.out.println("Esta opção não é válida");
                    break;
            }
        }
        scanner.close();
    }
}
