package entradaSaida;

import java.util.Scanner;

public class AulaOperadores {

	public static void main(String[] args) {
		
		// Variaveis 
		float celsius;
		float fahrenheit;
		
		Scanner leia = new Scanner(System.in);
		
		//Entrada de dados
		System.out.println("Digite a temperatura em Celsius: ");
		celsius = leia.nextFloat();
		
		//Processamento 
		fahrenheit = celsius * 1.8f + 32;
		
		//Saída 
		System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);
		
		

	}

}
