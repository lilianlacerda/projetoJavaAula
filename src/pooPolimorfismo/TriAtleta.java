package pooPolimorfismo;

public class TriAtleta extends Pessoa implements ICiclista{
	
	int competicoes;

	public TriAtleta(String nome, int idade, int competicoes) {
		super(nome, idade);
		this.competicoes = competicoes;
	}

	public int getCompeticoes() {
		return competicoes;
	}

	public void setCompeticoes(int competicoes) {
		this.competicoes = competicoes;
	}
	
	public void competicoesConcluidas() {
		System.out.println("Competições Concluidas: " + this.competicoes);
	}
	
	// Polimorfismo de sobrecarga (sobrecarga de métodos)
	public void competicoesConcluidas(int numero) {
		System.out.println("COmpetições COncluidas: " + numero);
	}
	
	// Polimorfismo de sobrescrita (sobrescrita de métodos)
	public void visualizar() {
		super.visualizar();
		System.out.println("Competições: " + this.competicoes);
	}
	
	/*public String caminhar() {
		return super.caminhar() + " 1km";
	}*/
	
	// Métodos Implementados das Interfaces 
	public void pedalar() {
		System.out.println("Estou pedalando...");
	}

	@Override // Anotação - Etiqueta de dados/Info
	public String aquecer() {
		return "Estou me aquecendo...";
	}
	
	
	
}