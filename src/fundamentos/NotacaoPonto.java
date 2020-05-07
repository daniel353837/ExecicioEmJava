package fundamentos;

public class NotacaoPonto {
    public static void main(String[] args) {
		
    	String s = " Bom dia X ";
    	s = s.replace("X", "Senhora"); // faz a junção de duas variaveis
    	s = s.toUpperCase(); // usado para mudar de letras minuscula para maiuscula
	    s = s.concat("!!!");
	    
	    System.out.println(s);
    
	    System.out.println(" Leo".toUpperCase());
	    
	    String x = " Daniel".toUpperCase();
	    System.out.println(x);
    }
}
