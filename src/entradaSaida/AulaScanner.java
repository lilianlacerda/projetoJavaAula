package entradaSaida;

import java.util.Scanner;

public class AulaScanner {

	//Metodo main que executa nosso código
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String nome;
		
		System.out.println("Digite seu nome: ");
		nome = leia.nextLine();
		
		System.out.println("Bom dia, " + nome);

	}

}
