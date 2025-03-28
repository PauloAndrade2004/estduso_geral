package com.algaworks.banco.models;


import javax.sound.midi.SysexMessage;
import java.util.Objects;
import java.util.Scanner;

public class ContaInvestimento extends Conta{

    Pessoa titular;
    private double juros;
    private int anos;

    //criando os construtor
    public ContaInvestimento(Pessoa titular, int agencia, int numero, double juros, int anos) {
        super(titular, agencia, numero); // Chama o construtor da classe Conta
        this.juros = juros;
        this.anos = anos;
    }



    //criando o metodo de aplicarInvestimentoselic
    public double  tesouroDireto() {

        double rendimento = getSaldo() * Math.pow(1 + juros, anos);
        despositar(rendimento);
        return rendimento;

    }
}




















