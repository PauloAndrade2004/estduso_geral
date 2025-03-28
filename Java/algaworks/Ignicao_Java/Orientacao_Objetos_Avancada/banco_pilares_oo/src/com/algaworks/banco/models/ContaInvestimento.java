package com.algaworks.banco.models;


import javax.sound.midi.SysexMessage;
import java.util.Objects;
import java.util.Scanner;

public class ContaInvestimento extends Conta{

    private int ano;
    private double juros;

    public ContaInvestimento(Pessoa titular, int agencia, int numero, double saldo,double juros, int ano) {
        super(titular, agencia, numero, saldo);
        this.ano = ano;
        this.juros = juros;
    }

    //criando o metodo de investimento
    public void tesouroDireto() {
        double rendimento = getSaldo() * Math.pow(1 + juros, ano);
    }
}




















