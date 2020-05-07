package controle;

public class SwitchSemBreack {
  
	public static void main(String[] args) {
	    
		String faixa = "preta";
		
		switch(faixa.toLowerCase()) {
		case"preta":
			System.out.println(" Sabe fazer Bassai-Dai");
		case "Marrom":
			System.out.println(" Sabe fazer Tekki Shodan");
		case"roxa":
			System.out.println(" Sabe o Heian Godan");
		case"verde":	
            System.out.println(" Sabe fazer Heian Yodan");
		case "laranja":
			System.out.println(" Sabe fazer Heian Sandan");
		case"vermelha":
			System.out.println(" Sabe fazer Heian Nidan");
		case"amarelo":
			System.out.println(" Sabe fazer Heian Shodan");
			break;
		default:
			System.out.println(" Ainda não sabe Karate");
		
		}
		System.out.println("Fim");
		
		
		int idade =3;
		switch(idade) {
		case 3:
		   System.out.println("Sabe falar");
		case 2:
		   System.out.println("Sabe andar");
		case 1 :
		   System.out.println("Sabe correr");
		}
		
}
}
