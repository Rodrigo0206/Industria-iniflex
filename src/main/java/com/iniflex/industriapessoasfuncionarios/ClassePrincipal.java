package com.iniflex.industriapessoasfuncionarios;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class ClassePrincipal {
    public static void main(String[] args) {


        // Criando a lista de funcionários
        List<Funcionario> funcionarios = new ArrayList<>();

        // Adicionando funcionários à lista
        funcionarios.add(new Funcionario("Maria", LocalDate.of(2000, 10, 18), new BigDecimal("2009.44"), "Operador"));
        funcionarios.add(new Funcionario("Joao", LocalDate.of(1990, 5, 12), new BigDecimal("2284.38"), "Operador"));
        funcionarios.add(new Funcionario("Caio", LocalDate.of(1981, 5, 2), new BigDecimal("9836.14"), "Coordenador"));
        funcionarios.add(new Funcionario("Miguel", LocalDate.of(1988, 10, 14), new BigDecimal("19119.88"), "Diretor"));
        funcionarios.add(new Funcionario("Alice", LocalDate.of(1995, 1, 5), new BigDecimal("2234.68"), "Recepcionista"));
        funcionarios.add(new Funcionario("Heitor", LocalDate.of(1999, 11, 19), new BigDecimal("1582.72"), "Operador"));
        funcionarios.add(new Funcionario("Arthur", LocalDate.of(1983, 3, 31), new BigDecimal("4071.84"), "Contador"));
        funcionarios.add(new Funcionario("Laura", LocalDate.of(1994, 7, 8), new BigDecimal("3017.45"), "Gerente"));
        funcionarios.add(new Funcionario("Heloisa", LocalDate.of(2003, 5, 24), new BigDecimal("1606.85"), "Eletricista"));
        funcionarios.add(new Funcionario("Helena", LocalDate.of(1996, 9, 2), new BigDecimal("2799.93"), "Gerente"));

        // Removendo "Joao"
        funcionarios.removeIf(funcionario -> funcionario.getNome().equalsIgnoreCase("Joao"));

        // Aplicando aumento de 10% para todos os funcionários
        for (Funcionario f : funcionarios) {
            f.aumentarSalario(new BigDecimal("10"));
        }

        // Exibindo a lista atualizada
        System.out.println("Lista de funcionários após remover João e com aumento de 10% :");
        funcionarios.forEach(System.out::println);

        // Agrupar funcionários por função
        Map<String, List<Funcionario>> funcionariosPorFuncao = funcionarios.stream()
                .collect(Collectors.groupingBy(Funcionario::getFuncao));

        // Exibir os funcionários agrupados por função
        System.out.println("\nFuncionários agrupados por função:");
        for (Map.Entry<String, List<Funcionario>> entry : funcionariosPorFuncao.entrySet()) {
            System.out.println("\nFunção: " + entry.getKey());
            entry.getValue().forEach(System.out::println);
        }



        // Exibindo a lista atualizada com o aumento de salário
       // System.out.println("\nLista de funcionários após o aumento de 10%:");
       // for (Funcionario f : funcionarios) {
          //  System.out.println(f.getNome() + " - Salário: R$ " + f.getSalarioFormatado() + " - " + f.getFuncao());
     //   }

        //Exibir salários formatados
        //for (Funcionario f : funcionarios) {
          //  System.out.println(f.getNome() + " - Salário: R$ " + f.getSalarioFormatado() +" - "  + f.getFuncao() );
        //



        }
        }






