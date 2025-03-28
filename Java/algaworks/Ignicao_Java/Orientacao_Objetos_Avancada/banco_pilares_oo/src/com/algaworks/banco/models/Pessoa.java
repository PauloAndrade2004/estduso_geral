package com.algaworks.banco.models;

public class Pessoa{
    protected String nome;
    protected String documento;


    //Criando os métodos getters e setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }


    // Criando o método toString

    @Override
    public String toString() {
        return "Pessoa " +
                "nome = " + nome +
                ", documento='" + documento ;
    }
}

