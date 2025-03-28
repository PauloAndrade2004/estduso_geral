package com.algaworks.banco.app;

import com.algaworks.banco.models.Conta;
import com.algaworks.banco.models.ContaInvestimento;
import com.algaworks.banco.models.Pessoa;

public class principal {
    public static void main(String[] args) {

        Pessoa titular1 = new Pessoa();
        titular1.setNome("Paulo Cesar");
        titular1.setDocumento(2223);

        Conta suaConta = new Conta(titular1, 3332, 332);


        ContaInvestimento minhaConta =  new ContaInvestimento(titular1, 5253, 535);
        minhaConta.depositar(15_000);
        minhaConta.sacar(1_000);
        minhaConta.tesouroDireto(0.8, 5);

        System.out.println("Titular: " + minhaConta.getTitular().getNome());
        System.out.println("Saldo: " + minhaConta.getSaldo());




    }
}
