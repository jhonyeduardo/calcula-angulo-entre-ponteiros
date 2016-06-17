package br.calcular.graus.modelo;

public class Horario {

	private int horas;
	private int minutos;

	public Horario(int horas, int minutos) {
		this.horas = horas;
		this.minutos = minutos;
	}

	public int getHoras() {
		return this.horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public int getMinutos() {
		return this.minutos;
	}

	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}

	public int calcularGraus() {
		int resultado = 0;

		int grausPorHora = 360 / 12;
		int restoAngulo = this.minutos * grausPorHora / 60;

		float anguloHora = grausPorHora * this.horas + restoAngulo;
		float anguloMin = 360 / 60 * this.minutos;

		resultado = Math.round(anguloHora - anguloMin);

		return Math.abs(resultado);
	}
}
