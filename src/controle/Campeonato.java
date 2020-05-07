package controle;

import java.util.Scanner;

public class Campeonato {
	
	public static void main(String[] args) {
		
	
		
        System.out.println("Digite o Nome do Time Mandante ");		
		Scanner entrada = new Scanner(System.in);
		String time1 = entrada.next();
		
		System.out.println("Digite o Nome do Time Visitante ");		
		String time2 = entrada.next();
		
		System.out.println("Partida sera entre:");
		System.out.println(time1 + " X "+ time2 );
		
		
		System.out.println("Digite o Gols do "+ time1);
		String gols = entrada.next();
	
		System.out.println("Digite o Gols do "+ time2);
		String gols1 = entrada.next();
		
		System.out.println(" Placar foi: "+time1+" "+gols+" X "+gols1+" "+time2);
		
		entrada.close();
		
		
		if(gols.equals(gols1)) {
		System.out.println(" EMPATE!!! ");
		}else {
			System.out.println(" Parabens pela Vitoria!!!");
		}
	}

	}

