package classe;

public class Produto {
     
	String nome;
    double preco;
    double desconto;
    
    // metodo 
    double precoComDesconto(double descGerente) {
    	return preco *(1-desconto + descGerente );
    }
	
    double precoComDesconto() {
    	return preco *(1-desconto );
    }
}
