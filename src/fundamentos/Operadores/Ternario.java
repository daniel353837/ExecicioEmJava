package fundamentos.Operadores;


public class Ternario {
	
	public static void main(String[] args) {
		
		double media = 7.6;
		String resultadoRecuperacao = media >=  5.0 ? " Em recupera��o" : "Reprovado";
		String resultado = media >= 7.0 ? "Aprovado" : resultadoRecuperacao;
		
		
		System.out.println("O aluno est� "+ resultado);
	    
	     
	}

}
