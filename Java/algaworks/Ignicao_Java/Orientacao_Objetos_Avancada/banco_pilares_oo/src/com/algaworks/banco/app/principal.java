package com.algaworks.banco.app;

import com.algaworks.banco.models.ContaInvestimento;
import com.algaworks.banco.models.Pessoa;

public class principal {
    public static void main(String[] args) {
        //criando pessoa
        Pessoa titular1 = new Pessoa();
        titular1.setNome("Paulo Cesar");
        titular1.setDocumento("83748374");

        //criando o Objeto
        ContaInvestimento conta = new ContaInvestimento(titular1, 873847837, 773, 0.08, 5 );

        //chamando o metodo de depositar
        conta.despositar(2000.0);

        //Chamando o metodo de aplicacaoSelic
        double rendimento = conta.tesouroDireto();

        //exibindo
        System.out.println("Titular: " + conta.getTitular().getNome());
        System.out.println("Saldo apos aplicacoa " + conta.getSaldo());
        System.out.println("Rendimento gerado " + rendimento);
    }
}
