package pooHeranca;

// A classe estudante herda todas as caracteríscas da pessoa e tem as suas próprias. 
public class Estudante extends Pessoa { // Classe filha ou classe derivada de pessoa 
	
	// Atributos
    private String matricula;
    private String curso;
    
	public Estudante(String nome, int idade, String email, String matricula, String curso) {
		// Super é uma palavra reservada que representa o método construtor da classe mãe 
		super(nome, idade, email);
		this.matricula = matricula;
		this.curso = curso;
	}
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
}