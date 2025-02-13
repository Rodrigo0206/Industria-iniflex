package com.iniflex.industriapessoasfuncionarios;
import java.time.LocalDate;

public class Pessoa {

    private String nome;
    private LocalDate dataNascimento;

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

    // Método para calcular idade
    public int calcularIdade() {
        return LocalDate.now().getYear() - dataNascimento.getYear();
    }

    // Método toString para exibir os dados da pessoa
    @Override
    public String toString() {
        return "Nome: " + nome + ", Data de Nascimento: " + dataNascimento + ", Idade: " + calcularIdade();
    }

}
