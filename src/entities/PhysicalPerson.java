package entities;

public class PhysicalPerson extends Person {
	private double gastosSaude;
	double rendaFinal = 0;

	public PhysicalPerson() {
	}

	public PhysicalPerson(String nome, Double rendaAnual, double gastosSaude) {
		super(nome, rendaAnual);
		this.gastosSaude = gastosSaude;
	}

	public double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}

	@Override
	public double impostoPago() {
		if (rendaAnual <= 20000.00) {
			rendaFinal = (rendaAnual * 0.15) - (gastosSaude * 0.50);
		} else {
			rendaFinal = (rendaAnual * 0.25) - (gastosSaude * 0.50);
		}
		return rendaFinal;
	}
}
