package controle;

import javax.swing.JOptionPane;

public class IfElse {
	public static void main(String[] args) {
	      String valor = JOptionPane.showInputDialog("Informe o número:");
	      int numero = Integer.parseInt(valor);
	      
	     // Apenas IF
	      
	      if(numero % 2 == 0) {
	    	  System.out.println("Número é Par!");
	      }
	      if (numero % 2 == 1) {
	    	  System.out.println("Número é Impar");
	      }
	      
	    // If e Else
	      
	      if (numero % 2 == 0) {
	    	  System.out.println("O Número é Par!");
	      }else {
	    	  System.out.println("O Número é Impar");
	      }
	}
	

}
