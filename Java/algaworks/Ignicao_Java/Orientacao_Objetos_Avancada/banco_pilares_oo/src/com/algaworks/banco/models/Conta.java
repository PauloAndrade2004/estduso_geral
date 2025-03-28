package com.algaworks.banco.models;

import java.util.Objects;

public class Conta {
    private Pessoa titular;
    private int agencia;
    private int numero;
    protected double saldo; // Removendo static para saldo ser individual por conta

    //criando construtor
    public Conta(Pessoa titular ,int agencia, int numero) {
        Objects.requireNonNull(titular, "Titular não pode ser nulo");
        this.titular = titular;
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
    }

    //criando metodo de depositar
    public void  despositar(double valor) {
        if (valor < 0 ) {
            throw new IllegalArgumentException("Valor do deposito tem que ser maior que zero");
        }

        this.saldo = saldo += valor;
    }

    public void sacar(double valor) {
        if (valor <= saldo ) {
            throw new IllegalArgumentException("Valor do saque deve ser menor ou igual ao saldo disponivel na conta");
        }

        this.saldo = saldo -= valor;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo() {
        this.saldo = saldo;
    }

    public Pessoa getTitular() {
        return titular;
    }

    public void setTitular(Pessoa titular) {
        this.titular = titular;
    }

    @Override
    public String toString() {
        return "Conta " +
                "agencia = " + agencia +
                ", numero = " + numero +
                ", saldo = " + saldo;
    }
}
