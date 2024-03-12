package banco;

import java.util.ArrayList;

public class Banco {
    public static void main(String[] args) {
        ContaCorrente uma = new ContaCorrente(5000.0);
        ContaCorrente outra = new ContaCorrente(15000.0);

        uma.sacar(1000);
        outra.depositar(2000);

        System.out.println(uma.saldo());
        ArrayList<ContaCorrente> contasDojose=new ArrayList<>();
        contasDojose.add(outra);
        Correntista jose = new Correntista("jose",162417626,contasDojose);
        System.out.println(outra.saldo());

    }
}

