package poo;

public class Carro {
	
	//Atributos
	private String marca;
	private int rodas;
	private int portas;
	private String modelo_motor;
	
	//Metodo construtor 
	public Carro(String marca, int rodas, int portas, String modelo_motor) {
		this.marca = marca; // This => classe
		this.rodas = rodas; // Carro.rodas = Parametro rodas
		this.portas = rodas; // 
		this.modelo_motor = modelo_motor;
	}
	
	//Metodos de acesso/Especiais - (get - pega /set - coloca)
	public String getMarca() {
		return marca;
	}
	
	public int getPortas() {
		return portas;
	}
	
	public void setMarca(String marca) {
		this.marca = marca; // (this = esse )essa classe, pertence a essa variavel marca 
		// Carro.marca = parametro marca
	}
	
	
	//Metodos
	//Static é independente, não prcisa de nada pra ser invocado como locomover 
	//é uma ação do carro, ele não precisa receber o static
	public void locomover() {
		System.out.println("Estou me lecomovendo...");
	}
	
	public String parar() {
		return "estou parando";
		
	}

}
