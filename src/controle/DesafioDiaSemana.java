package controle;

import java.util.Scanner;

public class DesafioDiaSemana {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o dia da Semana ");
		
		String dia = entrada.next();
		
		if(dia.equalsIgnoreCase("Domingo")) {
			System.out.println(" Este é o 1° dia da semana");
		} else if (dia.equalsIgnoreCase("Segunda")) {
			System.out.println(" Este é o 2° dia da semana");
		} else if (dia.equalsIgnoreCase("Terça")) {
			System.out.println(" Este é o 3° dia da semana");
		} else if (dia.equalsIgnoreCase("Quarta")) {
			System.out.println(" Este é o 4° dia da semana");
		} else if (dia.equalsIgnoreCase("Quinta")) {
			System.out.println(" Este é o 5° dia da semana");
		} else if (dia.equalsIgnoreCase("Sexta")) {
			System.out.println(" Este é o 6° dia da semana");
		} else if (dia.equalsIgnoreCase("Sabado")) {
			System.out.println(" Este é o 7° dia da semana");
		} else System.out.println("Não é um dia da semana valido");		
			
				
		entrada.close();
		
	}

}
