package controle;

import java.util.Scanner;

public class IfElseIf {
    public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a Nota: ");
		
		double nota = entrada.nextDouble();
		
		if(nota > 10 || nota < 0) {
			System.out.println("Nota Digitada Invalida!");
		}else {
			System.out.println("Nota Valida!");
		}
		if(nota == 10 ) {
			System.out.println("Nota A ");
			System.out.println("Aprovado, Parabens!!!  ");
			
		}
		if(nota == 9 || nota == 8) {
			System.out.println("Nota B ");
			System.out.println("Aprovado!!!");
		}
		if(nota == 7 || nota == 6) {
			System.out.println("Nota C ");
			System.out.println("Aprovado na Media ");
		}
		if(nota == 5 ) {
			System.out.println("Nota D ");
			System.out.println("Esta de Recuperação");
		}else {
			System.out.println("Nota E ");
			System.out.println("Reprovado, tente novamente o ano que vem!");
		}
		
		
		
		
		
		entrada.close();
	}
}
