package lacoRepeticao;

import java.util.Scanner;

public class ExemploFor {

	public static void main(String[] args) {
		String nome;
        Scanner leia = new Scanner(System.in);
        
        for(int contador = 1; contador <= 3; contador++ ) {
        	
        	System.out.println("\nDigite o " + contador + "° nome: ");
            nome = leia.nextLine();
            System.out.println("O " + contador + "° nome é: " + nome);
        }

	}

}
