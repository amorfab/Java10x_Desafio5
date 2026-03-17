package Desafios.Desafio5;

public class ContaPoupanca extends ContaBancaria{
    public ContaPoupanca() {
    }

    public ContaPoupanca(double saldo, TipoConta tipo) {
        super(saldo, tipo);
    }

    @Override
    public void depositar(double valor) {
        if (valor>0) {
            this.saldo += valor - (valor * .01);
            System.out.println("Deposito no valor de " + (valor - (valor * .01)) +" realizado com sucesso");
        }else{
            System.out.println("Valor inválido, insira um valor maior que zero.");
        }
    }

}
