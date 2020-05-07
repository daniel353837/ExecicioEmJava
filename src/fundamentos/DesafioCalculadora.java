package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

	// ler num1
	// ler num2
	// + - * / %
	
	public static void main(String[] args) {
	    Scanner entrada = new Scanner (System.in);
		
	    System.out.print("Informe um Número:");
		double num1 = entrada.nextDouble();
		
		System.out.print("Informe o proximo Número:");
		double num2 = entrada.nextDouble();
		
		System.out.print("Informe a operação");
		String op = entrada.next();
         
		System.out.printf("%.2f %s %.2f = ?", num1, op, num2);
		
		
		
		
		
		
		
		
		entrada.close();
	}
	
	
	
}
