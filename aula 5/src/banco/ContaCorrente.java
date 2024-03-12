package banco;

public class ContaCorrente {
    double saldo;
    ContaCorrente(double saldo){
        this.saldo=saldo;
    }
    void sacar(double saque){
        saldo=saldo - saque;
    }
    void depositar(double deposito){
        saldo=saldo + deposito;
    }
    double saldo(){
        return saldo;
    }
}


