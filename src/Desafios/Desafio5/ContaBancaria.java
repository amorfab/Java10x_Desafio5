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
    public abstract void consultarSaldo();

    @Override
    public abstract void depositar(TipoConta tipo, double valor);
}