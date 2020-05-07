package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		// Informações de um funcionario
		
		//Tipo numericos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_234_845_223L;
		
		
		// tipos numericos reais
		
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		// Tipo Booleano 
		
		boolean estaDeFerias = false; // true
		
		// Tipo caractere
		
		char status = 'A'; //ativo tipo caractere so aceita uma Letra
		
		
		// Dias de empresa de um funcionario
	    System.out.println(anosDeEmpresa * 365);
		
		//numero de voos
	    System.out.println(numeroDeVoos / 2);
	    
	    // Pontos por real
	    System.out.println(pontosAcumulados / vendasAcumuladas);
	    
	    // id
	    
	    System.out.println(id + ": ganha -> "+ salario);
	    
	    // Ferias 
	   
	    System.out.println("Férias? "+ estaDeFerias);
	   
	    // Status
	    
	    System.out.println("Status: "+ status);
	
	}

}
