package loja;

public class Funcionario {
	
		private String nome;
		private double valorPorHora;
		private int horasTrabalhadas;

		public Funcionario() {}
		
		public Funcionario(String nome, int horasTrabalhadas, double valorPorHora) {
			this.nome = nome;
			this.horasTrabalhadas = horasTrabalhadas;
			this.valorPorHora = valorPorHora;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public double getHorasTrabalhadas() {
			return horasTrabalhadas;
		}

		public void setHorasTrabalhadas(int horasTrabalhadas) {
			this.horasTrabalhadas = horasTrabalhadas;
		}

		public double getValorPorHora() {
			return valorPorHora;
		}

		public void setValorPorHora(double valorPorHora) {
			this.valorPorHora = valorPorHora;
		}

		public double salarioFinal() {
			return horasTrabalhadas * valorPorHora;
		}

		public String exibir() {
			return "Nome: " + this.nome + "\nHora trabalhadas: " + this.horasTrabalhadas + "\n" + "Salario por hora: "
					+ this.valorPorHora + "\nSalario final: " + salarioFinal();
		}
	}


