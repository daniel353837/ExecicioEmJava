package fundamentos;



import javax.swing.JOptionPane;

public class ConversaoStringNumero {

	public static void main(String[] args) {
		 String valor1 =JOptionPane.showInputDialog("Digite o Primeiro Numero");
		 String valor2 =JOptionPane.showInputDialog("Digite o Segundo Numero");
		 
		 System.out.println("O valor digito foi "+valor1 + " e "+ valor2);
		 
		 double numero1 = Double.parseDouble(valor1);
		 double numero2 = Double.parseDouble(valor2);
		 
		 double soma = numero1 + numero2;
		 System.out.println("Soma � "+ soma);
		 System.out.println("A m�dia � "+ soma/2);
		 
	}
}
