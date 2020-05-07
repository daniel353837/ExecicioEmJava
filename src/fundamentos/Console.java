package fundamentos;

import java.util.Scanner;

public class Console {
 
	public static void main(String[] args) {
		
		System.out.print("Bom");
		System.out.print(" dia\n\n"); // print usa a mesma linha
		
		System.out.println("Bom");
		System.out.println("dia"); // usa quebra de linha
		
		System.out.printf("Mesagem %d %d %d %d %d %d %n",1,2,3,4,5,6);
		
		System.out.printf("Salário: %.1f%n",1234.5678);
        System.out.printf("Nome: %s%n","Joao");
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite seu nome:");
	    String nome = entrada.nextLine();
	    System.out.println("Seu nome é:"+nome);
	    
	    entrada.close();
	
	
	}
}
