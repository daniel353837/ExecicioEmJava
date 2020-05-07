
//Nome:Daniel Luiz dos Santos
//Matricula: 28162326
// Curso: Ciencias da computação

package arrays;



import java.util.Scanner;
import java.util.Arrays;

		public class Agenda {
			
			
			public static void main(String[] args) {
				String[] nome = new String[10];      
				String[] email = new String[10];    
				int opcao =0;
				int numero =0; 
				int sair=0;
				int opcao2=0;
				int opcao3=0;
				String busca="";
				String apagar="";
				int bnome=0;
				int contador=0;
				Scanner entrada = new Scanner (System.in);
				
				
				
			do {
				
				System.out.println("\t\t(<<BEM VINDO A AGENDA>>)");
				System.out.println("Para Incluir o contato de N° 0 digite 1");
				System.out.println("Para Buscar Contato digite 2");
				System.out.println("Para excluir contato digite 3");
				System.err.println("Para Sair digite (4)");
				opcao = entrada.nextInt();
	
				switch(opcao) {

				case 1:
					
				System.out.println(" Quantos contatos deseja Cadastrar");
				sair = entrada.nextInt();
					
				do {
					
				System.out.println("Numero do Contato: ("+ numero +") \n Digite o nome:");
				nome[numero] = entrada.next();
				System.out.println("digite o email");
				email[numero] = entrada.next();
				numero++;
					
				}while(numero <= sair);
				break;
				
				case 2:
					
				System.out.println("Digite 1 para exibir agenda completa");
				System.out.println("Digite 2 para buscar pelo nome ");
				System.out.println("Digite 3 para buscar pelo numero");
				System.err.println("Digite (4) sair");
				opcao2 = entrada.nextInt();
				
				if(opcao2 == 1) {
				for(int contador3=0;contador3 <= numero;contador3++) {		
				System.out.println(contador3+" Nome: "+nome[contador3]+"\n"+contador3+" Email: "+email[contador3]+"\n");	
				}	
				}
					
				if(opcao2==2) {	
				System.out.println("Digite nome do contato: ");
				busca=entrada.next();
				for (contador=0;contador <= numero;contador++) {		
				if(busca.equalsIgnoreCase(nome[contador])){
				System.out.println("Numero: "+contador+"\nNome: "+nome[contador]+"\nEmail: "+email[contador]);
				}
			    }
				}
				
				if(opcao2==3) {
				System.out.println("Digite o numero do contato: ");
				bnome=entrada.nextInt();
				System.out.println("Numero: "+bnome+"\nNome: "+nome[bnome]+"\nEmail: "+email[bnome]);
				}
				break;
	
				case 3:
					System.out.println("Digite 1 para apagar agenda completa");
					System.out.println("Digite 2 para apagar pelo nome ");
					System.out.println("Digite 3 para apagar pelo numero");
					System.err.println("Digite (4) sair");
					opcao3=entrada.nextInt();
					
					if(opcao3 == 1) {	
					for (contador=0;contador <= numero;contador++) {
					nome[contador]=apagar;
					email[contador]=apagar;
					}
					numero=0;
					System.out.println("Agenda Excluida");	
					}	
					
					if(opcao3==2) {
					System.out.println("Digite nome do contato: ");
					busca=entrada.next();
					for (contador=0;contador <= numero;contador++) {	
					if(busca.equalsIgnoreCase(nome[contador])) {
					System.out.println("Numero: "+contador+"\nNome: "+nome[contador]+"\nEmail: "+email[contador]);
					nome[contador]=apagar;
					email[contador]=apagar;
					System.out.println("contato foi Excluido");
					}
					else	System.out.println("contato nao encontrado");
				    }
					}
					
					if(opcao3==3) {
					System.out.println("Digite o numero do contato: ");
					bnome=entrada.nextInt();
					System.out.println("Numero: "+bnome+"\nNome: "+nome[bnome]+"\nEmail: "+email[bnome]);
					nome[contador]=apagar;
					email[contador]=apagar;
					System.out.println("contato foi Excluido");
					}
					break;
						
		}	
		} while (opcao < 4);System.out.println(" Agenda Encerrada ");
		
		    System.out.println( " posição dos vetores");
		    System.out.printf(Arrays.toString(nome)+"\n");
		    System.out.printf(Arrays.toString(email)+"\n");
		entrada.close();
		
		
		}
		}


