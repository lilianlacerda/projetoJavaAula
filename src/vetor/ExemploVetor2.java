package vetor;

import java.util.Scanner;

public class ExemploVetor2 {

	public static void main(String[] args) {
		
		// Criando um vetor vazio com 3 posições
		int vetorNumeros[] = new int[3];
		
		Scanner leia = new Scanner(System.in);
		
		// Popular/Adicionar itens ao vetor. 
		for(int indice = 0; indice <= 2; indice++) {
			System.out.println("Digite um número: ");
			vetorNumeros[indice] = leia.nextInt(); 
		}
		
		// Mostrar itens do vetor
		for(int indice= 0; indice <= 2; indice++) {
			System.out.println((indice + 1) + "º elemento: " + vetorNumeros[indice]);
		}
		
		// Length verifica o tamanho do vetor. 
		System.out.println("Tamanho do Vetor: " + vetorNumeros.length);
	}

}
