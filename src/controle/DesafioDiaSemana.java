package controle;

import java.util.Scanner;

public class DesafioDiaSemana {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o dia da Semana ");
		
		String dia = entrada.next();
		
		if(dia.equalsIgnoreCase("Domingo")) {
			System.out.println(" Este � o 1� dia da semana");
		} else if (dia.equalsIgnoreCase("Segunda")) {
			System.out.println(" Este � o 2� dia da semana");
		} else if (dia.equalsIgnoreCase("Ter�a")) {
			System.out.println(" Este � o 3� dia da semana");
		} else if (dia.equalsIgnoreCase("Quarta")) {
			System.out.println(" Este � o 4� dia da semana");
		} else if (dia.equalsIgnoreCase("Quinta")) {
			System.out.println(" Este � o 5� dia da semana");
		} else if (dia.equalsIgnoreCase("Sexta")) {
			System.out.println(" Este � o 6� dia da semana");
		} else if (dia.equalsIgnoreCase("Sabado")) {
			System.out.println(" Este � o 7� dia da semana");
		} else System.out.println("N�o � um dia da semana valido");		
			
				
		entrada.close();
		
	}

}
