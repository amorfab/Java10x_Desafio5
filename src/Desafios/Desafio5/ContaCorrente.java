package Desafios.Desafio5;

public class ContaCorrente extends ContaBancaria{

    public ContaCorrente() {
    }

    public ContaCorrente(double saldo, TipoConta tipo) {
        super(saldo, tipo);
    }

    @Override
    public void depositar(double valor) {
        if (valor>0) {
            this.saldo += valor;
            System.out.println("Deposito no valor de " + valor + " realizado com sucesso");
        }else{
            System.out.println("Valor inválido, insira um valor maior que zero.");
        }
    }

}
