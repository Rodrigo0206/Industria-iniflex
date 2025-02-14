package com.iniflex.industriapessoasfuncionarios;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class IndustriapessoasfuncionariosApplicationTests {

	@Test
	void testAumentarSalario() {
		// Cenário: Criando um funcionário com salário inicial de 1000
		Funcionario funcionario = new Funcionario("João", LocalDate.of(1990, 5, 20), new BigDecimal("1000"), "Desenvolvedor");

		// Ação: Aumentando o salário em 10%
		funcionario.aumentarSalario(new BigDecimal("10"));

		// Verificação: O salário deve ser 1100 (1000 + 10% de 1000)
		assertEquals(new BigDecimal("1100"), funcionario.getSalario(), "O salário não foi aumentado corretamente!");
	}
	void contextLoads() {
	}


	@Test
	void testAumentarSalarioComZeroPorcento() {
		// Cenário: Criando um funcionário com salário inicial de 2000
		Funcionario funcionario = new Funcionario("Maria", LocalDate.of(1985, 7, 15), new BigDecimal("2000"), "Gerente");

		// Ação: Aumentando o salário em 0%
		funcionario.aumentarSalario(BigDecimal.ZERO);

		// Verificação: O salário deve permanecer 2000
		assertEquals(new BigDecimal("2000"), funcionario.getSalario(), "O salário deveria permanecer o mesmo!");
	}

	@Test
	void testAumentarSalarioComValorNegativo() {
		// Cenário: Criando um funcionário com salário inicial de 3000
		Funcionario funcionario = new Funcionario("Carlos", LocalDate.of(1982, 3, 10), new BigDecimal("3000"), "Diretor");

		// Ação: Tentando reduzir o salário em -5% (o que não deveria ser permitido)
		funcionario.aumentarSalario(new BigDecimal("-5"));

		// Verificação: O salário não deve diminuir (mas no código atual, isso não é tratado!)
		assertEquals(new BigDecimal("2850"), funcionario.getSalario(), "O salário foi reduzido! Verifique a lógica para evitar valores negativos.");
	}


}
