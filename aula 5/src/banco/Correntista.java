package banco;

import java.util.ArrayList;

public class Correntista {
    String nome;
    double cpf;
    ArrayList<ContaCorrente> contaCorrentes;

    Correntista(String nome, double cpf, ArrayList<ContaCorrente> contaCorrentes) {
        this.nome = nome;
        this.cpf = cpf;
        this.contaCorrentes = contaCorrentes;
    }

    void transferencia(double valor, ContaCorrente contaCreditada) {
        // Realiza a transferência
        contaCreditada.depositar(valor);
    }
}