package fundamentos.Operadores;

public class DesafioLogicos {
	public static void main(String[] args) {
		//trabalho na terça (V ou F)
		//trabalho na quinta (V ou F)
		
		boolean trabalho1 = false;
		boolean trabalho2 = false;
		
		boolean comprouTv50 = trabalho1 && trabalho2;
		boolean comprouTv32 = trabalho1 ^ trabalho2;
		boolean comprouSorvete = trabalho1 || trabalho2;
		boolean maisSaudavel = !comprouSorvete;
		
		System.out.println("Comprou Tv de 50\"? " + comprouTv50);
		System.out.println("Comprou Tv de 32\"? " + comprouTv32);
		System.out.println("Comprou Tv de 32\"Sorvete? " + comprouSorvete);
		System.out.println("Mais saudavel ? "+ maisSaudavel);
		
		
	}

}
