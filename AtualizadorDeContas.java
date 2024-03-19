package atividade6;

public class AtualizadorDeContas {

    private double saldoTotal = 0;
    private double selic;

    AtualizadorDeContas(double selic){
        this.selic = selic;
    }

    void roda (Conta c) {
        System.out.println("O seu saldo era: " + c.getSaldo());
        c.atualiza(selic);
        this.saldoTotal += c.getSaldo();
        System.out.println("O seu saldo agora é: " + c.getSaldo());

    }

    public double getSaldoTotal() {
        return saldoTotal;
    }
}
