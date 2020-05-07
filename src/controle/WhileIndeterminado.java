package controle;

import java.util.Scanner;

public class WhileIndeterminado {
	
      public static void main(String[] args) {
	      
    	  System.out.println("Digete o texto:\n Para encerrar digite a palavra sair");
    	  Scanner entrada = new Scanner (System.in);
    	  
    	  String valor ="";
    	  while(!valor.equalsIgnoreCase("sair")) {
    		  System.out.print("Escreva:");
    		  valor = entrada.nextLine();
    	  }
    	  
    	  entrada.close();
}
}
