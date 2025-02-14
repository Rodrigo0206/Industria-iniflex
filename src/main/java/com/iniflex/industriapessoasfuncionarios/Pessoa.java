package com.iniflex.industriapessoasfuncionarios;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Pessoa {

    private String nome;
    private LocalDate dataNascimento;

    // Formato de data desejado
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    // Construtor
    public Pessoa(String nome, LocalDate dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int getIdade() {
        return Period.between(dataNascimento, LocalDate.now()).getYears();
    }

    // Método para calcular idade
    public int calcularIdade() {
        return LocalDate.now().getYear() - dataNascimento.getYear();
    }

    // Método toString formatando a data
    @Override
    public String toString() {
        return String.format("Nome: %s, Data de Nascimento: %s ",
                nome,
                dataNascimento.format(FORMATTER),
                calcularIdade());
    }
}
