package controle;

import java.util.Scanner;

public class DesafioWhile {
     public static void main(String[] args) {
		
    	 Scanner entrada = new Scanner(System.in);
    	 
    	 
    	 int quantidadeDeNotas = 0;
    	 double nota = 0;
    	 double total = 0;
    	 
    	 while(nota != -1) {
    		 System.out.println("Digite a nota:\n ou digite -1 para Sair");
    		 nota = entrada.nextDouble();
    		 
    		 if(nota <= 10 && nota >= 0) {
    		 total += nota;
    		 quantidadeDeNotas++;
    		 }else {
    			 System.out.println("Nota Invalida!");
    		 }
    	}
    	 
    	 // calcular a media
    	 
    	 double media =total /quantidadeDeNotas;
    	 System.out.println("M�dia = "+media);
    	 
    	 
    	 
    	 
    	 entrada.close();
	}
}
