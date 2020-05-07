package fundamentos;

public class TipoString {
  
	public static void main(String[] args) {
	 System.out.println("Ola pessoal".charAt(2));
	 
	 String s = "Boa tarde";
	 System.out.println(s.concat("!!!"));                     //faz soma das string com a parte literal
	 System.out.println(s+"!!!");                             // faz soma das string + a parte literal
	 System.out.println(s.startsWith("Boa"));                 // compara se a palavra inicia com a mesma palavra que foi armazenada na string
	 System.out.println(s.toLowerCase().startsWith("boa"));   // iguinora se e maiuscula ou misnucula
	 System.out.println(s.length());                          //comprimento da string
	 System.out.println(s.endsWith("dia"));                   // verifica se termina com a mesma palavra 
     System.out.println(s.equals("boa tarde"));               // verifica se são iquais
	 System.out.println(s.equalsIgnoreCase("boa tarde"));     // verifica se são iguais e iguinora se sao maiuscula ou minusculo
     	
	String nome = "Pedro";
	String sobrenome = "Santos";
	int idade = 33;
    double salario = 1234.987;
    
    System.out.printf("O senhor %s %s tem %d anos e ganha R$ %s ",nome,sobrenome,idade,salario);
	
	}
}
