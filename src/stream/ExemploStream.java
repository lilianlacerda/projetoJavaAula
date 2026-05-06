package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ExemploStream {

	public static void main(String[] args) {
		
		List<String> estados = Arrays.asList("São Paulo", "Rio de Janeiro", "Minas Gerais","Espirito Santo", 
				"São Paulo", "Rio de Janeiro", "Minas Gerais", "São Paulo", "Rio de Janeiro");
		
		// Stream
		List<String> estadosEmMaiusculo = estados.stream()
				.map(x -> x.toUpperCase()) // Operação Intermediaria  (processamento)
				.collect(Collectors.toList()); // Operação Terminal (Finalização)
		
		List<String> estadosUnicos = estados.stream()
				.distinct()
				.collect(Collectors.toList()); // Collect de "coletar" 
		
		long quantidadeDeEstados = estados.stream()
				.distinct()
				.count(); // Operação Terminal
		
		System.out.println("Estados em Maiúsculo: " + estadosEmMaiusculo);
		System.out.println("\nEstados únicos: " + estadosUnicos);
		System.out.println("\nQuantidade de Estados únicos: " + quantidadeDeEstados);
		
		System.out.println("\nColeção/Dados Inicial: " + estados);
		

	}

}
