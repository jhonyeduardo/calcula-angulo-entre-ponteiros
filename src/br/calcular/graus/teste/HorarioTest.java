package br.calcular.graus.teste;

import org.junit.Assert;
import org.junit.Test;

import br.calcular.graus.modelo.Horario;

public class HorarioTest {

	@Test
	public void calcularGrausTest() {
		int hora = 3;
		int minutos = 30;
		int expected = 75;

		Horario horario = new Horario(hora, minutos);

		System.out.println(horario.calcularGraus());
		Assert.assertEquals(expected, horario.calcularGraus());
	}

}
