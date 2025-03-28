package com.algaworks.banco.models;

public class Pessoa{
    protected String nome;
    private int  documento;

    //criando o gatter e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    //criando o metodo toString
    @Override
    public String toString() {
        return "Nome: " + nome + "Documento: " + documento;
    }

}

