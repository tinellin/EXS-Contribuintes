package entities;

public class LegalPerson extends Person {

	private double numFuncionarios;
	double rendaFinal = 0;

	public LegalPerson() {
	}

	public LegalPerson(String nome, Double rendaAnual, double numFuncionarios) {
		super(nome, rendaAnual);
		this.numFuncionarios = numFuncionarios;
	}

	public double getNumFuncionarios() {
		return numFuncionarios;
	}

	public void setNumFuncionarios(double numFuncionarios) {
		this.numFuncionarios = numFuncionarios;
	}

	@Override
	public double impostoPago() {
		if (numFuncionarios >= 10) {
			rendaFinal = rendaAnual * 0.14;
		} else {
			rendaFinal = rendaAnual * 0.16;
		}
		return rendaFinal;
	}
}
