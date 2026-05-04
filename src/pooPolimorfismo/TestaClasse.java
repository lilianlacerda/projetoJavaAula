package pooPolimorfismo;

public class TestaClasse {

	public static void main(String[] args) {

		// Classes abstratas não podem ser instanciadas
		// Pessoa p = new Pessoa("Maria", 18);
		//p.visualizar();
		
		TriAtleta t1 = new TriAtleta("Lilian", 27, 1);
		TriAtleta t2 = new TriAtleta("Carol", 27, 5);
		//t2.competicoesConcluidas();
		//t2.competicoesConcluidas(3);
		
		t1.visualizar();
		System.out.println(t2.caminhar());

	}

}
