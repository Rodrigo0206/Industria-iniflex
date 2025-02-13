package com.iniflex.industriapessoasfuncionarios;

import java.time.LocalDate;

public class ClassePrincipal {
    public static void main(String[] args) {

        // Criando uma pessoa
        Pessoa pessoa = new Pessoa("João Silva", LocalDate.of(1990, 5, 15));

        // Exibindo os dados
        System.out.println(pessoa);

    }
}
