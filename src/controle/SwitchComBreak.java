package controle;

import java.util.Scanner;

public class SwitchComBreak {
    public static void main(String[] args) {
    	Scanner entrada =new Scanner(System.in);
    	
    	String conceito ="";
    	System.out.println("Informe a nota em Numeros:");
    	int nota = entrada.nextInt();
    	
    	switch (nota) {
    	case 10:
    		conceito ="A";
    	case 9:
    		conceito ="-A";
    	case 8:
    		conceito ="B";
    	case 7:
    		conceito ="-B";
    	case 6:
    		conceito ="C";
    	case 5:
    		conceito ="-C";
    	case 4:
    		conceito ="D";
    	case 3:
    		conceito ="-D";
    	case 2:
    		conceito ="E";
    	case 1:
    		conceito ="F";
    	case 0:
    		conceito ="Se Ferrou!!!";
    		break;
    	default:
    		conceito = "Valor Invalido, digite N° de 0 a 10 ";
    	}
    	 System.out.println(" O conceiro foi: " + conceito);
		entrada.close();
	}
}
