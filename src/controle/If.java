package controle;

import java.util.Scanner;

public class If {
   public static void main(String[] args) {
	
	   Scanner entrada = new Scanner(System.in);
	   
	   System.out.print("Infome a m�dia:");
       double media = entrada.nextDouble();
       
       if (media <= 10 && media >= 7.0) {
	        System.out.println("Aprovado!");
	        System.out.println("Parab�ns!");
       }
	   if (media < 7 && media >= 4.5) {
		   System.out.println("Esta de Exame");
		   System.out.println("Estude Mais");
	   }
	   if (media < 4.5 && media >= 0) {
		   System.out.println("Foi Reprovado");
		   System.out.println("Ja era, tem novamente o ano que vem");
	   }
	
	
	
	
	entrada.close();
}
}
