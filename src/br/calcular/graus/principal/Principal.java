package br.calcular.graus.principal;

import java.util.Scanner;

import br.calcular.graus.modelo.Horario;

public class Principal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String horario = "";
		int hora = 0;
		int min = 0;

		int index = 0;

		System.out.println("Digite um horario no formato XhYm");
		horario = input.nextLine();

		try {
			if (horario.indexOf("h") != -1) {
				hora = Integer.parseInt(horario.substring(0, horario.indexOf("h")));
			}

			if (horario.indexOf("m") != -1) {
				index = horario.indexOf("h") + 1;
				min = Integer.parseInt(horario.substring(index, horario.indexOf("m")));
			}

			System.out.println("Resultado: " + new Horario(hora, min).calcularGraus() + "º");
		} catch (Exception e) {
			System.out.println("Informe no padrão: XhYm. " + e.getMessage());
		}
	}
}
