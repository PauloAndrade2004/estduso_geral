package com.algaworks.banco.models;


public class ContaInvestimento extends Conta{

    public ContaInvestimento(Pessoa titular, int agencia, int numero) {
        super(titular, agencia, numero);

    }

    //criando o metodo de investimento
    public void tesouroDireto(double juros, int ano ) {
        double rendimento = getSaldo() * Math.pow(1 + juros, ano);
        depositar(rendimento);
    }
}




















