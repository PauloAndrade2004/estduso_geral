package com.algaworks.banco.models;

import java.util.Objects;

public class Conta {
    private Pessoa titular;
    private int agencia;
    private int numero;
    private double saldo; // Removendo static para saldo ser individual por conta

    public Conta(Pessoa titular, int agencia, int numero, double saldo) {
        this.titular = titular;
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
    }

    //criando getters e setter
    public int agencia() {
        return agencia;
    }

    public void setAgencia() {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero() {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo() {
        this.saldo = saldo;
    }

    //criando so metodos

    public void depositar(double valor) {
        if (valor < 0 ) {
            throw new IllegalArgumentException("Valor para deposito tem que ser maior que zero!");
        } else if (valor > 0) {
            System.out.println("Valor depositado com sucesso!");
        }

        this.saldo = saldo + valor;
    }

    public void sacar(double valor) {
        if (valor > saldo ) {
            throw  new IllegalArgumentException("Valor do saque ultrapassou seu saldo disponivel ");
        }else if (valor <= saldo ) {
            System.out.println("Saque feito com sucesso!");
        }
    }

    @Override
    public String toString() {
        return "Conta{" +
                "titular=" + titular +
                ", agencia=" + agencia +
                ", numero=" + numero +
                ", saldo=" + saldo +
                '}';
    }
}
