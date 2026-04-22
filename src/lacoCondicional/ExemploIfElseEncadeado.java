package lacoCondicional;

import java.util.Scanner;

public class ExemploIfElseEncadeado {

	public static void main(String[] args) {
		float nota1, nota2, media;
		Scanner leia = new Scanner(System.in);

		// Entrada de dados
		System.out.println("Digite a primeira nota: ");
		nota1 = leia.nextFloat();

		System.out.println("Digite a segunda nota: ");
		nota2 = leia.nextFloat();

		// Processamento
		media = (nota1 + nota2) / 2;

		// Saída de dados
		if (media >= 6) {
			System.out.println("Parabéns! pessoa participante aprovada!");

		} else {
			System.out.println("Infelzimente a pessoa participante foi reprovada.");

		}

	}

}
