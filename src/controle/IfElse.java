package controle;

import javax.swing.JOptionPane;

public class IfElse {
	public static void main(String[] args) {
	      String valor = JOptionPane.showInputDialog("Informe o n�mero:");
	      int numero = Integer.parseInt(valor);
	      
	     // Apenas IF
	      
	      if(numero % 2 == 0) {
	    	  System.out.println("N�mero � Par!");
	      }
	      if (numero % 2 == 1) {
	    	  System.out.println("N�mero � Impar");
	      }
	      
	    // If e Else
	      
	      if (numero % 2 == 0) {
	    	  System.out.println("O N�mero � Par!");
	      }else {
	    	  System.out.println("O N�mero � Impar");
	      }
	}
	

}
