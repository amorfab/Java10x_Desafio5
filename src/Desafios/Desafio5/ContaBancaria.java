package Desafios.Desafio5;

public abstract class ContaBancaria implements Conta {
    double saldo;
    TipoConta tipo;

    public ContaBancaria() {
    }

    public ContaBancaria(double saldo, TipoConta tipo) {
        this.saldo = saldo;
        this.tipo = tipo;
    }

    @Override
    public void consultarSaldo() {
        System.out.println("O saldo atual da Conta " + this.tipo + " é: " + this.saldo);
    }

    @Override
    public abstract void depositar(double valor);
}